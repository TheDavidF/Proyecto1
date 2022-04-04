/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import SuperAutoPets.Comida.Comida;
import SuperAutoPets.Mascota.Mascota;
import java.util.Random;
import java.util.Scanner;

public class Tienda {
    protected int oro = 10;
    protected int rondas = 1;
    Random random = new Random();
    protected Mascota[] animalesTienda = new Mascota[5];
    protected Mascota[] mazo = new Mascota[5];
    protected Comida[] comidaTienda = new Comida[2];

  

        //mascotas ter 1 
    protected Mascota mascotasTer1[] = {new Mascota(1, "caballo", "mamifero "+"domestico", 2, 1, null, 1),
    new Mascota(1, "hormiga", "insecto "+"terrestre", 2, 1, null, 1),
    new Mascota(1, "mosquito", "volador", 2, 2, null, 1),
    new Mascota(1, "grillo", "insecto" , 1, 2, null, 1),
    new Mascota(1, "castor", "terrestre "+"acuatico", 2, 2,null, 1),
    new Mascota(1, "nutria", "mamifero", 1, 2, null, 1),
    new Mascota(1, "escarabajo", "insecto", 2, 3,null, 1)};

    //mascotas ter 2
    protected Mascota mascotasTer2[] = {new Mascota(1, "caballo", "mamifero "+"domestico", 2, 1, null, 1),
    new Mascota(1, "hormiga", "insecto "+"terrestre", 2, 1,null, 1),
    new Mascota(1, "mosquito", "volador", 2, 2, null, 1),
    new Mascota(1, "grillo", "insecto" , 1, 2, null, 1),
    new Mascota(1, "castor", "terrestre "+"acuatico", 2, 2, null, 1),
    new Mascota(1, "nutria", "mamifero", 1, 2, null, 1),
    new Mascota(1, "escarabajo", "insecto", 2, 3, null, 1),
    new Mascota(1, "sapo", "terrestre "+"acuatico", 3, 3,null, 1),
    new Mascota(1, "dodo", "volador ", 2, 3, null, 1),
    new Mascota(1, "elefante", "mamifero "+"terrestre", 3, 5, null, 1),
    new Mascota(1, "puerco espin", "solitario "+"terrestre", 3, 2, null, 1),
    new Mascota(1, "pavoreal", "domestico "+"volador", 2, 5, null, 1),
    new Mascota(1, "rata", "terrestre "+"solitario", 4, 5, null, 1),
    new Mascota(1, "zorro", "terrestre "+"solitario", 5, 2, null, 1),
    new Mascota(1, "arana", "insecto", 2, 2, null, 1),};

    //mascotas ter 3
    protected Mascota mascotasTer3[] = {new Mascota(1, "caballo", "mamifero "+"domestico", 2, 1, null, 1),
    new Mascota(1, "hormiga", "insecto "+"terrestre", 2, 1, null, 1),
    new Mascota(1, "mosquito", "volador", 2, 2, null, 1),
    new Mascota(1, "grillo", "insecto" , 1, 2, null, 1),
    new Mascota(1, "castor", "terrestre "+"acuatico", 2, 2, null, 1),
    new Mascota(1, "nutria", "mamifero", 1, 2, null, 1),
    new Mascota(1, "escarabajo", "insecto", 2, 3, null, 1),
    new Mascota(1, "sapo", "terrestre "+"acuatico", 3, 3, null, 1),
    new Mascota(1, "dodo", "volador ", 2, 3, null, 1),
    new Mascota(1, "elefante", "mamifero "+"terrestre", 3, 5, null, 1),
    new Mascota(1, "puerco espin", "solitario "+"terrestre", 3, 2, null, 1),
    new Mascota(1, "pavoreal", "domestico "+"volador", 2, 5, null, 1),
    new Mascota(1, "rata", "terrestre "+"solitario", 4, 5, null, 1),
    new Mascota(1, "zorro", "terrestre "+"solitario", 5, 2, null, 1),
    new Mascota(1, "arana", "insecto", 2, 2, null, 1),
    new Mascota(1, "camello", "mamifero "+ "desertico", 2, 5, null, 1),
    new Mascota(1, "mapache", "solitario", 5, 4, null, 1),
    new Mascota(1, "jirafa", "mamifero "+ "terrestre", 2, 5, null, 1),
    new Mascota(1, "tortuga", "reptil", 1, 2, null, 1),
    new Mascota(1, "caracol", "insecto "+ "solitario", 2, 2, null, 1),
    new Mascota(1, "oveja", "domestico "+ "terrestre", 2, 2, null, 1),
    new Mascota(1, "lobo", "solitario "+ "terrestre", 3, 4, null, 1),
    new Mascota(1, "buey", "mamifero", 1, 4, null, 1),
    new Mascota(1, "canguro", "mamifero "+ "terrestre", 1, 2, null, 1),
    new Mascota(1, "buho", "solitario "+ "volador", 5, 3, null, 1),};

    //mascotas ter 4
    protected Mascota mascotasTer4[] = {new Mascota(1, "caballo", "mamifero "+"domestico", 2, 1, null, 1),
    new Mascota(1, "hormiga", "insecto "+"terrestre", 2, 1, null, 1),
    new Mascota(1, "mosquito", "volador", 2, 2, null, 1),
    new Mascota(1, "grillo", "insecto" , 1, 2, null, 1),
    new Mascota(1, "castor", "terrestre "+"acuatico", 2, 2, null, 1),
    new Mascota(1, "nutria", "mamifero", 1, 2, null, 1),
    new Mascota(1, "escarabajo", "insecto", 2, 3, null, 1),
    new Mascota(1, "sapo", "terrestre "+"acuatico", 3, 3, null, 1),
    new Mascota(1, "dodo", "volador ", 2, 3, null, 1),
    new Mascota(1, "elefante", "mamifero "+"terrestre", 3, 5, null, 1),
    new Mascota(1, "puerco espin", "solitario "+"terrestre", 3, 2, null, 1),
    new Mascota(1, "pavoreal", "domestico "+"volador", 2, 5, null, 1),
    new Mascota(1, "rata", "terrestre "+"solitario", 4, 5, null, 1),
    new Mascota(1, "zorro", "terrestre "+"solitario", 5, 2, null, 1),
    new Mascota(1, "arana", "insecto", 2, 2, null, 1),
    new Mascota(1, "camello", "mamifero "+ "desertico", 2, 5, null, 1),
    new Mascota(1, "mapache", "solitario", 5, 4, null, 1),
    new Mascota(1, "jirafa", "mamifero "+ "terrestre", 2, 5, null, 1),
    new Mascota(1, "tortuga", "reptil", 1, 2, null, 1),
    new Mascota(1, "caracol", "insecto "+ "solitario", 2, 2, null, 1),
    new Mascota(1, "oveja", "domestico "+ "terrestre", 2, 2, null, 1),
    new Mascota(1, "lobo", "solitario "+ "terrestre", 3, 4, null, 1),
    new Mascota(1, "buey", "mamifero", 1, 4, null, 1),
    new Mascota(1, "canguro", "mamifero "+ "terrestre", 1, 2, null, 1),
    new Mascota(1, "buho", "solitario "+ "volador", 5, 3, null, 1),
    new Mascota(1, "venado", "mamifero", 1, 1, null, 1),
    new Mascota(1, "loro", "volador", 5, 3, null, 1),
    new Mascota(1, "hipopotamo", "acuatico "+"terrestre", 4, 7, null, 1),
    new Mascota(1, "delfin", "acuatico", 4, 6, null, 1),
    new Mascota(1, "puma", "mamifero "+"terrestre", 3, 7, null, 1),
    new Mascota(1, "ballena", "acuatico", 3, 8, null, 1),
    new Mascota(1, "ardilla", "domestico", 2, 5, null, 1),
    new Mascota(1, "llama", "terrestre", 3, 6, null, 1),};

