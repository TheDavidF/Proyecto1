/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalla;

import Controlador.Boot;
import Controlador.Tienda;
import SuperAutoPets.Mascota.Mascota;
import SuperAutoPets.Player.JugadorP;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author canof
 */
public class Batalla  {
    private int ter = 1;
    private int rondas = 1;
    Tienda tienda = new Tienda();
    Boot boot = new Boot();
    JugadorP jugador = new JugadorP(1,25,10,0);
    private static Scanner sn = new Scanner(System.in);
    private static Random random = new Random();
       


    public void batalla(){
        Mascota[] mazo = tienda.menuCompraInicial(ter);
            System.out.println("-----Mazo de Jugador 1-----");
            System.out.println("");
            tienda.pintarMazoFinal(mazo);
            System.out.println("");
            System.out.println("-----Mazo Jugador 2-----");
            System.out.println("");
            Mascota[] mazoBoot = boot.generarMazoBoot(rondas);
            boot.pintarMazoBoot(mazoBoot);
            System.out.println("");
            pausar();
            atacarInicio(mazo, mazoBoot);
            atacarInicio(mazoBoot, mazo);
            System.out.println("");
            System.out.println("-----------Batalla-----------");
            System.out.println("");
            pausar();
            atacar(mazo,mazoBoot);
            System.out.println("-----Mazo de Jugador 1-----");
            System.out.println("");
            tienda.pintarMazoFinal(mazo);
            System.out.println("");
            System.out.println("-----Mazo Jugador 2-----");
            System.out.println("");
            boot.pintarMazoBoot(mazoBoot);
            pausar();
            System.out.println("");
            validarGanador(mazo, mazoBoot, rondas);
    }


    private void pausar(){
        System.out.println("Pulse enter para continuar...");
        sn.nextLine();
    }
    private void atacar(Mascota[] mazo, Mascota[] mazoBoot){
        for (int i = 4; i >= 0; i--) {
            if(mazo[i] != null){
                int j = 0;
                for (j = 0; j < mazoBoot.length; j++) {
                    if(mazoBoot[j] != null){
                        int ataque1 = mazo[i].getPunch();
                        int ataque2 = mazoBoot[j].getPunch();
                        int vida1 = mazo[i].getPuntosDeVida();
                        int vida2 = mazoBoot[j].getPuntosDeVida();
                        System.out.println(mazo[i].getNombreMascota() +" y "+ mazoBoot[j].getNombreMascota() + " se atacan");
                        pausar();
                        mazo[i].setPuntosDeVida(vida1 - ataque2);
                        System.out.println(mazo[i].getNombreMascota()+" recibió "+ ataque2 +" de daño");
                        activarHabilidadMorir(mazo, mazoBoot, tienda);
                        validarVidaB(mazo);
                        System.out.println("y");
                        mazoBoot[j].setPuntosDeVida(vida2 - ataque1);
                        System.out.println(mazoBoot[j].getNombreMascota()+" recibió "+ ataque1 +" de daño");
                        activarHabilidadMorir(mazoBoot, mazo, tienda);
                        validarVidaB(mazoBoot);
                        pausar();
                        if(mazoBoot[j] == null || mazoBoot[j].getPuntosDeVida() <= 0){
                            j = j +1;
                        }else{
                            j = j;
                        }
                        break;
                    }
                }
                if(mazo[i] != null){
                    i = i + 1;
                }else {
                    i = i;
                }
            }
        }

    }
    private void validarGanador(Mascota[] mazo, Mascota[] mazoBoot, int rondas){
        int mascotasVivas1 = 0;
        int mascotasVivas2 = 0;
        for (int i = 0; i < 5; i++) {
            if(mazoBoot[i] != null){
                mascotasVivas2++;
            }   
        }
        for (int j = 0; j < 5; j++) {
            if(mazo[j] != null){
                mascotasVivas1++;
            }  
        }
        if(mascotasVivas1 == 0 && mascotasVivas2 == 0){
            System.out.println("Empate");
        }else if(mascotasVivas1 > mascotasVivas2){
            System.out.println("Gana el jugador 1");
            jugador.setTrofeos(jugador.getTrofeos() + 1);
            if(rondas == 1 || rondas == 2 || rondas == 3){
                jugador.setVidas(jugador.getVidas() -1);
                    if(jugador.getVidas() < 0){
                        jugador.setVidas(0);
                        System.out.println("-----Ha perdido la partida-----");
                    }
            }else if(rondas == 4 || rondas == 5 || rondas == 6){
                jugador.setVidas(jugador.getVidas() -2);
                    if(jugador.getVidas() < 0){
                        jugador.setVidas(0);
                        System.out.println("-----Ha perdido la partida-----");
                    }

            }else if(rondas >= 7){
                jugador.setVidas(jugador.getVidas() -3);
                    if(jugador.getVidas() < 0){
                        jugador.setVidas(0);
                        System.out.println("-----Ha perdido la partida-----");
                    }
            }
        }else{
            System.out.println("Gana el jugador 2");
        }
    }
  