    //mascotas ter 5
    protected Mascota mascotasTer5[] = {new Mascota(1, "caballo", "mamifero "+"domestico", 2, 1, null, 1),
    new Mascota(1, "hormiga", "insecto "+"terrestre", 2, 1, null, 1),
    new Mascota(1, "mosquito", "volador", 2, 2, null, 1),
    new Mascota(1, "grillo", "insecto" , 1, 2, null, 1),
    new Mascota(1, "castor", "terrestre "+"acuatico", 2, 2, null, 1),
    new Mascota(1, "nutria", "mamifero", 1, 2, null, 1),
    new Mascota(1, "escarabajo", "insecto", 2, 3, null, 1),
    new Mascota(1, "sapo", "terrestre "+"acuatico", 3, 3, null, 1),
    new Mascota(1, "dodo", "volador ", 2, 3, null, 1),
    new Mascota(1, "elefante", "mamifero "+"terrestre", 3, 5, null, 1),
    new Mascota(1, "puerco espin", "solitario "+"terrestre", 3, 2, null, 1),
    new Mascota(1, "pavoreal", "domestico "+"volador", 2, 5, null, 1),
    new Mascota(1, "rata", "terrestre "+"solitario", 4, 5, null, 1),
    new Mascota(1, "zorro", "terrestre "+"solitario", 5, 2, null, 1),
    new Mascota(1, "arana", "insecto", 2, 2, null, 1),
    new Mascota(1, "camello", "mamifero "+ "desertico", 2, 5, null, 1),
    new Mascota(1, "mapache", "solitario", 5, 4, null, 1),
    new Mascota(1, "jirafa", "mamifero "+ "terrestre", 2, 5, null, 1),
    new Mascota(1, "tortuga", "reptil", 1, 2, null, 1),
    new Mascota(1, "caracol", "insecto "+ "solitario", 2, 2, null, 1),
    new Mascota(1, "oveja", "domestico "+ "terrestre", 2, 2, null, 1),
    new Mascota(1, "lobo", "solitario "+ "terrestre", 3, 4, null, 1),
    new Mascota(1, "buey", "mamifero", 1, 4, null, 1),
    new Mascota(1, "canguro", "mamifero "+ "terrestre", 1, 2, null, 1),
    new Mascota(1, "buho", "solitario "+ "volador", 5, 3, null, 1),
    new Mascota(1, "venado", "mamifero", 1, 1, null, 1),
    new Mascota(1, "loro", "volador", 5, 3, null, 1),
    new Mascota(1, "hipopotamo", "acuatico "+"terrestre", 4, 7, null, 1),
    new Mascota(1, "delfin", "acuatico", 4, 6, null, 1),
    new Mascota(1, "puma", "mamifero "+"terrestre", 3, 7, null, 1),
    new Mascota(1, "ballena", "acuatico", 3, 8, null, 1),
    new Mascota(1, "ardilla", "domestico", 2, 5, null, 1),
    new Mascota(1, "llama", "terrestre", 3, 6, null, 1),
    new Mascota(1, "foca", "acuatico "+"mamifero", 3, 8, null, 1),
    new Mascota(1, "jaguar", "mamifero "+"terrestre",7, 4, null, 1),
    new Mascota(1, "escorpion", "desertico "+"solitario", 1, 1, null, 1),
    new Mascota(1, "rinoceronte", "desertico "+"terrestre", 5, 8, null, 1),
    new Mascota(1, "mono", "mamifero", 1, 2, null, 1),
    new Mascota(1, "cocodrilo", "reptil "+"solitario", 8, 4, null, 1),
    new Mascota(1, "vaca","mamifero "+"terrestre", 4, 6, null, 1),
    new Mascota(1, "chompipe", "terrestre "+"volador", 3, 4, null, 1),};

    //mascotas ter 6
    protected Mascota mascotasTer6[] = {new Mascota(1, "caballo", "mamifero "+"domestico", 2, 1, null, 1),
    new Mascota(1, "hormiga", "insecto "+"terrestre", 2, 1, null, 1),
    new Mascota(1, "mosquito", "volador", 2, 2, null, 1),
    new Mascota(1, "grillo", "insecto" , 1, 2, null, 1),
    new Mascota(1, "castor", "terrestre "+"acuatico", 2, 2, null, 1),
    new Mascota(1, "nutria", "mamifero", 1, 2, null, 1),
    new Mascota(1, "escarabajo", "insecto", 2, 3, null, 1),
    new Mascota(1, "sapo", "terrestre "+"acuatico", 3, 3, null, 1),
    new Mascota(1, "dodo", "volador ", 2, 3, null, 1),
    new Mascota(1, "elefante", "mamifero "+"terrestre", 3, 5, null, 1),
    new Mascota(1, "puerco espin", "solitario "+"terrestre", 3, 2, null, 1),
    new Mascota(1, "pavoreal", "domestico "+"volador", 2, 5, null, 1),
    new Mascota(1, "rata", "terrestre "+"solitario", 4, 5, null, 1),
    new Mascota(1, "zorro", "terrestre "+"solitario", 5, 2, null, 1),
    new Mascota(1, "arana", "insecto", 2, 2, null, 1),
    new Mascota(1, "camello", "mamifero "+ "desertico", 2, 5, null, 1),
    new Mascota(1, "mapache", "solitario", 5, 4, null, 1),
    new Mascota(1, "jirafa", "mamifero "+ "terrestre", 2, 5, null, 1),
    new Mascota(1, "tortuga", "reptil", 1, 2, null, 1),
    new Mascota(1, "caracol", "insecto "+ "solitario", 2, 2, null, 1),
    new Mascota(1, "oveja", "domestico "+ "terrestre", 2, 2, null, 1),
    new Mascota(1, "lobo", "solitario "+ "terrestre", 3, 4, null, 1),
    new Mascota(1, "buey", "mamifero", 1, 4, null, 1),
    new Mascota(1, "canguro", "mamifero "+ "terrestre", 1, 2, null, 1),
    new Mascota(1, "buho", "solitario "+ "volador", 5, 3, null, 1),
    new Mascota(1, "venado", "mamifero", 1, 1, null, 1),
    new Mascota(1, "loro", "volador", 5, 3, null, 1),
    new Mascota(1, "hipopotamo", "acuatico "+"terrestre", 4, 7, null, 1),
    new Mascota(1, "delfin", "acuatico", 4, 6, null, 1),
    new Mascota(1, "puma", "mamifero "+"terrestre", 3, 7, null, 1),
    new Mascota(1, "ballena", "acuatico", 3, 8, null, 1),
    new Mascota(1, "ardilla", "domestico", 2, 5, null, 1),
    new Mascota(1, "llama", "terrestre", 3, 6, null, 1),
    new Mascota(1, "foca", "acuatico "+"mamifero", 3, 8, null, 1),
    new Mascota(1, "jaguar", "mamifero "+"terrestre",7, 4, null, 1),
    new Mascota(1, "escorpion", "desertico "+"solitario", 1, 1, null, 1),
    new Mascota(1, "rinoceronte", "desertico "+"terrestre", 5, 8, null, 1),
    new Mascota(1, "mono", "mamifero", 1, 2, null, 1),
    new Mascota(1, "cocodrilo", "reptil "+"solitario", 8, 4, null, 1),
    new Mascota(1, "vaca","mamifero "+"terrestre", 4, 6, null, 1),
    new Mascota(1, "panda", "mamifero "+"solitario", 5, 5, null, 1),
    new Mascota(1, "gato", "mamifero "+"domestico", 4, 5, null, 1),
    new Mascota(1, "tigre", "terrestre "+"mamifero", 4, 3, null, 1),
    new Mascota(1, "serpiente", "reptil "+"terrestre "+"desertico", 6, 6, null, 1),
    new Mascota(1, "mamut", "mamifero "+"terrestre "+"solitario", 3, 10, null, 1),
    new Mascota(1, "leopardo", "mamifero "+"terrestre", 10, 4, null, 1),
    new Mascota(1, "gorila", "mamifero "+"terrestre", 6, 9, null, 1),
    new Mascota(1, "pulpo", "acuatico "+"solitario", 8, 8, null, 1),
    new Mascota(1, "mosca", "volador "+"insecto", 5, 5, null, 1),};

    //mascotas ter 7
    protected Mascota mascotasTer7[] = {new Mascota(1, "caballo", "mamifero "+"domestico", 2, 1, null, 1),
    new Mascota(1, "hormiga", "insecto "+"terrestre", 2, 1, null, 1),
    new Mascota(1, "mosquito", "volador", 2, 2, null, 1),
    new Mascota(1, "grillo", "insecto" , 1, 2, null, 1),
    new Mascota(1, "castor", "terrestre "+"acuatico", 2, 2, null, 1),
    new Mascota(1, "nutria", "mamifero", 1, 2, null, 1),
    new Mascota(1, "escarabajo", "insecto", 2, 3, null, 1),
    new Mascota(1, "sapo", "terrestre "+"acuatico", 3, 3, null, 1),
    new Mascota(1, "dodo", "volador ", 2, 3, null, 1),
    new Mascota(1, "elefante", "mamifero "+"terrestre", 3, 5, null, 1),
    new Mascota(1, "puerco espin", "solitario "+"terrestre", 3, 2, null, 1),
    new Mascota(1, "pavoreal", "domestico "+"volador", 2, 5, null, 1),
    new Mascota(1, "rata", "terrestre "+"solitario", 4, 5, null, 1),
    new Mascota(1, "zorro", "terrestre "+"solitario", 5, 2, null, 1),
    new Mascota(1, "arana", "insecto", 2, 2, null, 1),
    new Mascota(1, "camello", "mamifero "+ "desertico", 2, 5, null, 1),
    new Mascota(1, "mapache", "solitario", 5, 4, null, 1),
    new Mascota(1, "jirafa", "mamifero "+ "terrestre", 2, 5, null, 1),
    new Mascota(1, "tortuga", "reptil", 1, 2, null, 1),
    new Mascota(1, "caracol", "insecto "+ "solitario", 2, 2, null, 1),
    new Mascota(1, "oveja", "domestico "+ "terrestre", 2, 2, null, 1),
    new Mascota(1, "lobo", "solitario "+ "terrestre", 3, 4, null, 1),
    new Mascota(1, "buey", "mamifero", 1, 4, null, 1),
    new Mascota(1, "canguro", "mamifero "+ "terrestre", 1, 2, null, 1),
    new Mascota(1, "buho", "solitario "+ "volador", 5, 3, null, 1),
    new Mascota(1, "venado", "mamifero", 1, 1, null, 1),
    new Mascota(1, "loro", "volador", 5, 3, null, 1),
    new Mascota(1, "hipopotamo", "acuatico "+"terrestre", 4, 7, null, 1),
    new Mascota(1, "delfin", "acuatico", 4, 6, null, 1),
    new Mascota(1, "puma", "mamifero "+"terrestre", 3, 7, null, 1),
    new Mascota(1, "ballena", "acuatico", 3, 8, null, 1),
    new Mascota(1, "ardilla", "domestico", 2, 5, null, 1),
    new Mascota(1, "llama", "terrestre", 3, 6, null, 1),
    new Mascota(1, "foca", "acuatico "+"mamifero", 3, 8, null, 1),
    new Mascota(1, "jaguar", "mamifero "+"terrestre",7, 4, null, 1),
    new Mascota(1, "escorpion", "desertico "+"solitario", 1, 1, null, 1),
    new Mascota(1, "rinoceronte", "desertico "+"terrestre", 5, 8, null, 1),
    new Mascota(1, "mono", "mamifero", 1, 2, null, 1),
    new Mascota(1, "cocodrilo", "reptil "+"solitario", 8, 4, null, 1),
    new Mascota(1, "vaca","mamifero "+"terrestre", 4, 6, null, 1),
    new Mascota(1, "chompipe", "terrestre "+"volador", 3, 4, null, 1),
    new Mascota(1, "panda", "mamifero "+"solitario", 5, 5, null, 1),
    new Mascota(1, "gato", "mamifero "+"domestico", 4, 5, null, 1),
    new Mascota(1, "tigre", "terrestre "+"mamifero", 4, 3, null, 1),
    new Mascota(1, "serpiente", "reptil "+"terrestre "+"desertico", 6, 6, null, 1),
    new Mascota(1, "mamut", "mamifero "+"terrestre "+"solitario", 3, 10, null, 1),
    new Mascota(1, "leopardo", "mamifero "+"terrestre", 10, 4, null, 1),
    new Mascota(1, "gorila", "mamifero "+"terrestre", 6, 9, null, 1),
    new Mascota(1, "pulpo", "acuatico "+"solitario", 8, 8, null, 1),
    new Mascota(1, "mosca", "volador "+"insecto", 5, 5, null, 1),
    new Mascota(1, "quetzal", "volador "+"solitario", 10, 10, null, 1),
    new Mascota(1, "camaleon", "reptil "+"solitario", 8, 8, null, 1),};


    public Mascota getAnimalesTienda(int i) {
        return animalesTienda[i];
    }
    public Mascota getMazo(int posicionMazo){
    return mazo[posicionMazo];
    }
    public void setAnimalesTienda(int posicion) {
        this.animalesTienda[posicion] = null;
    }

    public String comprarComida(String comida){
        return comida;
    }
    public Comida getComidaTienda(int posicion){
        return comidaTienda[posicion];
    }
    public void pintarAnimalesTienda(){
        for (int i = 0; i < animalesTienda.length; i++) {
            if(animalesTienda[i] != null){
                System.out.print(i+". "+animalesTienda[i] +"\n");
            }
        }

    }
    public Mascota[] getMazoCompleto(){
        return mazo;
    }
//mascotas en tienda ter 1
    protected Comida comidaTer1[] = {new Comida("manzana"),
    new Comida("naranja"),
    new Comida("miel"),};

//mascotas en tienda ter 2
    protected Comida comidaTer2[] = {new Comida("manzana"),
    new Comida("naranja"),
    new Comida("miel"),
    new Comida("pastelito"),
    new Comida("hueso de carne"),
    new Comida("pastilla para dormir"),};

//mascotas en tienda ter 3
    protected Comida comidaTer3[] = {new Comida("manzana"),
    new Comida("naranja"),
    new Comida("miel"),
    new Comida("pastelito"),
    new Comida("hueso de carne"),
    new Comida("pastilla para dormir"),
    new Comida("ajo"),
    new Comida("ensalada"),
    new Comida("comida enlatada"),
    new Comida("pera"),};

//mascotas en tienda ter 4
    protected Comida comidaTer4[] = {new Comida("manzana"),
    new Comida("naranja"),
    new Comida("miel"),
    new Comida("pastelito"),
    new Comida("hueso de carne"),
    new Comida("pastilla para dormir"),
    new Comida("ajo"),
    new Comida("ensalada"),
    new Comida("comida enlatada"),
    new Comida("pera"),
    new Comida("chile"),
    new Comida("chocolate"),
    new Comida("sushi"),};

//mascotas en tienda ter 5
    protected Comida comidaTer5[] = {new Comida("manzana"),
    new Comida("naranja"),
    new Comida("miel"),
    new Comida("pastelito"),
    new Comida("hueso de carne"),
    new Comida("pastilla para dormir"),
    new Comida("ajo"),
    new Comida("ensalada"),
    new Comida("comida enlatada"),
    new Comida("pera"),
    new Comida("chile"),
    new Comida("chocolate"),
    new Comida("sushi"),
    new Comida("melon"),
    new Comida("hongo"),};

//mascotas en tienda ter 6
    protected Comida comidaTer6[] = {new Comida("manzana"),
    new Comida("naranja"),
    new Comida("miel"),
    new Comida("pastelito"),
    new Comida("hueso de carne"),
    new Comida("pastilla para dormir"),
    new Comida("ajo"),
    new Comida("ensalada"),
    new Comida("comida enlatada"),
    new Comida("pera"),
    new Comida("chile"),
    new Comida("chocolate"),
    new Comida("sushi"),
    new Comida("melon"),
    new Comida("hongo"),
    new Comida("pizza"),
    new Comida("carne"),};

//mascotas en tienda ter 7
    protected Comida comidaTer7[] = {new Comida("manzana"),
    new Comida("naranja"),
    new Comida("miel"),
    new Comida("pastelito"),
    new Comida("hueso de carne"),
    new Comida("pastilla para dormir"),
    new Comida("ajo"),
    new Comida("ensalada"),
    new Comida("comida enlatada"),
    new Comida("pera"),
    new Comida("chile"),
    new Comida("chocolate"),
    new Comida("sushi"),
    new Comida("melon"),
    new Comida("hongo"),
    new Comida("pizza"),
    new Comida("carne"),
    new Comida("gelatina"),};