    public void atacarInicio(Mascota[] mazo, Mascota[] mazoBoot){
        for (int i = 4; i >= 0; i--) {
            if(mazo[i] != null){
                if("mosquito".equals(mazo[i].getNombreMascota())){
                    int recibir = random.nextInt(4)+0;
                    while(mazoBoot[recibir] == null){
                        recibir = random.nextInt(4)+0;
                    }
                    if(mazo[i].getNivelMascota() == 1){
                        mazoBoot[recibir].setPuntosDeVida(mazoBoot[recibir].getPuntosDeVida() - 1);
                        System.out.println("Piquete incial, "+ mazoBoot[recibir].getNombreMascota() +" recibe 1 de daño" );
                        activarHabilidadMorir(mazoBoot, mazo, tienda);
                        validarVidaB(mazoBoot);
                        pausar();
                    }else if(mazo[i].getNivelMascota() == 2){
                        mazoBoot[recibir].setPuntosDeVida(mazoBoot[recibir].getPuntosDeVida() - 2);
                        System.out.println("Piquete incial, "+ mazoBoot[recibir].getNombreMascota() +" recibe 2 de daño" );
                        activarHabilidadMorir(mazoBoot, mazo, tienda);
                        validarVidaB(mazoBoot);
                        pausar();
                    }else if(mazo[i].getNivelMascota() == 3){
                        mazoBoot[recibir].setPuntosDeVida(mazoBoot[recibir].getPuntosDeVida() - 3);
                        System.out.println("Piquete incial, "+ mazoBoot[recibir].getNombreMascota() +" recibe 3 de daño" );
                        activarHabilidadMorir(mazoBoot, mazo, tienda);
                        validarVidaB(mazoBoot);
                        pausar();
                    }
                }else if("dodo".equals(mazo[i].getNombreMascota())){
                    if (i+1 <= 4){
                        if(mazo[i+1] != null){
                            if(mazo[i].getNivelMascota() == 1){
                                mazo[i+1].setPunch(mazo[i+1].getPunch() + 1);
                                System.out.println("Dodo: "+mazo[i+1].getNombreMascota()+" recibe 1 punto de ataque");
                                pausar();
                            }else if(mazo[i].getNivelMascota() == 2){
                                mazo[i+1].setPunch(mazo[i+1].getPunch() + 2);
                                System.out.println("Dodo: "+mazo[i+1].getNombreMascota()+" recibe 2 punto de ataque");
                                pausar();
                            }else if(mazo[i].getNivelMascota() == 3){
                                mazo[i+1].setPunch(mazo[i+1].getPunch() + 3);
                                System.out.println("Dodo: "+mazo[i+1].getNombreMascota()+" recibe 3 punto de ataque");
                                pausar();
                            }
                        }
                    }
                }else if("elefante".equals(mazo[i].getNombreMascota())){
                    if(mazo[i].getNivelMascota() == 1){
                        if(i-1 >= 0){
                            if(mazo[i-1] != null){
                                mazo[i-1].setPuntosDeVida(mazo[i-1].getPuntosDeVida() -1);
                                System.out.println("Daño colateral: "+ mazo[i-1].getNivelMascota() + " recibe 1 de daño.");
                                activarHabilidadMorir(mazoBoot, mazo, tienda);
                                validarVidaB(mazoBoot);
                                pausar();
                            }
                        } 
                    }else if(mazo[i].getNivelMascota() == 2){
                        if(i-1 >= 0){
                            if(mazo[i-1] != null){
                                mazo[i-1].setPuntosDeVida(mazo[i-1].getPuntosDeVida() -1);
                                System.out.println("Daño colateral: "+ mazo[i-1].getNivelMascota() + " recibe 1 de daño.");
                                activarHabilidadMorir(mazoBoot, mazo, tienda);
                                validarVidaB(mazoBoot);
                                pausar();
                            }
                        } 
                        if(i-2 >= 0){
                            if(mazo[i-2] != null){
                                mazo[i-2].setPuntosDeVida(mazo[i-2].getPuntosDeVida() -1);
                                System.out.println("Daño colateral: "+ mazo[i-1].getNivelMascota() + " recibe 1 de daño.");
                                activarHabilidadMorir(mazoBoot, mazo, tienda);
                                validarVidaB(mazoBoot);
                                pausar();
                            }
                        }
                    }else if(mazo[i].getNivelMascota() == 3){
                        if(i-1 >= 0){
                            if(mazo[i-1] != null){
                                mazo[i-1].setPuntosDeVida(mazo[i-1].getPuntosDeVida() -1);
                                System.out.println("Daño colateral: "+ mazo[i-1].getNivelMascota() + " recibe 1 de daño.");
                                activarHabilidadMorir(mazoBoot, mazo, tienda);
                                validarVidaB(mazoBoot);
                                pausar();
                            }
                        } 
                        if(i-2 >= 0){
                            if(mazo[i-2] != null){
                                mazo[i-2].setPuntosDeVida(mazo[i-2].getPuntosDeVida() -1);
                                System.out.println("Daño colateral: "+ mazo[i-1].getNivelMascota() + " recibe 1 de daño.");
                                activarHabilidadMorir(mazoBoot, mazo, tienda);
                                validarVidaB(mazoBoot);
                                pausar();
                            }
                        }
                        if(i-3 >= 0){
                            if(mazo[i-3] != null){
                                mazo[i-3].setPuntosDeVida(mazo[i-3].getPuntosDeVida() -1);
                                System.out.println("Daño colateral: "+ mazo[i-1].getNivelMascota() + " recibe 1 de daño.");
                                activarHabilidadMorir(mazoBoot, mazo, tienda);
                                validarVidaB(mazoBoot);
                                pausar();
                            } 
                        }
                    } 
                }else if("jirafa".equals(mazo[i].getNombreMascota())){
                    if(mazo[i].getNivelMascota() == 1){
                        if (i+1 <= 4){
                            if(mazo[i+1] != null){
                                mazo[i+1].setPunch(mazo[i+1].getPunch() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+1].getNombreMascota() + " recibe 1 punto de daño.");
                                mazo[i+1].setPuntosDeVida(mazo[i+1].getPuntosDeVida() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+1].getNombreMascota() + " recibe 1 punto de vida.");
                                pausar();
                            } 
                        }
                    }else if (mazo[i].getNivelMascota() == 2){
                        if (i+1 <= 4){
                            if(mazo[i+1] != null){
                                mazo[i+1].setPunch(mazo[i+1].getPunch() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+1].getNombreMascota() + " recibe 1 punto de daño.");
                                mazo[i+1].setPuntosDeVida(mazo[i+1].getPuntosDeVida() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+1].getNombreMascota() + " recibe 1 punto de vida.");
                                pausar();
                            } 
                        }
                        if((i+2) <= 4){
                            if(mazo[i+2] != null){
                                mazo[i+2].setPunch(mazo[i+2].getPunch() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+2].getNombreMascota() + " recibe 1 punto de daño.");
                                mazo[i+2].setPuntosDeVida(mazo[i+2].getPuntosDeVida() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+2].getNombreMascota() + " recibe 1 punto de vida.");
                                pausar();
                            } 
                        }
                    }else if (mazo[i].getNivelMascota() == 3){
                        if (i+1 <= 4){
                            if(mazo[i+1] != null){
                                mazo[i+1].setPunch(mazo[i+1].getPunch() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+1].getNombreMascota() + " recibe 1 punto de daño.");
                                mazo[i+1].setPuntosDeVida(mazo[i+1].getPuntosDeVida() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+1].getNombreMascota() + " recibe 1 punto de vida.");
                                pausar();
                            } 
                        }
                        if((i+2) <= 4){
                            if(mazo[i+2] != null){
                                mazo[i+2].setPunch(mazo[i+2].getPunch() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+2].getNombreMascota() + " recibe 1 punto de daño.");
                                mazo[i+2].setPuntosDeVida(mazo[i+2].getPuntosDeVida() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+2].getNombreMascota() + " recibe 1 punto de vida.");
                                pausar();
                            } 
                        }
                        if((i+3) <= 4){
                            if(mazo[i+3] != null){
                                mazo[i+3].setPunch(mazo[i+3].getPunch() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+3].getNombreMascota() + " recibe 1 punto de daño.");
                                mazo[i+3].setPuntosDeVida(mazo[i+3].getPuntosDeVida() + 1);
                                System.out.println("Fortaleza Aliada: "+ mazo[i+1].getNombreMascota() + " recibe 1 punto de vida.");
                                pausar();
                            }   
                        }
                    } 
                }else if("ballena".equals(mazo[i].getNombreMascota())){
                    if(mazo[i].getNivelMascota() == 1){
                        if((i+1) <= 4){
                            if(mazo[i+1] != null){
                                mazo[i+1].setNivelMascota(1);
                                System.out.println("Succión: A "+mazo[i+1].getNombreMascota() + " lo escupe ballena con nivel 1");
                                pausar();
                            }
                        }
                    }else if(mazo[i].getExperiencia() == 2){
                        if((i+1) <= 4){
                            if(mazo[i+1] != null){
                                mazo[i+1].setNivelMascota(1);
                                System.out.println("Succión: A "+mazo[i+1].getNombreMascota() + " lo escupe ballena con nivel 1");
                                pausar();
                            }
                        }
                    }else if(mazo[i].getExperiencia() == 3){
                        if((i+1) <= 4){
                            if(mazo[i+1] != null){
                                mazo[i+1].setNivelMascota(1);
                                System.out.println("Succión: A "+mazo[i+1].getNombreMascota() + " lo escupe ballena con nivel 1");
                                pausar();
                            }
                        }
                    }
                }else if("leopardo".equals(mazo[i].getNombreMascota())){
                    if(mazo[i].getNivelMascota() == 1){
                        int recibe = random.nextInt(4) + 0;
                        if(mazoBoot[recibe] != null){
                            mazoBoot[recibe].setPuntosDeVida(mazoBoot[recibe].getPuntosDeVida() - 1);
                            System.out.println("Zarpazo: "+ mazoBoot[recibe].getNombreMascota() + " recibe 50% de daño");
                            activarHabilidadMorir(mazoBoot, mazo, tienda);
                            validarVidaB(mazoBoot);
                            pausar();
                        } 
                    }else if(mazo[i].getNivelMascota() == 2){
                        int recibe = random.nextInt(4) + 0;
                        int recibe2 = random.nextInt(4) + 0;
                        while (recibe2 == recibe){
                            recibe2 = random.nextInt(4) + 0;
                        }
                        if(mazoBoot[recibe] != null){
                            mazoBoot[recibe].setPuntosDeVida(mazoBoot[recibe].getPuntosDeVida() - 1);
                            System.out.println("Zarpazo: "+ mazoBoot[recibe].getNombreMascota() + " recibe 50% de daño");
                            activarHabilidadMorir(mazoBoot, mazo, tienda);
                            validarVidaB(mazoBoot);
                            pausar();
                        }
                        if(mazoBoot[recibe2] != null){
                            mazoBoot[recibe2].setPuntosDeVida(mazoBoot[recibe2].getPuntosDeVida() - 1);
                            System.out.println("Zarpazo: "+ mazoBoot[recibe2].getNombreMascota() + " recibe 50% de daño");
                            activarHabilidadMorir(mazoBoot, mazo, tienda);
                            validarVidaB(mazoBoot);
                            pausar();
                        }
                    }else if(mazo[i].getNivelMascota() == 3){
                        int recibe = random.nextInt(4) + 0;
                        int recibe2 = random.nextInt(4) + 0;
                        while (recibe2 == recibe){
                            recibe2 = random.nextInt(4) + 0;
                        }
                        int recibe3 = random.nextInt(4)+0;
                        while (recibe3 == recibe2 || recibe3 == recibe){
                            recibe3 = random.nextInt(4)+0;
                        }
                        if(mazoBoot[recibe] != null){
                            mazoBoot[recibe].setPuntosDeVida(mazoBoot[recibe].getPuntosDeVida() - 1);
                            System.out.println("Zarpazo: "+ mazoBoot[recibe].getNombreMascota() + " recibe 50% de daño");
                            activarHabilidadMorir(mazoBoot, mazo, tienda);
                            validarVidaB(mazoBoot);
                            pausar();
                        }
                        if(mazoBoot[recibe2] != null){
                            mazoBoot[recibe2].setPuntosDeVida(mazoBoot[recibe2].getPuntosDeVida() - 1);
                            System.out.println("Zarpazo: "+ mazoBoot[recibe2].getNombreMascota() + " recibe 50% de daño");
                            activarHabilidadMorir(mazoBoot, mazo, tienda);
                            validarVidaB(mazoBoot);
                            pausar();
                        }
                        if(mazoBoot[recibe3] != null){
                            mazoBoot[recibe3].setPuntosDeVida(mazoBoot[recibe3].getPuntosDeVida() - 1);
                            System.out.println("Zarpazo: "+ mazoBoot[recibe3].getNombreMascota() + " recibe 50% de daño");
                            activarHabilidadMorir(mazoBoot, mazo, tienda);
                            validarVidaB(mazoBoot);
                            pausar();
                        }
                    }
                }else if("delfin".equals(mazo[i].getNombreMascota())){
                    int indiceSalud = 0;
                    for (int j = 0; j < mazoBoot.length; j++) {
                        if(mazoBoot[i] != null){
                            if(i == 0){
                                indiceSalud = i;
                            }else if(mazoBoot[i].getPuntosDeVida() < mazoBoot[i-1].getPuntosDeVida() && mazoBoot[i-1] != null){
                                indiceSalud = i;
                            }
                        }
                    }
                    if(mazoBoot[i].getNivelMascota() == 1){
                        mazoBoot[indiceSalud].setPuntosDeVida(mazo[indiceSalud].getPuntosDeVida() - 5);
                        System.out.println("Salpicón: delfin reparte 5 de daño a "+ mazoBoot[indiceSalud].getNombreMascota());
                        activarHabilidadMorir(mazoBoot, mazo, tienda);
                        validarVidaB(mazoBoot);
                        pausar();
                    }else if(mazoBoot[i].getNivelMascota() == 2){
                        mazoBoot[indiceSalud].setPuntosDeVida(mazo[indiceSalud].getPuntosDeVida() - 10);
                        System.out.println("Salpicón: delfin reparte 10 de daño a "+ mazoBoot[indiceSalud].getNombreMascota());
                        activarHabilidadMorir(mazoBoot, mazo, tienda);
                        validarVidaB(mazoBoot);
                        pausar();
                    }else if(mazoBoot[i].getNivelMascota() == 3){
                        mazoBoot[indiceSalud].setPuntosDeVida(mazo[indiceSalud].getPuntosDeVida() - 15);
                        System.out.println("Salpicón: delfin reparte 15 de daño a "+ mazoBoot[indiceSalud].getNombreMascota());
                        activarHabilidadMorir(mazoBoot, mazo, tienda);
                        validarVidaB(mazoBoot);
                        pausar();
                    }
                }
            }
        }//fin fori
    }

    public void validarVidaB(Mascota[] mazoBoot){
        for (int i = 0; i < mazoBoot.length; i++) {
            if(mazoBoot[i] != null){
                if(mazoBoot[i].getPuntosDeVida() == 0 || mazoBoot[i].getPuntosDeVida() < 0){
                    System.out.println(mazoBoot[i].getNombreMascota() +" ha muerto...");
                    mazoBoot[i] = null;
                }
            }
        }
    }
    public void activarHabilidadMorir(Mascota[] mazoBoot, Mascota[] mazo, Tienda tienda){
        for (int i = 0; i < mazoBoot.length; i++) {
            if(mazoBoot[i] != null){
                if(mazoBoot[i].getPuntosDeVida() == 0 || mazoBoot[i].getPuntosDeVida() < 0 ){
                    if("hormiga".equals(mazoBoot[i].getNombreMascota())){
                        if(mazoBoot[i].getNivelMascota() == 1){
                            int uno = random.nextInt(4)+0;
                            while(mazoBoot[uno] == null){
                                uno = random.nextInt(4)+0;
                            }
                            mazoBoot[uno].setPunch(mazoBoot[uno].getPunch() +2);
                            mazoBoot[uno].setPuntosDeVida(mazoBoot[uno].getPuntosDeVida() +1);
                            System.out.println("Compañerismo: "+ mazoBoot[uno].getNombreMascota() +" recibe +2 de daño y +1 de vida");
                        }else if(mazoBoot[i].getNivelMascota() == 2){
                            int uno = random.nextInt(4)+0;
                            while(mazoBoot[uno] == null){
                                uno = random.nextInt(4)+0;
                            }
                            mazoBoot[uno].setPunch(mazoBoot[uno].getPunch() +4);
                            mazoBoot[uno].setPuntosDeVida(mazoBoot[uno].getPuntosDeVida() +2);
                            System.out.println("Compañerismo: "+ mazoBoot[uno].getNombreMascota() +" recibe +4 de daño y +2 de vida");
                        }else if(mazoBoot[i].getNivelMascota() == 3){
                            int uno = random.nextInt(4)+0;
                            while(mazoBoot[uno] == null){
                                uno = random.nextInt(4)+0;
                            }
                            mazoBoot[uno].setPunch(mazoBoot[uno].getPunch() +6);
                            mazoBoot[uno].setPuntosDeVida(mazoBoot[uno].getPuntosDeVida() +3);
                            System.out.println("Compañerismo: "+ mazoBoot[uno].getNombreMascota() +" recibe +6 de daño y +3 de vida");
                        }
                    }else if("grillo".equals(mazoBoot[i].getNombreMascota())){
                        if(mazoBoot[i].getNivelMascota() == 1){
                            mazoBoot[i].setNombreMascota("grillo zombie");
                            mazoBoot[i].setPuntosDeVida(1);
                            mazoBoot[i].setPunch(1);
                            System.out.println("grillo muere..");
                            System.out.println("Zombificación: invocación grillo zombie");
                        }else if(mazoBoot[i].getNivelMascota() == 2){
                            mazoBoot[i].setNombreMascota("grillo zombie");
                            mazoBoot[i].setPuntosDeVida(2);
                            mazoBoot[i].setPunch(2);
                            System.out.println("grillo muere..");
                            System.out.println("Zombificación: invocación grillo zombie");
                        }else if(mazoBoot[i].getNivelMascota() == 3){
                            mazoBoot[i].setNombreMascota("grillo zombie");
                            mazoBoot[i].setPuntosDeVida(3);
                            mazoBoot[i].setPunch(3);
                            System.out.println("grillo muere..");
                            System.out.println("Zombificación: invocación grillo zombie");
                            //agregar beneficos caballo, pavo
                        }
                    }else if("puerco espin".equals(mazoBoot[i].getNombreMascota())){
                        for (int j = 0; j < mazoBoot.length; j++) {
                            if(mazoBoot[j] != null){
                                if(mazoBoot[i].getNivelMascota() == 1){
                                    mazoBoot[j].setPunch(mazoBoot[j].getPunch() + 2);
                                }else if(mazoBoot[i].getNivelMascota() == 2){
                                    mazoBoot[j].setPunch(mazoBoot[j].getPunch() + 4);
                                }else if(mazoBoot[i].getNivelMascota() == 3){
                                    mazoBoot[j].setPunch(mazoBoot[j].getPunch() + 6);
                                }
                            }
                        }
                        System.out.println("Espinas salvajes: reparte puntos de daño a todos los amigos");
                    }else if("rata".equals(mazoBoot[i].getNombreMascota())){
                        for (int j = 4; j > 0; j--) {
                            int k;
                            if(mazo[j] == null){
                                if(mazoBoot[i].getNivelMascota() == 1){
                                    for ( k = 0; k < 1; k++) {
                                        mazo[j] = new Mascota(1,"dirty rata", " terrestre "+"solitario", 1, 1, null, 1);
                                        System.out.println("rata muere..");
                                        System.out.println("Ayuda hipócrita: invoca a una Dirty rata");
                                        k = 1;
                                    }  
                                }else if(mazoBoot[i].getNivelMascota() == 2){
                                    for (k = 0; k < 2; k++) {
                                        mazo[j] = new Mascota(1,"rata", " terrestre "+"solitario", 1, 1, null, 1);
                                        k = k + 1;                             
                                    }
                                    System.out.println("rata muere..");
                                    System.out.println("Ayuda hipócrita: invoca a dos Dirty rata");
                                }else if(mazoBoot[i].getNivelMascota() == 3){
                                    for ( k = 0; k < 3; k++) {
                                        mazo[j] = new Mascota(1,"rata", "terrestre "+" solitario", 1, 1, null, 1);
                                        k = k + 1;                             
                                    }
                                    System.out.println("rata muere..");
                                    System.out.println("Ayuda hipócrita: invoca a tres Dirty rata");
                                }
                            }   
                        }
                    }else if("arana".equals(mazoBoot[i].getNombreMascota())){
                        if(mazoBoot[i].getNivelMascota() == 1){
                            mazoBoot[i] = new Mascota(1,"rata","terrestre "+" solitario",1,1,null,1);
                            System.out.println("araña muere..");
                            System.out.println("Liberacion: invoca a una rata.");
                        }else if(mazoBoot[i].getNivelMascota() == 2){
                            mazoBoot[i] = new Mascota(1,"rata","terrestre "+"solitario",2,2,null,2);
                            System.out.println("araña muere..");
                            System.out.println("Liberacion: invoca a una rata.");
                        }else if(mazoBoot[i].getNivelMascota() == 3){
                            mazoBoot[i] = new Mascota(0,"rata","terrestre "+"solitario",3,3,null,3);
                            System.out.println("araña muere..");
                            System.out.println("Liberacion: invoca a una rata.");
                        }
                    }else if("mapache".equals(mazoBoot[i].getNombreMascota())){
                        if(mazoBoot[i].getNivelMascota() == 1){
                            if((i-1) >= 0){
                                if(mazoBoot[i-1] != null){
                                    mazoBoot[i-1].setPunch(mazoBoot[i-1].getPunch() + 1);
                                    System.out.println("mapache muere..");
                                    System.out.println("Repartir poder: mapache otorga +1 de daño a las mascotas adyacentes");
                                }
                                if((i+1) <= 4){
                                    if(mazoBoot[i+1] != null){
                                        mazoBoot[i+1].setPunch(mazoBoot[i+1].getPunch() + 1);
                                        System.out.println("mapache muere..");
                                        System.out.println("Repartir poder: mapache otorga +1 de daño a las mascotas adyacentes");
                                    }
                                }
                            }
                        }else if(mazoBoot[i].getNivelMascota() == 2){
                            if((i-1) >= 0){
                                if(mazoBoot[i-1] != null){
                                    mazoBoot[i-1].setPunch(mazoBoot[i-1].getPunch() + 2);
                                    System.out.println("mapache muere..");
                                    System.out.println("Repartir poder: mapache otorga +1 de daño a las mascotas adyacentes");
                                }
                            }   
                            if((i+1) <= 4){
                                if(mazoBoot[i+1] != null){
                                    mazoBoot[i+1].setPunch(mazoBoot[i+1].getPunch() + 2);
                                    System.out.println("mapache muere..");
                                    System.out.println("Repartir poder: mapache otorga +2 de daño a las mascotas adyacentes");
                                }
                            }
                        }else if(mazoBoot[i].getNivelMascota() == 3){
                            if((i-1) >= 0){
                                if(mazoBoot[i-1] != null){
                                    mazoBoot[i-1].setPunch(mazoBoot[i-1].getPunch() + 3);
                                    System.out.println("mapache muere..");
                                    System.out.println("Repartir poder: mapache otorga +3 de daño a las mascotas adyacentes");
                                }
                            }
                            if((i+1) <= 4){
                                if(mazoBoot[i+1] != null){
                                    mazoBoot[i+1].setPunch(mazoBoot[i+1].getPunch() + 3);
                                    System.out.println("mapache muere..");
                                    System.out.println("Repartir poder: mapache otorga +3 de daño a las mascotas adyacentes");
                                }
                            }
                        }
                    }else if("tortuga".equals(mazoBoot[i].getNombreMascota())){
                        if(mazoBoot[i].getNivelMascota() == 1){
                            if((i-1) >= 0){
                                if(mazoBoot[i-1] != null){
                                    mazoBoot[i-1].setComida(tienda.getComidaTer7(13));
                                    System.out.println("Proteccion aliada: da a amigos melón armor");
                                }           
                            }
                        }else if(mazoBoot[i].getNivelMascota() == 2){
                            if((i-1) >= 0){
                                if(mazoBoot[i-1] != null){
                                    mazoBoot[i-1].setComida(tienda.getComidaTer7(13));
                                    System.out.println("Proteccion aliada: da a amigos melón armor");
                                }           
                            }
                            if((i-2) >= 0){
                                if(mazoBoot[i-2] != null){
                                    mazoBoot[i-2].setComida(tienda.getComidaTer7(13));
                                    System.out.println("Proteccion aliada: da a amigos melón armor");
                                }           
                            }
                        }else if(mazoBoot[i].getNivelMascota() == 3){
                            if((i-1) >= 0){
                                if(mazoBoot[i-1] != null){
                                    mazoBoot[i-1].setComida(tienda.getComidaTer7(13));
                                    System.out.println("Proteccion aliada: da a amigos melón armor");
                                }           
                            }
                            if((i-2) >= 0){
                                if(mazoBoot[i-2] != null){
                                    mazoBoot[i-2].setComida(tienda.getComidaTer7(13));
                                    System.out.println("Proteccion aliada: da a amigos melón armor");
                                }           
                            }
                            if((i-3) >= 0){
                                if(mazoBoot[i-3] != null){
                                    mazoBoot[i-3].setComida(tienda.getComidaTer7(13));
                                    System.out.println("Proteccion aliada: da a amigos melón armor");
                                }           
                            }
                        }
                    }else if("oveja".equals(mazoBoot[i].getNombreMascota())){
                        if(mazoBoot[i].getNivelMascota() == 1){
                            mazoBoot[i].setPuntosDeVida(2);
                            mazoBoot[i].setPunch(2);
                            if((i+1) <= 4 ){
                                if(mazoBoot[i+1] != null){
                                mazoBoot[i+1].setPuntosDeVida(2);
                                mazoBoot[i+1].setPunch(2);
                                mazoBoot[i+1].setNombreMascota("carnero");
                                }
                            }
                            System.out.println("oveja muere..");
                            System.out.println("Revolución: invoca carneros");
                        }else if(mazoBoot[i].getNivelMascota() == 2){
                            mazoBoot[i].setPuntosDeVida(4);
                            mazoBoot[i].setPunch(4);
                            if((i+1) <= 4 ){
                                if(mazoBoot[i+1] != null){
                                mazoBoot[i+1].setPuntosDeVida(4);
                                mazoBoot[i+1].setPunch(4);
                                mazoBoot[i+1].setNombreMascota("carnero");
                                }
                            }
                            System.out.println("oveja muere..");
                            System.out.println("Revolución: invoca carneros");
                        }else if(mazoBoot[i].getNivelMascota() == 3){
                            mazoBoot[i].setPuntosDeVida(6);
                            mazoBoot[i].setPunch(6);
                            if((i+1) <= 4 ){
                                if(mazoBoot[i+1] != null){
                                mazoBoot[i+1].setPuntosDeVida(6);
                                mazoBoot[i+1].setPunch(6);
                                mazoBoot[i+1].setNombreMascota("carnero");
                                }
                            }
                            System.out.println("oveja muere..");
                            System.out.println("Revolución: invoca carneros");
                        }
                    }else if("venado".equals(mazoBoot[i].getNombreMascota())){
                        if(mazoBoot[i].getNivelMascota() == 1){
                            mazoBoot[i] = new Mascota(1,"camion",null,5,5,null,1);
                            mazoBoot[i].setComida(tienda.getComidaTer7(10));
                            System.out.println("venado muere..");
                            System.out.println("Venganza: invoca a un autobus");
                        }else if(mazoBoot[i].getNivelMascota() == 1){
                            mazoBoot[i] = new Mascota(1,"camion",null,10,10,null,1);
                            mazoBoot[i].setComida(tienda.getComidaTer7(10));
                            System.out.println("venado muere..");
                            System.out.println("Venganza: invoca a un autobus");
                        }else if(mazoBoot[i].getNivelMascota() == 3){
                            mazoBoot[i] = new Mascota(1,"camion",null,15,15,null,1);
                            mazoBoot[i].setComida(tienda.getComidaTer7(10));
                            System.out.println("venado muere..");
                            System.out.println("Venganza: invoca a un autobus");
                        }
                    }
                }
            }
        }
    }

}