    public Comida getComidaTer7(int posicion) {
        return comidaTer7[posicion];
    }


public void animalesRandom(int ter){
    switch(ter){
        case 1:
            if(ter == 1){
                int m1 = random.nextInt(6)+1;
                int m2 = random.nextInt(6)+1;
                while(m2 == m1){
                m2 = random.nextInt(6)+1;
                }
                int m3 = random.nextInt(6)+1;
                while(m3 == m1 || m3 == m2){
                m3 = random.nextInt(6)+1;
                }

                int u = 1;
                int v = 0;
                while(u >= 1 && u <= 6){
                    if(m1 == u || m2 == u || m3 == u){
                        for (int i = 0; i < mascotasTer1.length; i++) {
                            if(mascotasTer1[i] == mascotasTer1[u-1]){
                                animalesTienda[0+v] = mascotasTer1[i];
                                v = v + 1;
                            }
                        }
                    }
                u= u+1;
                }
            }
        break;
        case 2:
            if(ter == 2){
                int m1 = random.nextInt(15)+1;
                int m2 = random.nextInt(15)+1;
                while(m2 == m1){
                m2 = random.nextInt(15)+1;
                }
                int m3 = random.nextInt(15)+1;
                while(m3 == m1 || m3 == m2){
                m3 = random.nextInt(15)+1;
                }

                int u = 1;
                int v = 0;
                while(u >= 1 && u <= 15){
                    if(m1 == u || m2 == u || m3 == u){
                        for (int i = 0; i < mascotasTer2.length; i++) {
                            if(mascotasTer2[i] == mascotasTer2[u-1]){
                                animalesTienda[0+v] = mascotasTer2[i];
                                v = v + 1;
                            }
                        }
                    }
                u= u+1;
                }
            } 
            
        break;

        case 3:
            if(ter == 3){
                int m1 = random.nextInt(25)+1;
                int m2 = random.nextInt(25)+1;
                if(m2 == m1){
                    m2 = random.nextInt(25)+1;
                }
                int m3 = random.nextInt(25)+1;
                if(m3 == m1 || m3 == m2){
                    m3 = random.nextInt(25)+1;
                }
                int m4 = random.nextInt(25)+1;
                if(m4 == m1 || m4 == m2 || m4 == m3){
                    m4 = random.nextInt(25)+1;
                }
                int u = 1;
                int v = 0;
                while(u >= 1 && u <= 25){
                    if(m1 == u || m2 == u || m3 == u|| m4 == u){
                        for (int i = 0; i < mascotasTer3.length; i++) {
                            if(mascotasTer3[i] == mascotasTer3[u-1]){
                                animalesTienda[0+v] = mascotasTer3[i];
                                v = v + 1;
                            }
                        }
                    }
                    u= u+1;
                }
                }
        break;
        case 4:
            if(ter == 4){
                        int m1 = random.nextInt(31)+1;
                        int m2 = random.nextInt(31)+1;
                        while(m2 == m1){
                        m2 = random.nextInt(31)+1;
                        }
                        int m3 = random.nextInt(31)+1;
                        while(m3 == m1 || m3 == m2){
                        m3 = random.nextInt(31)+1;
                        }

                        int u = 1;
                        int v = 0;
                        while(u >= 1 && u <= 31){
                            if(m1 == u || m2 == u || m3 == u){
                                for (int i = 0; i < mascotasTer4.length; i++) {
                                    if(mascotasTer4[i] == mascotasTer4[u-1]){
                                        animalesTienda[0+v] = mascotasTer4[i];
                                        v = v + 1;
                                    }
                                }
                            }
                        u= u+1;
                        }
                    }
        break;
 
        case 5 :
            if(ter == 5){
                int m1 = random.nextInt(38)+1;
                int m2 = random.nextInt(38)+1;
                while(m2 == m1){
                    m2 = random.nextInt(38)+1;
                }
                int m3 = random.nextInt(38)+1;
                while(m3 == m1 || m3 == m2){
                    m3 = random.nextInt(38)+1;
                }
                int m4 = random.nextInt(38)+1;
                while(m4 == m1 || m4 == m2 || m4 == m3){
                    m4 = random.nextInt(38)+1;
                }
                int m5 = random.nextInt(38)+1;
                while(m5 == m1 || m5 == m2 || m5 == m3 || m5 == m4){
                    m5 = random.nextInt(38)+1;
                }
                int u = 1;
                int v = 0;
                while(u >= 1 && u <= 38){
                    if(m1 == u || m2 == u || m3 == u || m4 == u || m5 == u){
                        for (int i = 0; i < mascotasTer5.length; i++) {
                            if(mascotasTer5[i] == mascotasTer5[u-1]){
                                animalesTienda[0+v] = mascotasTer5[i];
                                v = v + 1;
                            }
                        }
                    }
                    u= u+1;
                }
            }
        break;
        case 6:
            if(ter == 6){
                int m1 = random.nextInt(46)+1;
                int m2 = random.nextInt(46)+1;
                if(m2 == m1){
                    m2 = random.nextInt(46)+1;
                }
                int m3 = random.nextInt(46)+1;
                if(m3 == m1 || m3 == m2){
                    m3 = random.nextInt(46)+1;
                }
                int m4 = random.nextInt(46)+1;
                if(m4 == m1 || m4 == m2 || m4 == m3){
                    m4 = random.nextInt(46)+1;
                }
                int m5 = random.nextInt(46)+1;
                if(m5 == m1 || m5 == m2 || m5 == m3 || m5 == m4){
                    m5 = random.nextInt(46)+2;
                }
                int u = 1;
                int v = 0;
                while(u >= 1 && u <= 46){
                    if(m1 == u || m2 == u || m3 == u || m4 == u || m5 == u){
                        for (int i = 0; i < mascotasTer6.length; i++) {
                            if(mascotasTer6[i] == mascotasTer6[u-1]){
                                animalesTienda[0+v] = mascotasTer6[i];
                                v = v + 1;
                            }
                        }
                    }
                    u= u+1;
                }   
            }
        break;
        case 7:
            if (ter == 7){
                int m1 = random.nextInt(47)+1;
                int m2 = random.nextInt(47)+1;
                while(m2 == m1){
                    m2 = random.nextInt(47)+1;
                }
                int m3 = random.nextInt(47)+1;
                while(m3 == m1 || m3 == m2){
                    m3 = random.nextInt(47)+1;
                }
                int m4 = random.nextInt(47)+1;
                while(m4 == m1 || m4 == m2 || m4 == m3){
                    m4 = random.nextInt(47)+1;
                }
                int m5 = random.nextInt(47)+1;
                while(m5 == m1 || m5 == m2 || m5 == m3 || m5 == m4){
                    m5 = random.nextInt(47)+2;
                }
                int u = 1;
                int v = 0;
                while(u >= 1 && u <= 47){
                    if(m1 == u || m2 == u || m3 == u || m4 == u || m5 == u){
                        for (int i = 0; i < mascotasTer7.length; i++) {
                            if(mascotasTer7[i] == mascotasTer7[u-1]){
                                animalesTienda[0+v] = mascotasTer7[i];
                                v = v + 1;
                            }
                        }
                    }
                    u= u+1;
                }
            }
        break;
        }
    }

    protected void comidaRandom(int ter){
        switch(ter){
            case 1:
                if(ter ==1){
                    int c1 = random.nextInt(3)+1;
                    int c2 = random.nextInt(3)+1;
                    while (c2 == c1){
                    c2 = random.nextInt(3)+1;
                    }
                    int u = 1;
                    int v = 0;
                    while(u >= 1 && u <= 3){
                        if(c1 == u || c2 == u){
                            for (int i = 0; i < comidaTer1.length; i++) {
                                if(comidaTer1[i] == comidaTer1[u-1]){
                                    comidaTienda[0+v] = comidaTer1[i];
                                    v = v + 1;
                                }
                            }
                        }
                        u= u+1;
                    }

                }
            break;
            case 2:
                if(ter ==2){
                    int c1 = random.nextInt(6)+1;
                    int c2 = random.nextInt(6)+1;
                    while (c2 == c1){
                    c2 = random.nextInt(6)+1;
                    }
                    int u = 1;
                    int v = 0;
                    while(u >= 1 && u <= 6){
                        if(c1 == u || c2 == u){
                            for (int i = 0; i < comidaTer2.length; i++) {
                                if(comidaTer2[i] == comidaTer2[u-1]){
                                    comidaTienda[0+v] = comidaTer2[i];
                                    v = v + 1;
                                }
                            }
                        }
                        u= u+1;
                    }

                }
            break;
            case 3:
                if(ter ==3){
                    int c1 = random.nextInt(10)+1;
                    int c2 = random.nextInt(10)+1;
                    while (c2 == c1){
                    c2 = random.nextInt(10)+1;
                    }
                    int u = 1;
                    int v = 0;
                    while(u >= 1 && u <= 10){
                        if(c1 == u || c2 == u){
                            for (int i = 0; i < comidaTer3.length; i++) {
                                if(comidaTer3[i] == comidaTer3[u-1]){
                                    comidaTienda[0+v] = comidaTer3[i];
                                    v = v + 1;
                                }
                            }
                        }
                        u= u+1;
                    }

                }
            break;
            case 4:
                if(ter ==4){
                    int c1 = random.nextInt(13)+1;
                    int c2 = random.nextInt(13)+1;
                    while (c2 == c1){
                    c2 = random.nextInt(13)+1;
                    }
                    int u = 1;
                    int v = 0;
                    while(u >= 1 && u <= 13){
                        if(c1 == u || c2 == u){
                            for (int i = 0; i < comidaTer4.length; i++) {
                                if(comidaTer4[i] == comidaTer4[u-1]){
                                    comidaTienda[0+v] = comidaTer4[i];
                                    v = v + 1;
                                }
                            }
                        }
                        u= u+1;
                    }

                }
            break;
            case 5:
                if(ter ==5){
                    int c1 = random.nextInt(15)+1;
                    int c2 = random.nextInt(15)+1;
                    while (c2 == c1){
                    c2 = random.nextInt(15)+1;
                    }
                   int u = 1;
                    int v = 0;
                    while(u >= 1 && u <= 15){
                        if(c1 == u || c2 == u){
                            for (int i = 0; i < comidaTer5.length; i++) {
                                if(comidaTer5[i] == comidaTer5[u-1]){
                                    comidaTienda[0+v] = comidaTer5[i];
                                    v = v + 1;
                                }
                            }
                        }
                        u= u+1;
                    }

                }
            break;
            case 6:
                if(ter ==6){
                    int c1 = random.nextInt(17)+1;
                    int c2 = random.nextInt(17)+1;
                    while (c2 == c1){
                    c2 = random.nextInt(17)+1;
                    }
                    int u = 1;
                    int v = 0;
                    while(u >= 1 && u <= 17){
                        if(c1 == u || c2 == u){
                            for (int i = 0; i < comidaTer6.length; i++) {
                                if(comidaTer6[i] == comidaTer6[u-1]){
                                    comidaTienda[0+v] = comidaTer6[i];
                                    v = v + 1;
                                }
                            }
                        }
                        u= u+1;
                    }

                }
            break;
            case 7:
                if(ter ==7){
                    int c1 = random.nextInt(18)+1;
                    int c2 = random.nextInt(18)+1;
                    while (c2 == c1){
                    c2 = random.nextInt(18)+1;
                    }
                    int u = 1;
                    int v = 0;
                    while(u >= 1 && u <= 18){
                        if(c1 == u || c2 == u){
                            for (int i = 0; i < comidaTer7.length; i++) {
                                if(comidaTer7[i] == comidaTer7[u-1]){
                                    comidaTienda[0+v] = comidaTer7[i];
                                    v = v + 1;
                                }
                            }
                        }
                        u= u+1;
                    }
                }
            break;   
        }
    }

    public void pintarComidaEnTienda(){
        for (int i = 0; i < comidaTienda.length; i++) {
                if(comidaTienda[i] != null){
                    System.out.print(i+". "+comidaTienda[i]+"\n");
                }
            }
    }

    public Mascota[] menuCompraInicial(int ter){
        Scanner sn = new Scanner(System.in);
        Tienda mascota = new Tienda();
        int eleccion = 0;
        int roll = 0;
        while(roll != 1){
            roll = 1;
            mascota.animalesRandom(ter);
            mascota.comidaRandom(ter);
            eleccion = 0;
            while(eleccion >= 0 && eleccion != 7 && eleccion != 10){
                System.out.println("oro:"+ oro);
                System.out.println("------------------Sala de Espera---------------");        
                System.out.println("     MAZO     ");
                System.out.println("");
                pintarMazo(mascota);
                System.out.println("");
                System.out.println("");
                System.out.println("--------TIENDA--------");
                System.out.println("Mascotas....");
                mascota.pintarAnimalesTienda();
                System.out.println("");
                System.out.println("Comida....");
                mascota.pintarComidaEnTienda();
                System.out.println("");
                System.out.println("-----------------------------------------------");
                System.out.println("Que acción necesita realizar");
                System.out.println("1. Comprar Mascota");
                System.out.println("2. Vender Mascota");
                System.out.println("3. Comprar Comida");
                System.out.println("4. Fusionar Mascotas");
                System.out.println("5. Rollear");
                System.out.println("6. Ordenar Mazo");
                System.out.println("7. Batalla");
                eleccion = sn.nextInt();
                if(eleccion == 1){
                    if(oro >= 3){
                        System.out.println("¿En que posisión se encuentra la mascota?");
                        int posicion = sn.nextInt();
                        if(posicion == 0){
                            if(mascota.getAnimalesTienda(posicion) != null){
                                System.out.println("¿En que posicion de su mazo desea colocarla?");
                                int posicionMazo = sn.nextInt();
                                if(posicionMazo == 0){
                                    if(mascota.mazo[posicionMazo] == null){
                                           mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                           mascota.setAnimalesTienda(posicion);
                                           oro = oro - 3;
                                    }else{
                                        System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                    }
                                }else if(posicionMazo == 1){
                                        if(mascota.mazo[posicionMazo] == null){
                                           mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                           mascota.setAnimalesTienda(posicion);
                                           oro = oro - 3;
                                       }else{
                                           System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                       }
                                }else if(posicionMazo == 2){
                                        if(mascota.mazo[posicionMazo] == null){
                                           mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 3){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 4){
                                        if(mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else { 
                                    System.out.println("No se existe la posición en el mazo");
                                } 
                            }else{
                                System.out.println("Ya no hay mascota en este espacio");
                            }
                        }else if(posicion == 1){
                            if(mascota.getAnimalesTienda(posicion) != null){
                                System.out.println("¿En que posicion de su mazo desea colocarla?");
                                int posicionMazo = sn.nextInt();
                                if(posicionMazo == 0){
                                    if(mascota.mazo[posicionMazo] == null){
                                        mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                        mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                    }else{
                                        System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                    }
                                }else if(posicionMazo == 1){
                                         if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 2){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 3){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 4){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else { 
                                    System.out.println("No se existe la posición en el mazo");
                                } 
                            }else{
                                System.out.println("Ya no hay mascota en este espacio");
                            }
                        }else if(posicion == 2){
                            if(mascota.getAnimalesTienda(posicion) != null){
                                System.out.println("¿En que posicion de su mazo desea colocarla?");
                                int posicionMazo = sn.nextInt();
                                if(posicionMazo == 0){
                                    if(mascota.mazo[posicionMazo] == null){
                                        mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                        mascota.setAnimalesTienda(posicion);
                                        oro = oro - 3;
                                    }else{
                                        System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                    }
                                }else if(posicionMazo == 1){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 2){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 3){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 4){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else { 
                                    System.out.println("No se existe la posición en el mazo");
                                } 
                            }else{
                                System.out.println("Ya no hay mascota en este espacio");
                            }
                        }else if(posicion == 3){
                            if(mascota.getAnimalesTienda(posicion) != null){
                                System.out.println("¿En que posicion de su mazo desea colocarla?");
                                int posicionMazo = sn.nextInt();
                                if(posicionMazo == 0){
                                    if(mascota.mazo[posicionMazo] == null){
                                        mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                        mascota.setAnimalesTienda(posicion);
                                        oro = oro - 3;
                                    }else{
                                        System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                    }
                                }else if(posicionMazo == 1){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 2){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 3){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 4){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else { 
                                    System.out.println("No se existe la posición en el mazo");
                                } 
                            }else{
                                System.out.println("Ya no hay mascota en este espacio");
                            } 
                        }else if(posicion == 4){
                            if(mascota.getAnimalesTienda(posicion) != null){
                                System.out.println("¿En que posicion de su mazo desea colocarla?");
                                int posicionMazo = sn.nextInt();
                                if(posicionMazo == 0){
                                    if(mascota.mazo[posicionMazo] == null){
                                        mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                        mascota.setAnimalesTienda(posicion);
                                        oro = oro - 3;
                                    }else{
                                        System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                    }
                                }else if(posicionMazo == 1){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 2){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 3){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;

                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else if(posicionMazo == 4){
                                        if(mascota.mazo[posicionMazo] == null){
                                            mascota.mazo[posicionMazo] = mascota.animalesTienda[posicion];
                                            mascota.setAnimalesTienda(posicion);
                                            oro = oro - 3;
                                        }else{
                                            System.out.println("Hay una mascota en ese espacio, de ser necesario debe venderla antes.");
                                        }
                                }else { 
                                    System.out.println("No se existe la posición en el mazo");
                                } 
                            }else{
                                System.out.println("Ya no hay mascota en este espacio");
                            }
                        }else {
                            System.out.println("No existe la posición en la tienda");
                        }
                    }else{
                        System.out.println("Ya no tiene oro suficiente para realizar la compra.");
                    }
                }else if(eleccion == 2){
                        System.out.println("¿En que posición se encuentra la mascota que desea vender? ");
                        int posicion = sn.nextInt();
                        if(mascota.mazo[posicion] != null){
                            mascota.mazo[posicion] = null;
                            oro = oro + 1;
                        }else{
                            System.out.println("No hay ninguna mascota en esa posición.");
                        }
                    }else if(eleccion == 3){
                        if(oro >= 3){
                            System.out.println("En que posición se encuentra la comida que desea comprar");
                            System.out.println("¿En la posición 0 o 1?...");
                            int posicion = sn.nextInt();
                            while(posicion != 0 && posicion != 1){
                                System.out.println("posicion invalida, intente nuevamente");
                                posicion = sn.nextInt();
                            }
                            System.out.println("¿En que posición de su mazo se encuentra la mascota que quiere alimentar?");
                            int posicionMazo = sn.nextInt();
                            mascota.mazo[posicionMazo].setComida(mascota.getComidaTienda(posicion));
                            mascota.comidaTienda[posicion] = null;
                            oro = oro - 3;
                            for (int i = 0; i < mascota.mazo.length; i++) {
                                if(mascota.mazo[i] != null){
                                    aplicarHabilidadComida(mascota, i, ter);
                                }
                            }
                        }else{
                            System.out.println("Ya no tiene oro suficiente para realizar la compra.");
                        }
                    }else if(eleccion == 4){
                        System.out.println("¿La mascota que desea fusionar está en la tienda?");
                        System.out.println("1. Si       2. No");
                        int fusionTienda = sn.nextInt();
                        while(fusionTienda != 1 && fusionTienda != 2){
                            System.out.println("Opcion invalida, escriba nuevamente..");
                            fusionTienda = sn.nextInt();
                        }
                        if(fusionTienda == 1){
                            System.out.println("Ok, Ingrese la posición de la tienda donde se encuentra..");
                            int pet1 = sn.nextInt();
                            while(mascota.animalesTienda[pet1] == null){
                                System.out.println("No hay ninguna mascota en esa posición, ingrese otra..");
                                pet1 = sn.nextInt();
                            }
                            System.out.println("Ingrese la posición de la mascota 2");
                            int pet2 = sn.nextInt();
                            while(mascota.mazo[pet2] == null){
                                System.out.println("No hay ninguna mascota en esa posición, ingrese otra..");
                                pet2 = sn.nextInt();
                            }
                            if(mascota.animalesTienda[pet1] == mascota.mazo[pet2]){
                                mascota.mazo[pet2].setPunch((mascota.animalesTienda[pet1].getPunch()+mascota.mazo[pet2].getPunch()));
                                mascota.mazo[pet2].setPuntosDeVida((mascota.animalesTienda[pet1].getPuntosDeVida()+mascota.mazo[pet2].getPuntosDeVida()));
                                mascota.mazo[pet2].setExperiencia(mascota.mazo[pet2].getExperiencia() +1);
                                mascota.animalesTienda[pet1] = null;
                                oro = oro -3;
                                if(mascota.mazo[pet2].getExperiencia() == 2 && mascota.mazo[pet2].getNivelMascota() == 1){
                                    mascota.mazo[pet2].setNivelMascota(2);
                                    mascota.mazo[pet2].setExperiencia(0);
                                }
                                if(mascota.mazo[pet2].getExperiencia() == 3 && mascota.mazo[pet2].getNivelMascota() == 2 ){
                                    mascota.mazo[pet2].setNivelMascota(3);
                                    mascota.mazo[pet2].setExperiencia(0);
                                }
                            //pendiente espesificar que pasa con comida.......
                            }else{
                                System.out.println("No se pueden fusionar 2 mascotas distintas");
                            }
                        }else if(fusionTienda == 2){
                                System.out.println("Ingrese la posición de la mascota 1");
                                int pet1 = sn.nextInt();
                                while(mascota.mazo[pet1] == null){
                                    System.out.println("No hay ninguna mascota en esa posición, ingrese otra..");
                                    pet1 = sn.nextInt();
                                }  
                                System.out.println("Ingrese la posición de la mascota 2");
                                int pet2 = sn.nextInt();
                                while(mascota.mazo[pet2] == null){
                                    System.out.println("No hay ninguna mascota en esa posición, ingrese otra..");
                                    pet2 = sn.nextInt();
                                }
                                if(mascota.mazo[pet1] == mascota.mazo[pet2]){
                                    mascota.mazo[pet2].setPunch((mascota.mazo[pet1].getPunch() + 1));
                                    mascota.mazo[pet2].setPuntosDeVida((mascota.mazo[pet1].getPuntosDeVida()+ 1));
                                    mascota.mazo[pet2].setExperiencia(mascota.mazo[pet2].getExperiencia() + 1);
                                    mascota.mazo[pet1] = null;
                                    if(mascota.mazo[pet2].getExperiencia() == 2 && mascota.mazo[pet2].getNivelMascota() == 1){
                                        mascota.mazo[pet2].setNivelMascota(2);
                                        mascota.mazo[pet2].setExperiencia(0);
                                    }
                                    if(mascota.mazo[pet2].getExperiencia() == 3 && mascota.mazo[pet2].getNivelMascota() == 2 ){
                                        mascota.mazo[pet2].setNivelMascota(3);
                                        mascota.mazo[pet2].setExperiencia(0);
                                    }
                                //pendiente espesificar que pasa con comida.......
                                }else{
                                    System.out.println("No se pueden fusionar 2 mascotas distintas");
                                }
                            }
                    }else if(eleccion == 5){
                                if(oro >= 1){
                                    roll = 0;
                                    oro = oro-1;
                                    eleccion = 10;
                                }else{
                                    System.out.println("Ya no tiene oro suficiente.");
                                }
                    
                    }else if(eleccion == 6){
                            System.out.println("Ingrese la posición de la mascota que desea mover..");
                            int movimiento = sn.nextInt();
                            while(mascota.mazo[movimiento] == null ){
                                System.out.println("No hay ninguna mascota en esa posición, ingrese otra..");
                                movimiento = sn.nextInt();
                            }
                            System.out.println("Ingrese la la posición donde la moverá..");
                            int movimiento2 = sn.nextInt();
                            if(mascota.mazo[movimiento2] == null){
                                mascota.mazo[movimiento2] = mascota.mazo[movimiento];
                                mascota.mazo[movimiento] = null;
                            }else {
                                Mascota temporal = mascota.mazo[movimiento2];
                                mascota.mazo[movimiento2] = mascota.mazo[movimiento];
                                mascota.mazo[movimiento] = temporal;
                            }
                    }else if(eleccion == 7){
                      System.out.println("Iniciando batalla...");  
                    }
                System.out.println("");
            }
    } 
    return mascota.mazo;         
}

    public void pintarMazo(Tienda mascota){
        for (int i = 0; i < mascota.mazo.length; i++) {
            if(mascota.mazo[i] != null){
                System.out.print(mascota.mazo[i]);
            }else
            System.out.print("|  "+i+"  |"+ " ");

        }
        System.out.println("");
    }
    public void pintarMazoFinal(Mascota[] mazo){
        for (int i = 0; i < mazo.length; i++) {
            if(mazo[i] != null){
                System.out.print(mazo[i]);
            }
        }
        System.out.println("");
    }

    public void aplicarHabilidadComida(Tienda mascota, int p, int ter){
        Scanner scaner = new Scanner(System.in);
        Random rand = new Random();
        if (ter == 1){
            if(mascota.mazo[p].getComida() == mascota.comidaTer1[0]){
                mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() +1);
                mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
                mascota.mazo[p].setComida(null);
            }
        //fin ter == 1   
        }else if(ter == 2){
                if(mascota.mazo[p].getComida() == mascota.comidaTer2[0]){
                mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() +1);
                mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
                mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer2[5]){
                if("hormiga".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 2);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 1);
 
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 4);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 6);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 3);
                    }
                }else if("grillo".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(1);
                        mascota.mazo[p].setPuntosDeVida(1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
 
                    }if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(3);
                        mascota.mazo[p].setPuntosDeVida(3); 
                    }
                    
                }else if("castor".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 3);
                    }
                }else if("puerco espin".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 2);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 4);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 6);
                            }
                        }
                    }
                }else if("arana".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(3);
                    }
                }else{
                    mascota.mazo[p].setComida(null);
                    mascota.mazo[p] = null;
                }
                
            }
        //fin ter 2
        }else if(ter == 3){
            if(mascota.mazo[p].getComida() == mascota.comidaTer3[0]){
            mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() +1);
            mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
            mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer3[5]){
                if("hormiga".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 2);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 1);

                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 4);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 6);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 3);
                    }
                }else if("grillo".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(1);
                        mascota.mazo[p].setPuntosDeVida(1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);

                    }if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(3);
                        mascota.mazo[p].setPuntosDeVida(3); 
                    }

                }else if("castor".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 3);
                    }
                }else if("puerco espin".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 2);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 4);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 6);
                            }
                        }
                    }
                }else if("arana".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(3);
                    }
                }else{
                    mascota.mazo[p].setComida(null);
                    mascota.mazo[p] = null;
                }

            }else if(mascota.mazo[p].getComida() == mascota.comidaTer3[7]){
                int pet1 = rand.nextInt(4) + 0;
                int pet2 = rand.nextInt(4) + 0;
                while (pet1 == pet2){
                    pet2 = rand.nextInt(4) + 0;
                }//FIN WHILE    
                mascota.mazo[pet1].setPunch(mascota.mazo[pet1].getPunch() + 1);
                mascota.mazo[pet1].setPuntosDeVida(mascota.mazo[pet1].getPuntosDeVida() + 1);
                mascota.mazo[pet2].setPunch(mascota.mazo[pet2].getPunch() + 1);
                mascota.mazo[pet2].setPuntosDeVida(mascota.mazo[pet2].getPuntosDeVida() + 1);                
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer3[8]){
                for (int i = 0; i < mascota.animalesTienda.length; i++) {
                    if(mascota.animalesTienda[i] != null){
                        mascota.animalesTienda[i].setPunch(mascota.animalesTienda[i].getPunch() + 2);
                        mascota.animalesTienda[i].setPuntosDeVida(mascota.animalesTienda[i].getPuntosDeVida() + 1);
                    } 
                }//fin fori
                mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer3[9]){
                mascota.mazo[p].setComida(null);
                System.out.println("Ingrese la posición de la mascota que recibirá el plus");
                int plus = scaner.nextInt();
                if(plus != 0 && plus != 1 && plus != 2 && plus != 3 && plus != 4){
                    System.out.println("No hay mascota en esa posición");
                }else{
                    mascota.mazo[plus].setPunch(mascota.mazo[plus].getPunch() + 2);
                    mascota.mazo[plus].setPuntosDeVida(mascota.mazo[plus].getPuntosDeVida() +2);
                }
            }
        //Fin ter 3
        }else if(ter == 4){
            if(mascota.mazo[p].getComida() == mascota.comidaTer4[0]){
            mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() +1);
            mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
            mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer4[5]){
                if("hormiga".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 2);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 1);

                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 4);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 6);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 3);
                    }
                }else if("grillo".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(1);
                        mascota.mazo[p].setPuntosDeVida(1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);

                    }if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(3);
                        mascota.mazo[p].setPuntosDeVida(3); 
                    }

                }else if("castor".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 3);
                    }
                }else if("puerco espin".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 2);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 4);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 6);
                            }
                        }
                    }
                }else if("arana".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(3);
                    }
                }else{
                    mascota.mazo[p].setComida(null);
                    mascota.mazo[p] = null;
                }

            }else if(mascota.mazo[p].getComida() == mascota.comidaTer4[7]){
                int pet1 = rand.nextInt(4) + 0;
                int pet2 = rand.nextInt(4) + 0;
                while (pet1 == pet2){
                    pet2 = rand.nextInt(4) + 0;
                }//FIN WHILE    
                mascota.mazo[pet1].setPunch(mascota.mazo[pet1].getPunch() + 1);
                mascota.mazo[pet1].setPuntosDeVida(mascota.mazo[pet1].getPuntosDeVida() + 1);
                mascota.mazo[pet2].setPunch(mascota.mazo[pet2].getPunch() + 1);
                mascota.mazo[pet2].setPuntosDeVida(mascota.mazo[pet2].getPuntosDeVida() + 1);                
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer4[8]){
                for (int i = 0; i < mascota.animalesTienda.length; i++) {
                    if(mascota.animalesTienda[i] != null){
                        mascota.animalesTienda[i].setPunch(mascota.animalesTienda[i].getPunch() + 2);
                        mascota.animalesTienda[i].setPuntosDeVida(mascota.animalesTienda[i].getPuntosDeVida() + 1);
                    } 
                }//fin fori
                mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer4[9]){
                mascota.mazo[p].setComida(null);
                System.out.println("Ingrese la posición de la mascota que recibirá el plus");
                int plus = scaner.nextInt();
                if(plus != 0 && plus != 1 && plus != 2 && plus != 3 && plus != 4){
                    System.out.println("No hay mascota en esa posición");
                }else{
                    mascota.mazo[plus].setPunch(mascota.mazo[plus].getPunch() + 2);
                    mascota.mazo[plus].setPuntosDeVida(mascota.mazo[plus].getPuntosDeVida() +2);
                }
            }else  if(mascota.mazo[p].getComida() == comidaTer4[11]){
                mascota.mazo[p].setExperiencia(mascota.mazo[p].getExperiencia() + 1);
                mascota.mazo[p].setComida(null);
                if(mascota.mazo[p].getExperiencia() == 2){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setNivelMascota(mascota.mazo[p].getNivelMascota() + 1);
                        mascota.mazo[p].setExperiencia(1);
                    }
                }else if(mascota.mazo[p].getExperiencia() == 3){
                    if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setNivelMascota(mascota.mazo[p].getNivelMascota() + 1);
                        mascota.mazo[p].setExperiencia(0);
                    }
                }
            }else  if(mascota.mazo[p].getComida() == comidaTer4[12]){
                mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
                mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                mascota.mazo[p].setComida(null);
                int ran = rand.nextInt(4) + 0;
                while(ran == p){
                    ran = rand.nextInt(4) + 0;
                }
                int ran2 = rand.nextInt(4) + 0;
                while(ran2 == ran || ran2 == p){
                    ran2 = rand.nextInt(4) + 0;
                }
                mascota.mazo[ran].setPunch(mascota.mazo[ran].getPunch() + 1);
                mascota.mazo[ran].setPuntosDeVida(mascota.mazo[ran].getPuntosDeVida() + 1);
                mascota.mazo[ran2].setPunch(mascota.mazo[ran2].getPunch() + 1);
                mascota.mazo[ran2].setPuntosDeVida(mascota.mazo[ran2].getPuntosDeVida() + 1);


            }
        //fin ter 4
        }else if(ter == 5){
            if(mascota.mazo[p].getComida() == mascota.comidaTer5[0]){
            mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() +1);
            mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
            mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer5[5]){
                if("hormiga".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 2);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 1);

                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 4);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 6);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 3);
                    }
                }else if("grillo".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(1);
                        mascota.mazo[p].setPuntosDeVida(1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);

                    }if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(3);
                        mascota.mazo[p].setPuntosDeVida(3); 
                    }

                }else if("castor".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 3);
                    }
                }else if("puerco espin".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 2);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 4);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 6);
                            }
                        }
                    }
                }else if("arana".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(3);
                    }
                }else{
                    mascota.mazo[p].setComida(null);
                    mascota.mazo[p] = null;
                }

            }else if(mascota.mazo[p].getComida() == mascota.comidaTer5[7]){
                int pet1 = rand.nextInt(4) + 0;
                int pet2 = rand.nextInt(4) + 0;
                while (pet1 == pet2){
                    pet2 = rand.nextInt(4) + 0;
                }//FIN WHILE    
                mascota.mazo[pet1].setPunch(mascota.mazo[pet1].getPunch() + 1);
                mascota.mazo[pet1].setPuntosDeVida(mascota.mazo[pet1].getPuntosDeVida() + 1);
                mascota.mazo[pet2].setPunch(mascota.mazo[pet2].getPunch() + 1);
                mascota.mazo[pet2].setPuntosDeVida(mascota.mazo[pet2].getPuntosDeVida() + 1);                
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer4[8]){
                for (int i = 0; i < mascota.animalesTienda.length; i++) {
                    if(mascota.animalesTienda[i] != null){
                        mascota.animalesTienda[i].setPunch(mascota.animalesTienda[i].getPunch() + 2);
                        mascota.animalesTienda[i].setPuntosDeVida(mascota.animalesTienda[i].getPuntosDeVida() + 1);
                    } 
                }//fin fori
                mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer5[9]){
                mascota.mazo[p].setComida(null);
                System.out.println("Ingrese la posición de la mascota que recibirá el plus");
                int plus = scaner.nextInt();
                if(plus != 0 && plus != 1 && plus != 2 && plus != 3 && plus != 4){
                    System.out.println("No hay mascota en esa posición");
                }else{
                    mascota.mazo[plus].setPunch(mascota.mazo[plus].getPunch() + 2);
                    mascota.mazo[plus].setPuntosDeVida(mascota.mazo[plus].getPuntosDeVida() +2);
                }
            }else  if(mascota.mazo[p].getComida() == comidaTer5[11]){
                mascota.mazo[p].setExperiencia(mascota.mazo[p].getExperiencia() + 1);
                mascota.mazo[p].setComida(null);
                if(mascota.mazo[p].getExperiencia() == 2){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setNivelMascota(mascota.mazo[p].getNivelMascota() + 1);
                        mascota.mazo[p].setExperiencia(1);
                    }
                }else if(mascota.mazo[p].getExperiencia() == 3){
                    if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setNivelMascota(mascota.mazo[p].getNivelMascota() + 1);
                        mascota.mazo[p].setExperiencia(0);
                    }
                }
            }else  if(mascota.mazo[p].getComida() == comidaTer5[12]){
                mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
                mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                mascota.mazo[p].setComida(null);
                int ran = rand.nextInt(4) + 0;
                while(ran == p){
                    ran = rand.nextInt(4) + 0;
                }
                int ran2 = rand.nextInt(4) + 0;
                while(ran2 == ran || ran2 == p){
                    ran2 = rand.nextInt(4) + 0;
                }
                mascota.mazo[ran].setPunch(mascota.mazo[ran].getPunch() + 1);
                mascota.mazo[ran].setPuntosDeVida(mascota.mazo[ran].getPuntosDeVida() + 1);
                mascota.mazo[ran2].setPunch(mascota.mazo[ran2].getPunch() + 1);
                mascota.mazo[ran2].setPuntosDeVida(mascota.mazo[ran2].getPuntosDeVida() + 1);
            }
//fin ter 5
        }else if(ter == 6){
            if(mascota.mazo[p].getComida() == mascota.comidaTer6[0]){
            mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() +1);
            mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
            mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer6[5]){
                if("hormiga".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 2);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 1);

                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 4);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 6);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 3);
                    }
                }else if("grillo".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(1);
                        mascota.mazo[p].setPuntosDeVida(1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);

                    }if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(3);
                        mascota.mazo[p].setPuntosDeVida(3); 
                    }

                }else if("castor".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 3);
                    }
                }else if("puerco espin".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 2);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 4);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 6);
                            }
                        }
                    }
                }else if("arana".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(3);
                    }
                }else{
                    mascota.mazo[p].setComida(null);
                    mascota.mazo[p] = null;
                }

            }else if(mascota.mazo[p].getComida() == mascota.comidaTer6[7]){
                int pet1 = rand.nextInt(4) + 0;
                int pet2 = rand.nextInt(4) + 0;
                while (pet1 == pet2){
                    pet2 = rand.nextInt(4) + 0;
                }//FIN WHILE    
                mascota.mazo[pet1].setPunch(mascota.mazo[pet1].getPunch() + 1);
                mascota.mazo[pet1].setPuntosDeVida(mascota.mazo[pet1].getPuntosDeVida() + 1);
                mascota.mazo[pet2].setPunch(mascota.mazo[pet2].getPunch() + 1);
                mascota.mazo[pet2].setPuntosDeVida(mascota.mazo[pet2].getPuntosDeVida() + 1);                
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer4[8]){
                for (int i = 0; i < mascota.animalesTienda.length; i++) {
                    if(mascota.animalesTienda[i] != null){
                        mascota.animalesTienda[i].setPunch(mascota.animalesTienda[i].getPunch() + 2);
                        mascota.animalesTienda[i].setPuntosDeVida(mascota.animalesTienda[i].getPuntosDeVida() + 1);
                    } 
                }//fin fori
                mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer6[9]){
                mascota.mazo[p].setComida(null);
                System.out.println("Ingrese la posición de la mascota que recibirá el plus");
                int plus = scaner.nextInt();
                if(plus != 0 && plus != 1 && plus != 2 && plus != 3 && plus != 4){
                    System.out.println("No hay mascota en esa posición");
                }else{
                    mascota.mazo[plus].setPunch(mascota.mazo[plus].getPunch() + 2);
                    mascota.mazo[plus].setPuntosDeVida(mascota.mazo[plus].getPuntosDeVida() +2);
                }
            }else  if(mascota.mazo[p].getComida() == comidaTer6[11]){
                mascota.mazo[p].setExperiencia(mascota.mazo[p].getExperiencia() + 1);
                mascota.mazo[p].setComida(null);
                if(mascota.mazo[p].getExperiencia() == 2){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setNivelMascota(mascota.mazo[p].getNivelMascota() + 1);
                        mascota.mazo[p].setExperiencia(1);
                    }
                }else if(mascota.mazo[p].getExperiencia() == 3){
                    if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setNivelMascota(mascota.mazo[p].getNivelMascota() + 1);
                        mascota.mazo[p].setExperiencia(0);
                    }
                }
            }else  if(mascota.mazo[p].getComida() == comidaTer6[12]){
                mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
                mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                mascota.mazo[p].setComida(null);
                int ran = rand.nextInt(4) + 0;
                while(ran == p){
                    ran = rand.nextInt(4) + 0;
                }
                int ran2 = rand.nextInt(4) + 0;
                while(ran2 == ran || ran2 == p){
                    ran2 = rand.nextInt(4) + 0;
                }
                mascota.mazo[ran].setPunch(mascota.mazo[ran].getPunch() + 1);
                mascota.mazo[ran].setPuntosDeVida(mascota.mazo[ran].getPuntosDeVida() + 1);
                mascota.mazo[ran2].setPunch(mascota.mazo[ran2].getPunch() + 1);
                mascota.mazo[ran2].setPuntosDeVida(mascota.mazo[ran2].getPuntosDeVida() + 1);
            }else if(mascota.mazo[p].getComida() == comidaTer6[15]){
                mascota.mazo[p].setComida(null);
                int ran = rand.nextInt(4) + 0;
                int ran2 = rand.nextInt(4) + 0;
                while(ran2 == ran){
                    ran2 = rand.nextInt(4) + 0;
                }
                mascota.mazo[ran].setPunch(mascota.mazo[ran].getPunch() + 2);
                mascota.mazo[ran].setPuntosDeVida(mascota.mazo[ran].getPuntosDeVida() + 2);
                mascota.mazo[ran2].setPunch(mascota.mazo[ran2].getPunch() + 2);
                mascota.mazo[ran2].setPuntosDeVida(mascota.mazo[ran2].getPuntosDeVida() + 2);
            }
// fin ter 6
        }else if(ter == 7){
            if(mascota.mazo[p].getComida() == mascota.comidaTer7[0]){
            mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() +1);
            mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
            mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer7[5]){
                if("hormiga".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 2);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 1);

                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 4);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hhormiga = rand.nextInt(4) + 0;
                        while(mascota.mazo[hhormiga] == null){
                        hhormiga = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[hhormiga].setPunch(mascota.mazo[hhormiga].getPunch() + 6);
                        mascota.mazo[hhormiga].setPuntosDeVida(mascota.mazo[hhormiga].getPuntosDeVida() + 3);
                    }
                }else if("grillo".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(1);
                        mascota.mazo[p].setPuntosDeVida(1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);

                    }if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p].setPunch(3);
                        mascota.mazo[p].setPuntosDeVida(3); 
                    }

                }else if("castor".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        int hcastor = rand.nextInt(4) + 0;
                        while(mascota.mazo[hcastor] == null){
                            hcastor = rand.nextInt(4) + 0;
                        }
                        mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 3);
                    }
                }else if("puerco espin".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 2);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 4);
                            }
                        }
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        for (int i = 0; i < mascota.mazo.length; i++) {
                            if(mascota.mazo[i] != null){
                                mascota.mazo[i].setPunch(mascota.mazo[i].getPunch() + 6);
                            }
                        }
                    }
                }else if("arana".equals(mascota.mazo[p].getNombreMascota())){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(2);
                    }else if(mascota.mazo[p].getNivelMascota() == 3){
                        mascota.mazo[p].setComida(null);
                        mascota.mazo[p] = null;
                        mascota.mazo[p] = mascota.mascotasTer6[47];
                        mascota.mazo[p].setPunch(2);
                        mascota.mazo[p].setPuntosDeVida(2);
                        mascota.mazo[p].setNivelMascota(3);
                    }
                }else{
                    mascota.mazo[p].setComida(null);
                    mascota.mazo[p] = null;
                }

            }else if(mascota.mazo[p].getComida() == mascota.comidaTer7[7]){
                int pet1 = rand.nextInt(4) + 0;
                int pet2 = rand.nextInt(4) + 0;
                while (pet1 == pet2){
                    pet2 = rand.nextInt(4) + 0;
                }//FIN WHILE    
                mascota.mazo[pet1].setPunch(mascota.mazo[pet1].getPunch() + 1);
                mascota.mazo[pet1].setPuntosDeVida(mascota.mazo[pet1].getPuntosDeVida() + 1);
                mascota.mazo[pet2].setPunch(mascota.mazo[pet2].getPunch() + 1);
                mascota.mazo[pet2].setPuntosDeVida(mascota.mazo[pet2].getPuntosDeVida() + 1);                
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer7[8]){
                for (int i = 0; i < mascota.animalesTienda.length; i++) {
                    if(mascota.animalesTienda[i] != null){
                        mascota.animalesTienda[i].setPunch(mascota.animalesTienda[i].getPunch() + 2);
                        mascota.animalesTienda[i].setPuntosDeVida(mascota.animalesTienda[i].getPuntosDeVida() + 1);
                    } 
                }//fin fori
                mascota.mazo[p].setComida(null);
            }else if(mascota.mazo[p].getComida() == mascota.comidaTer7[9]){
                mascota.mazo[p].setComida(null);
                System.out.println("Ingrese la posición de la mascota que recibirá el plus");
                int plus = scaner.nextInt();
                if(plus != 0 && plus != 1 && plus != 2 && plus != 3 && plus != 4){
                    System.out.println("No hay mascota en esa posición");
                }else{
                    mascota.mazo[plus].setPunch(mascota.mazo[plus].getPunch() + 2);
                    mascota.mazo[plus].setPuntosDeVida(mascota.mazo[plus].getPuntosDeVida() +2);
                }
            }else  if(mascota.mazo[p].getComida() == comidaTer7[11]){
                mascota.mazo[p].setExperiencia(mascota.mazo[p].getExperiencia() + 1);
                mascota.mazo[p].setComida(null);
                if(mascota.mazo[p].getExperiencia() == 2){
                    if(mascota.mazo[p].getNivelMascota() == 1){
                        mascota.mazo[p].setNivelMascota(mascota.mazo[p].getNivelMascota() + 1);
                        mascota.mazo[p].setExperiencia(1);
                    }
                }else if(mascota.mazo[p].getExperiencia() == 3){
                    if(mascota.mazo[p].getNivelMascota() == 2){
                        mascota.mazo[p].setNivelMascota(mascota.mazo[p].getNivelMascota() + 1);
                        mascota.mazo[p].setExperiencia(0);
                    }
                }
            }else  if(mascota.mazo[p].getComida() == comidaTer7[12]){
                mascota.mazo[p].setPunch(mascota.mazo[p].getPunch() + 1);
                mascota.mazo[p].setPuntosDeVida(mascota.mazo[p].getPuntosDeVida() + 1);
                mascota.mazo[p].setComida(null);
                int ran = rand.nextInt(4) + 0;
                while(ran == p){
                    ran = rand.nextInt(4) + 0;
                }
                int ran2 = rand.nextInt(4) + 0;
                while(ran2 == ran || ran2 == p){
                    ran2 = rand.nextInt(4) + 0;
                }
                mascota.mazo[ran].setPunch(mascota.mazo[ran].getPunch() + 1);
                mascota.mazo[ran].setPuntosDeVida(mascota.mazo[ran].getPuntosDeVida() + 1);
                mascota.mazo[ran2].setPunch(mascota.mazo[ran2].getPunch() + 1);
                mascota.mazo[ran2].setPuntosDeVida(mascota.mazo[ran2].getPuntosDeVida() + 1);
            }else if(mascota.mazo[p].getComida() == comidaTer7[15]){
                mascota.mazo[p].setComida(null);
                int ran = rand.nextInt(4) + 0;
                int ran2 = rand.nextInt(4) + 0;
                while(ran2 == ran){
                    ran2 = rand.nextInt(4) + 0;
                }
                mascota.mazo[ran].setPunch(mascota.mazo[ran].getPunch() + 2);
                mascota.mazo[ran].setPuntosDeVida(mascota.mazo[ran].getPuntosDeVida() + 2);
                mascota.mazo[ran2].setPunch(mascota.mazo[ran2].getPunch() + 2);
                mascota.mazo[ran2].setPuntosDeVida(mascota.mazo[ran2].getPuntosDeVida() + 2);
            }else if(mascota.mazo[p].getComida() == comidaTer7[17]){
                mascota.mazo[p].setComida(null);
                System.out.println("¿Que tipo de animal desea agregar a su mascota?");
                System.out.println("1. insecto  2. volador  3.acuatico  4.terrestre  5.reptil  6. mamifero  7.domestico 8.solitario  9.desertico");
                String tipo;
                int eleccion = scaner.nextInt();
                while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4 && eleccion != 5 && eleccion != 6 && eleccion != 7 && eleccion != 7
                && eleccion != 9){
                    switch (eleccion) {
                        case 1:
                           tipo = "insecto";
                            mascota.mazo[p].setTipoAnimal(mascota.mazo[p].getTipoAnimal() + tipo);
                            break;
                        case 2:
                            tipo = "volador";
                            mascota.mazo[p].setTipoAnimal(mascota.mazo[p].getTipoAnimal() + tipo);
                            break;
                        case 3:
                            tipo = "acuatico";
                            mascota.mazo[p].setTipoAnimal(mascota.mazo[p].getTipoAnimal() + tipo);
                            break;
                        case 4:
                            tipo = "terrestre";
                            mascota.mazo[p].setTipoAnimal(mascota.mazo[p].getTipoAnimal() + tipo);
                            break;
                        case 5:
                            tipo = "reptil";
                            mascota.mazo[p].setTipoAnimal(mascota.mazo[p].getTipoAnimal() + tipo);
                            break;
                        case 6:
                            tipo = "mamifero";
                            mascota.mazo[p].setTipoAnimal(mascota.mazo[p].getTipoAnimal() + tipo);
                            break;
                        case 7:
                            tipo = "domestico";
                            mascota.mazo[p].setTipoAnimal(mascota.mazo[p].getTipoAnimal() + tipo);
                            break;
                        case 8:
                            tipo = "solitario";
                            mascota.mazo[p].setTipoAnimal(mascota.mazo[p].getTipoAnimal() + tipo);
                            break;
                        case 9:
                            tipo = "desertico";
                            break;
                        default:
                        System.out.println("No se reconoce como una opción valida, intente denuevo");
                    }
                }
            }
        }//fin ter 7

    } 
}

