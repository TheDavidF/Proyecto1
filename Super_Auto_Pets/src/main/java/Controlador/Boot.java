/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import SuperAutoPets.Mascota.Mascota;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author canof
 */
public class Boot extends Tienda {
    Random randomm = new Random();
    public Mascota[] mazoBoot = new Mascota[5];


    public Mascota[] generarMazoBoot(int rondas){
        Boot boot = new Boot();
        switch(rondas){
            case 1:
                if(rondas == 1 ){
                    int m1 = randomm.nextInt(7) + 0;
                    int m2 = randomm.nextInt(7) + 0;
                    while (m2 == m1){
                        m2 = randomm.nextInt(7) + 0;
                    }
                    int m3 = randomm.nextInt(7) + 0;
                    while(m3 == m1 || m3 == m2){
                        m3 = random.nextInt(7) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 7){
                        if(u == m1 || u == m2 || u == m3){
                            for (int i = 0; i < mascotasTer1.length; i++) {
                                if (u == 0){
                                    if(mascotasTer1[i] == mascotasTer1[u]){
                                        boot.mazoBoot[0+x] = mascotasTer1[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer1[i] == mascotasTer1[u]){
                                        boot.mazoBoot[0+x] = mascotasTer1[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                   
                }
            break;
            case 2:
                if(rondas == 2){
                    int m1 = randomm.nextInt(14) + 0;
                    int m2 = randomm.nextInt(14) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(14) + 0;
                    }
                    int m3 = randomm.nextInt(14) + 0;
                    while(m2 == m3){
                        m3 = random.nextInt(14) + 0;
                    }
                    int m4 = randomm.nextInt(14) + 0;
                    while(m4 == m3){
                        m4 = random.nextInt(14) + 0;
                    }
                    int m5 = randomm.nextInt(14) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(14) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 14){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer2.length; i++) {
                                if (u == 0){
                                    if(mascotasTer2[i] == mascotasTer2[u]){
                                        boot.mazoBoot[0+x] = mascotasTer2[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer2[i] == mascotasTer2[u]){
                                        boot.mazoBoot[0+x] = mascotasTer2[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
               
                }
            break; 
            case 3:
                if(rondas == 3){
                    int m1 = randomm.nextInt(14) + 0;
                    int m2 = randomm.nextInt(14) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(14) + 0;
                    }
                    int m3 = randomm.nextInt(14) + 0;
                    while(m2 == m3 || m3 == m1){
                        m3 = random.nextInt(14) + 0;
                    }
                    int m4 = randomm.nextInt(14) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(14) + 0;
                    }
                    int m5 = randomm.nextInt(14) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(14) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 14){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer2.length; i++) {
                                if (u == 0){
                                    if(mascotasTer2[i] == mascotasTer2[u]){
                                        boot.mazoBoot[0+x] = mascotasTer2[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer2[i] == mascotasTer2[u]){
                                        boot.mazoBoot[0+x] = mascotasTer2[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int experienciaR = randomm.nextInt(4) + 0;
                int posicioncomidaR = randomm.nextInt(4) + 0;
                int comidaR = randomm.nextInt(4) +0;
                boot. mazoBoot[experienciaR].setExperiencia(1);
                boot.mazoBoot[nivel1].setNivelMascota(2);
                boot. mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 1);
                boot.mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +1);
                boot.mazoBoot[posicioncomidaR].setComida(comidaTer2[comidaR]);
                
                }
            break;
            case 4:
                if(rondas == 4){
                    int m1 = randomm.nextInt(25) + 0;
                    int m2 = randomm.nextInt(25) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(25) + 0;
                    }
                    int m3 = randomm.nextInt(25) + 0;
                    while(m3 == m2 || m3 == m1){
                        m3 = random.nextInt(25) + 0;
                    }
                    int m4 = randomm.nextInt(25) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(25) + 0;
                    }
                    int m5 = randomm.nextInt(25) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(25) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 25){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer3.length; i++) {
                                if (u == 0){
                                    if(mascotasTer3[i] == mascotasTer3[u]){
                                        boot.mazoBoot[0+x] = mascotasTer3[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer3[i] == mascotasTer3[u]){
                                        boot.mazoBoot[0+x] = mascotasTer3[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int nivel2 = randomm.nextInt(4) + 0;
                while(nivel2 == nivel1){
                    nivel2 = randomm.nextInt(4) + 0;
                }
                int nivel3 = randomm.nextInt(4) + 0;
                while(nivel3 == nivel2 || nivel3 == nivel1){
                    nivel3 = randomm.nextInt(4) + 0;
                }
                boot.mazoBoot[nivel1].setNivelMascota(2);
                boot.mazoBoot[nivel2].setNivelMascota(2);
                boot.mazoBoot[nivel3].setNivelMascota(2);
                boot.mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 1);
                boot.mazoBoot[nivel2].setPunch(boot.mazoBoot[nivel2].getPunch() + 1);
                boot.mazoBoot[nivel3].setPunch(boot.mazoBoot[nivel3].getPunch() + 1);
                boot.mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +1);
                boot.mazoBoot[nivel2].setPuntosDeVida(boot.mazoBoot[nivel2].getPuntosDeVida() +1);
                boot.mazoBoot[nivel3].setPuntosDeVida(boot.mazoBoot[nivel3].getPuntosDeVida() +1);
                int comida1 = random.nextInt(4) +0;
                int comida2 = random.nextInt(4) +0;
                int posicion1 = randomm.nextInt(10) +0;
                int posicion2 = randomm.nextInt(10) +0;
                boot.mazoBoot[comida1].setComida(comidaTer3[posicion1]);
                boot.mazoBoot[comida2].setComida(comidaTer3[posicion2]);
                while (comidaTer3[5] == boot.mazoBoot[comida1].getComida()){
                    posicion1 = randomm.nextInt(10)+0;
                    boot.mazoBoot[comida1].setComida(comidaTer3[posicion1]);
                }
                while (comidaTer3[5] == boot.mazoBoot[comida2].getComida()){
                    posicion2 = randomm.nextInt(10)+0;
                    boot.mazoBoot[comida2].setComida(comidaTer3[posicion2]);
                }
                int experienciaR = randomm.nextInt(4) + 0;
                boot.mazoBoot[experienciaR].setExperiencia(1);
                
                }
            break;
            case 5:
                if(rondas == 5){
                    int m1 = randomm.nextInt(25) + 0;
                    int m2 = randomm.nextInt(25) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(25) + 0;
                    }
                    int m3 = randomm.nextInt(25) + 0;
                    while(m3 == m2 || m3 == m1){
                        m3 = random.nextInt(25) + 0;
                    }
                    int m4 = randomm.nextInt(25) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(25) + 0;
                    }
                    int m5 = randomm.nextInt(25) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(25) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 25){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer3.length; i++) {
                                if (u == 0){
                                    if(mascotasTer3[i] == mascotasTer3[u]){
                                        boot.mazoBoot[0+x] = mascotasTer3[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer3[i] == mascotasTer3[u]){
                                        boot.mazoBoot[0+x] = mascotasTer3[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int nivel2 = randomm.nextInt(4) + 0;
                while (nivel2 == nivel1){
                    nivel2 = randomm.nextInt(4) + 0;
                }
                int nivel3 = randomm.nextInt(4) + 0;
                while (nivel3 == nivel1 || nivel3 == nivel2){
                    nivel3 = randomm.nextInt(4) + 0;
                }
                int nivel4 = randomm.nextInt(4) + 0;
                while (nivel4 == nivel1 || nivel4 == nivel2 || nivel4 == nivel3){
                    nivel4 = randomm.nextInt(4) + 0;
                }
                boot.mazoBoot[nivel1].setNivelMascota(2);
                boot.mazoBoot[nivel2].setNivelMascota(2);
                boot.mazoBoot[nivel3].setNivelMascota(2);
                boot.mazoBoot[nivel4].setNivelMascota(2);
                boot.mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 1);
                boot.mazoBoot[nivel2].setPunch(boot.mazoBoot[nivel2].getPunch() + 1);
                boot.mazoBoot[nivel3].setPunch(boot.mazoBoot[nivel3].getPunch() + 1);
                boot.mazoBoot[nivel4].setPunch(boot.mazoBoot[nivel4].getPunch() + 1);
                boot.mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +1);
                boot. mazoBoot[nivel2].setPuntosDeVida(boot.mazoBoot[nivel2].getPuntosDeVida() +1);
                boot.mazoBoot[nivel3].setPuntosDeVida(boot.mazoBoot[nivel3].getPuntosDeVida() +1);
                boot.mazoBoot[nivel4].setPuntosDeVida(boot.mazoBoot[nivel4].getPuntosDeVida() +1);
                int comida1 = random.nextInt(4) +0;
                int comida2 = random.nextInt(4) +0;
                int comida3 = random.nextInt(4) +0;
                while(comida2 == comida1){
                    comida2 = randomm.nextInt(4) + 0;
                }
                while(comida3 == comida2 || comida3 == comida1){
                    comida3 = randomm.nextInt(4) + 0;
                }
                int posicion1 = randomm.nextInt(10) +0;
                int posicion2 = randomm.nextInt(10) +0;
                int posicion3 = randomm.nextInt(10) +0;
                boot.mazoBoot[comida1].setComida(comidaTer3[posicion1]);
                boot. mazoBoot[comida2].setComida(comidaTer3[posicion2]);
                boot.mazoBoot[comida3].setComida(comidaTer3[posicion3]);
                while (comidaTer3[5] == boot.mazoBoot[comida1].getComida()){
                    posicion1 = randomm.nextInt(10)+0;
                    boot.mazoBoot[comida1].setComida(comidaTer3[posicion1]);
                }
                while (comidaTer3[5] == boot.mazoBoot[comida2].getComida()){
                    posicion2 = randomm.nextInt(10)+0;
                    boot.mazoBoot[comida2].setComida(comidaTer3[posicion2]);
                }
                while (comidaTer3[5] == boot.mazoBoot[comida3].getComida()){
                    posicion3 = randomm.nextInt(10) + 0;
                    boot.mazoBoot[comida3].setComida(comidaTer3[posicion3]);
                }
                int experienciaR = randomm.nextInt(4) + 0;
                int experienciaR2 = randomm.nextInt(4) + 0;
                int experienciaR3 = randomm.nextInt(4) + 0;
                boot.mazoBoot[experienciaR].setExperiencia(1);
                boot.mazoBoot[experienciaR2].setExperiencia(1);
                boot.mazoBoot[experienciaR3].setExperiencia(1);
               
                }
            break;
            case 6:
                if(rondas == 6){
                    int m1 = randomm.nextInt(32) + 0;
                    int m2 = randomm.nextInt(32) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(32) + 0;
                    }
                    int m3 = randomm.nextInt(32) + 0;
                    while(m3 == m2 || m3 == m1){
                        m3 = random.nextInt(32) + 0;
                    }
                    int m4 = randomm.nextInt(32) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(32) + 0;
                    }
                    int m5 = randomm.nextInt(32) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(32) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 32){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer4.length; i++) {
                                if (u == 0){
                                    if(mascotasTer4[i] == mascotasTer4[u]){
                                       boot. mazoBoot[0+x] = mascotasTer4[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer4[i] == mascotasTer4[u]){
                                        boot.mazoBoot[0+x] = mascotasTer4[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int nivel2 = randomm.nextInt(4) + 0;
                while (nivel2 == nivel1){
                    nivel2 = randomm.nextInt(4) + 0;
                }
                int nivel3 = randomm.nextInt(4) + 0;
                while (nivel3 == nivel1 || nivel3 == nivel2){
                    nivel3 = randomm.nextInt(4) + 0;
                }
                int nivel4 = randomm.nextInt(4) + 0;
                while (nivel4 == nivel1 || nivel4 == nivel2 || nivel4 == nivel3){
                    nivel4 = randomm.nextInt(4) + 0;
                }
                int nivel5 = randomm.nextInt(5) + 0;
                while (nivel5 == nivel1 || nivel5 == nivel2 || nivel5 == nivel3 || nivel5 == nivel4){
                    nivel5 = randomm.nextInt(5) + 0;
                }
                boot.mazoBoot[nivel1].setNivelMascota(2);
                boot.mazoBoot[nivel2].setNivelMascota(2);
                boot.mazoBoot[nivel3].setNivelMascota(2);
                boot.mazoBoot[nivel4].setNivelMascota(2);
                boot.mazoBoot[nivel5].setNivelMascota(1);
                boot.mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 1);
                boot.mazoBoot[nivel2].setPunch(boot.mazoBoot[nivel2].getPunch() + 1);
                boot.mazoBoot[nivel3].setPunch(boot.mazoBoot[nivel3].getPunch() + 1);
                boot.mazoBoot[nivel4].setPunch(boot.mazoBoot[nivel4].getPunch() + 1);
                boot.mazoBoot[nivel5].setPunch(boot.mazoBoot[nivel5].getPunch() + 1);
                boot. mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +1);
                boot.mazoBoot[nivel2].setPuntosDeVida(boot.mazoBoot[nivel2].getPuntosDeVida() +1);
                boot.mazoBoot[nivel3].setPuntosDeVida(boot.mazoBoot[nivel3].getPuntosDeVida() +1);
                boot.mazoBoot[nivel4].setPuntosDeVida(boot.mazoBoot[nivel4].getPuntosDeVida() +1);
                boot.mazoBoot[nivel5].setPuntosDeVida(boot.mazoBoot[nivel5].getPuntosDeVida() +1);
                int comida1 = randomm.nextInt(4) +0;
                int comida2 = randomm.nextInt(4) +0;
                int comida3 = randomm.nextInt(4) +0;
                while(comida2 == comida1){
                    comida2 = randomm.nextInt(4) + 0;
                }
                while(comida3 == comida2 || comida3 == comida1){
                    comida3 = randomm.nextInt(4) + 0;
                }
                int comida4 = randomm.nextInt(4) + 0;
                while(comida4 == comida1 || comida3 == comida4 || comida4 == comida2){
                    comida4 = randomm.nextInt(4) + 0;
                }
                int posicion1 = randomm.nextInt(12) +0;
                int posicion2 = randomm.nextInt(12) +0;
                int posicion3 = randomm.nextInt(12) +0;
                int posicion4 = randomm.nextInt(12) +0;
                boot.mazoBoot[comida1].setComida(comidaTer4[posicion1]);
                boot.mazoBoot[comida2].setComida(comidaTer4[posicion2]);
                boot.mazoBoot[comida3].setComida(comidaTer4[posicion3]);
                boot.mazoBoot[comida4].setComida(comidaTer4[posicion4]);
                while (comidaTer4[5] == boot.mazoBoot[comida1].getComida()){
                    posicion1 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida1].setComida(comidaTer4[posicion1]);
                }
                while (comidaTer4[5] == boot.mazoBoot[comida2].getComida()){
                    posicion2 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida2].setComida(comidaTer4[posicion2]);
                }
                while (comidaTer4[5] == boot.mazoBoot[comida3].getComida()){
                    posicion3 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida3].setComida(comidaTer4[posicion3]);
                }
                while (comidaTer4[5] == boot.mazoBoot[comida4].getComida()){
                    posicion4 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida4].setComida(comidaTer4[posicion4]);
                }
                int experienciaR = randomm.nextInt(4) + 0;
                int experienciaR2 = randomm.nextInt(4) + 0;
                int experienciaR3 = randomm.nextInt(4) + 0;
                int experienciaR4 = randomm.nextInt(4) + 0;

                boot.mazoBoot[experienciaR].setExperiencia(1);
                boot.mazoBoot[experienciaR2].setExperiencia(1);
                boot.mazoBoot[experienciaR3].setExperiencia(1);
                boot.mazoBoot[experienciaR4].setExperiencia(1);
               
                }
            break;
            case 7:
                if(rondas == 7){
                    int m1 = randomm.nextInt(32) + 0;
                    int m2 = randomm.nextInt(32) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(32) + 0;
                    }
                    int m3 = randomm.nextInt(32) + 0;
                    while(m3 == m2 || m3 == m1){
                        m3 = random.nextInt(32) + 0;
                    }
                    int m4 = randomm.nextInt(32) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(32) + 0;
                    }
                    int m5 = randomm.nextInt(32) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(32) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 32){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer4.length; i++) {
                                if (u == 0){
                                    if(mascotasTer4[i] == mascotasTer4[u]){
                                       boot. mazoBoot[0+x] = mascotasTer4[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer4[i] == mascotasTer4[u]){
                                        boot.mazoBoot[0+x] = mascotasTer4[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int nivel2 = randomm.nextInt(4) + 0;
                while (nivel2 == nivel1){
                    nivel2 = randomm.nextInt(4) + 0;
                }
                int nivel3 = randomm.nextInt(4) + 0;
                while (nivel3 == nivel1 || nivel3 == nivel2){
                    nivel3 = randomm.nextInt(4) + 0;
                }
                int nivel4 = randomm.nextInt(4) + 0;
                while (nivel4 == nivel1 || nivel4 == nivel2 || nivel4 == nivel3){
                    nivel4 = randomm.nextInt(4) + 0;
                }
                int nivel5 = randomm.nextInt(5) + 0;
                while (nivel5 == nivel1 || nivel5 == nivel2 || nivel5 == nivel3 || nivel5 == nivel4){
                    nivel5 = randomm.nextInt(5) + 0;
                }
                boot.mazoBoot[nivel1].setNivelMascota(3);
                boot.mazoBoot[nivel2].setNivelMascota(2);
                boot.mazoBoot[nivel3].setNivelMascota(2);
                boot.mazoBoot[nivel4].setNivelMascota(2);
                boot.mazoBoot[nivel5].setNivelMascota(2);
                boot.mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 1);
                boot.mazoBoot[nivel2].setPunch(boot.mazoBoot[nivel2].getPunch() + 1);
                boot.mazoBoot[nivel3].setPunch(boot.mazoBoot[nivel3].getPunch() + 1);
                boot.mazoBoot[nivel4].setPunch(boot.mazoBoot[nivel4].getPunch() + 1);
                boot.mazoBoot[nivel5].setPunch(boot.mazoBoot[nivel5].getPunch() + 1);
                boot. mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +1);
                boot.mazoBoot[nivel2].setPuntosDeVida(boot.mazoBoot[nivel2].getPuntosDeVida() +1);
                boot.mazoBoot[nivel3].setPuntosDeVida(boot.mazoBoot[nivel3].getPuntosDeVida() +1);
                boot.mazoBoot[nivel4].setPuntosDeVida(boot.mazoBoot[nivel4].getPuntosDeVida() +1);
                boot.mazoBoot[nivel5].setPuntosDeVida(boot.mazoBoot[nivel5].getPuntosDeVida() +1);
                int comida1 = randomm.nextInt(4) +0;
                int comida2 = randomm.nextInt(4) +0;
                int comida3 = randomm.nextInt(4) +0;
                while(comida2 == comida1){
                    comida2 = randomm.nextInt(4) + 0;
                }
                while(comida3 == comida2 || comida3 == comida1){
                    comida3 = randomm.nextInt(4) + 0;
                }
                int comida4 = randomm.nextInt(4) + 0;
                while(comida4 == comida1 || comida3 == comida4 || comida4 == comida2){
                    comida4 = randomm.nextInt(4) + 0;
                }
                int comida5 = randomm.nextInt(5) + 0;
                while(comida5 == comida1 || comida3 == comida5 || comida5 == comida2 || comida5 == comida4){
                    comida5 = randomm.nextInt(5) + 0;
                }
                int posicion1 = randomm.nextInt(12) +0;
                int posicion2 = randomm.nextInt(12) +0;
                int posicion3 = randomm.nextInt(12) +0;
                int posicion4 = randomm.nextInt(12) +0;
                int posicion5 = randomm.nextInt(12) + 0;
                boot.mazoBoot[comida1].setComida(comidaTer4[posicion1]);
                boot.mazoBoot[comida2].setComida(comidaTer4[posicion2]);
                boot.mazoBoot[comida3].setComida(comidaTer4[posicion3]);
                boot.mazoBoot[comida4].setComida(comidaTer4[posicion4]);
                while (comidaTer4[5] == boot.mazoBoot[comida1].getComida()){
                    posicion1 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida1].setComida(comidaTer4[posicion1]);
                }
                while (comidaTer4[5] == boot.mazoBoot[comida2].getComida()){
                    posicion2 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida2].setComida(comidaTer4[posicion2]);
                }
                while (comidaTer4[5] == boot.mazoBoot[comida3].getComida()){
                    posicion3 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida3].setComida(comidaTer4[posicion3]);
                }
                while (comidaTer4[5] == boot.mazoBoot[comida4].getComida()){
                    posicion4 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida4].setComida(comidaTer4[posicion4]);
                }
                while (comidaTer4[5] == boot.mazoBoot[comida5].getComida()){
                    posicion5 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida5].setComida(comidaTer4[posicion5]);
                }
                int experienciaR = randomm.nextInt(4) + 0;
                int experienciaR2 = randomm.nextInt(4) + 0;
                int experienciaR3 = randomm.nextInt(4) + 0;
                int experienciaR4 = randomm.nextInt(4) + 0;

                boot.mazoBoot[experienciaR].setExperiencia(1);
                boot.mazoBoot[experienciaR2].setExperiencia(2);
                boot.mazoBoot[experienciaR3].setExperiencia(1);
                boot.mazoBoot[experienciaR4].setExperiencia(2);
                    
                }
            break;
            case 8:
                if(rondas == 8){
                    int m1 = randomm.nextInt(32) + 0;
                    int m2 = randomm.nextInt(32) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(32) + 0;
                    }
                    int m3 = randomm.nextInt(32) + 0;
                    while(m3 == m2 || m3 == m1){
                        m3 = random.nextInt(32) + 0;
                    }
                    int m4 = randomm.nextInt(32) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(32) + 0;
                    }
                    int m5 = randomm.nextInt(32) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(32) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 32){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer5.length; i++) {
                                if (u == 0){
                                    if(mascotasTer5[i] == mascotasTer5[u]){
                                       boot. mazoBoot[0+x] = mascotasTer5[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer5[i] == mascotasTer5[u]){
                                        boot.mazoBoot[0+x] = mascotasTer5[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int nivel2 = randomm.nextInt(4) + 0;
                while (nivel2 == nivel1){
                    nivel2 = randomm.nextInt(4) + 0;
                }
                int nivel3 = randomm.nextInt(4) + 0;
                while (nivel3 == nivel1 || nivel3 == nivel2){
                    nivel3 = randomm.nextInt(4) + 0;
                }
                int nivel4 = randomm.nextInt(4) + 0;
                while (nivel4 == nivel1 || nivel4 == nivel2 || nivel4 == nivel3){
                    nivel4 = randomm.nextInt(4) + 0;
                }
                int nivel5 = randomm.nextInt(5) + 0;
                while (nivel5 == nivel1 || nivel5 == nivel2 || nivel5 == nivel3 || nivel5 == nivel4){
                    nivel5 = randomm.nextInt(5) + 0;
                }
                boot.mazoBoot[nivel1].setNivelMascota(3);
                boot.mazoBoot[nivel2].setNivelMascota(2);
                boot.mazoBoot[nivel3].setNivelMascota(2);
                boot.mazoBoot[nivel4].setNivelMascota(2);
                boot.mazoBoot[nivel5].setNivelMascota(3);
                boot.mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 2);
                boot.mazoBoot[nivel2].setPunch(boot.mazoBoot[nivel2].getPunch() + 1);
                boot.mazoBoot[nivel3].setPunch(boot.mazoBoot[nivel3].getPunch() + 1);
                boot.mazoBoot[nivel4].setPunch(boot.mazoBoot[nivel4].getPunch() + 1);
                boot.mazoBoot[nivel5].setPunch(boot.mazoBoot[nivel5].getPunch() + 2);
                boot. mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +2);
                boot.mazoBoot[nivel2].setPuntosDeVida(boot.mazoBoot[nivel2].getPuntosDeVida() +1);
                boot.mazoBoot[nivel3].setPuntosDeVida(boot.mazoBoot[nivel3].getPuntosDeVida() +1);
                boot.mazoBoot[nivel4].setPuntosDeVida(boot.mazoBoot[nivel4].getPuntosDeVida() +1);
                boot.mazoBoot[nivel5].setPuntosDeVida(boot.mazoBoot[nivel5].getPuntosDeVida() +2);
                int comida1 = randomm.nextInt(4) +0;
                int comida2 = randomm.nextInt(4) +0;
                int comida3 = randomm.nextInt(4) +0;
                while(comida2 == comida1){
                    comida2 = randomm.nextInt(4) + 0;
                }
                while(comida3 == comida2 || comida3 == comida1){
                    comida3 = randomm.nextInt(4) + 0;
                }
                int comida4 = randomm.nextInt(4) + 0;
                while(comida4 == comida1 || comida3 == comida4 || comida4 == comida2){
                    comida4 = randomm.nextInt(4) + 0;
                }
                int comida5 = randomm.nextInt(5) + 0;
                while(comida5 == comida1 || comida3 == comida5 || comida5 == comida2 || comida5 == comida4){
                    comida5 = randomm.nextInt(5) + 0;
                }
                int posicion1 = randomm.nextInt(12) +0;
                int posicion2 = randomm.nextInt(12) +0;
                int posicion3 = randomm.nextInt(12) +0;
                int posicion4 = randomm.nextInt(12) +0;
                int posicion5 = randomm.nextInt(12) + 0;
                boot.mazoBoot[comida1].setComida(comidaTer5[posicion1]);
                boot.mazoBoot[comida2].setComida(comidaTer5[posicion2]);
                boot.mazoBoot[comida3].setComida(comidaTer5[posicion3]);
                boot.mazoBoot[comida4].setComida(comidaTer5[posicion4]);
                while (comidaTer5[5] == boot.mazoBoot[comida1].getComida()){
                    posicion1 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida1].setComida(comidaTer5[posicion1]);
                }
                while (comidaTer5[5] == boot.mazoBoot[comida2].getComida()){
                    posicion2 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida2].setComida(comidaTer5[posicion2]);
                }
                while (comidaTer5[5] == boot.mazoBoot[comida3].getComida()){
                    posicion3 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida3].setComida(comidaTer5[posicion3]);
                }
                while (comidaTer5[5] == boot.mazoBoot[comida4].getComida()){
                    posicion4 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida4].setComida(comidaTer5[posicion4]);
                }
                while (comidaTer5[5] == boot.mazoBoot[comida5].getComida()){
                    posicion5 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida5].setComida(comidaTer5[posicion5]);
                }
                int experienciaR = randomm.nextInt(4) + 0;
                int experienciaR2 = randomm.nextInt(4) + 0;
                int experienciaR3 = randomm.nextInt(4) + 0;
                int experienciaR4 = randomm.nextInt(4) + 0;
                int experienciaR5 = randomm.nextInt(4) + 0;

                boot.mazoBoot[experienciaR].setPunch(boot.mazoBoot[experienciaR].getPunch() + 1);
                boot. mazoBoot[experienciaR].setPuntosDeVida(boot.mazoBoot[experienciaR].getPuntosDeVida() +1);
                boot.mazoBoot[experienciaR2].setPunch(boot.mazoBoot[experienciaR2].getPunch() + 1);
                boot. mazoBoot[experienciaR2].setPuntosDeVida(boot.mazoBoot[experienciaR2].getPuntosDeVida() +1);
                boot.mazoBoot[experienciaR3].setPunch(boot.mazoBoot[experienciaR3].getPunch() + 1);
                boot. mazoBoot[experienciaR3].setPuntosDeVida(boot.mazoBoot[experienciaR3].getPuntosDeVida() +1);
                boot.mazoBoot[experienciaR4].setPunch(boot.mazoBoot[experienciaR4].getPunch() + 1);
                boot. mazoBoot[experienciaR4].setPuntosDeVida(boot.mazoBoot[experienciaR4].getPuntosDeVida() +1);
                boot.mazoBoot[experienciaR5].setPunch(boot.mazoBoot[experienciaR5].getPunch() + 1);
                boot. mazoBoot[experienciaR5].setPuntosDeVida(boot.mazoBoot[experienciaR5].getPuntosDeVida() +1);

                boot.mazoBoot[experienciaR].setExperiencia(2);
                boot.mazoBoot[experienciaR2].setExperiencia(2);
                boot.mazoBoot[experienciaR3].setExperiencia(1);
                boot.mazoBoot[experienciaR4].setExperiencia(2);
                boot.mazoBoot[experienciaR5].setExperiencia(2);
                    
                }
            break;
            case 9:
                if(rondas == 9){
                    int m1 = randomm.nextInt(32) + 0;
                    int m2 = randomm.nextInt(32) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(32) + 0;
                    }
                    int m3 = randomm.nextInt(32) + 0;
                    while(m3 == m2 || m3 == m1){
                        m3 = random.nextInt(32) + 0;
                    }
                    int m4 = randomm.nextInt(32) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(32) + 0;
                    }
                    int m5 = randomm.nextInt(32) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(32) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 32){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer5.length; i++) {
                                if (u == 0){
                                    if(mascotasTer5[i] == mascotasTer5[u]){
                                       boot. mazoBoot[0+x] = mascotasTer5[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer5[i] == mascotasTer5[u]){
                                        boot.mazoBoot[0+x] = mascotasTer5[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int nivel2 = randomm.nextInt(4) + 0;
                while (nivel2 == nivel1){
                    nivel2 = randomm.nextInt(4) + 0;
                }
                int nivel3 = randomm.nextInt(4) + 0;
                while (nivel3 == nivel1 || nivel3 == nivel2){
                    nivel3 = randomm.nextInt(4) + 0;
                }
                int nivel4 = randomm.nextInt(4) + 0;
                while (nivel4 == nivel1 || nivel4 == nivel2 || nivel4 == nivel3){
                    nivel4 = randomm.nextInt(4) + 0;
                }
                int nivel5 = randomm.nextInt(5) + 0;
                while (nivel5 == nivel1 || nivel5 == nivel2 || nivel5 == nivel3 || nivel5 == nivel4){
                    nivel5 = randomm.nextInt(5) + 0;
                }
                boot.mazoBoot[nivel1].setNivelMascota(3);
                boot.mazoBoot[nivel2].setNivelMascota(2);
                boot.mazoBoot[nivel3].setNivelMascota(3);
                boot.mazoBoot[nivel4].setNivelMascota(2);
                boot.mazoBoot[nivel5].setNivelMascota(3);
                boot.mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 2);
                boot.mazoBoot[nivel2].setPunch(boot.mazoBoot[nivel2].getPunch() + 1);
                boot.mazoBoot[nivel3].setPunch(boot.mazoBoot[nivel3].getPunch() + 2);
                boot.mazoBoot[nivel4].setPunch(boot.mazoBoot[nivel4].getPunch() + 1);
                boot.mazoBoot[nivel5].setPunch(boot.mazoBoot[nivel5].getPunch() + 2);
                boot. mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +2);
                boot.mazoBoot[nivel2].setPuntosDeVida(boot.mazoBoot[nivel2].getPuntosDeVida() +1);
                boot.mazoBoot[nivel3].setPuntosDeVida(boot.mazoBoot[nivel3].getPuntosDeVida() +2);
                boot.mazoBoot[nivel4].setPuntosDeVida(boot.mazoBoot[nivel4].getPuntosDeVida() +1);
                boot.mazoBoot[nivel5].setPuntosDeVida(boot.mazoBoot[nivel5].getPuntosDeVida() +2);
                int comida1 = randomm.nextInt(4) +0;
                int comida2 = randomm.nextInt(4) +0;
                int comida3 = randomm.nextInt(4) +0;
                while(comida2 == comida1){
                    comida2 = randomm.nextInt(4) + 0;
                }
                while(comida3 == comida2 || comida3 == comida1){
                    comida3 = randomm.nextInt(4) + 0;
                }
                int comida4 = randomm.nextInt(4) + 0;
                while(comida4 == comida1 || comida3 == comida4 || comida4 == comida2){
                    comida4 = randomm.nextInt(4) + 0;
                }
                int comida5 = randomm.nextInt(5) + 0;
                while(comida5 == comida1 || comida3 == comida5 || comida5 == comida2 || comida5 == comida4){
                    comida5 = randomm.nextInt(5) + 0;
                }
                int posicion1 = randomm.nextInt(12) +0;
                int posicion2 = randomm.nextInt(12) +0;
                int posicion3 = randomm.nextInt(12) +0;
                int posicion4 = randomm.nextInt(12) +0;
                int posicion5 = randomm.nextInt(12) + 0;
                boot.mazoBoot[comida1].setComida(comidaTer5[posicion1]);
                boot.mazoBoot[comida2].setComida(comidaTer5[posicion2]);
                boot.mazoBoot[comida3].setComida(comidaTer5[posicion3]);
                boot.mazoBoot[comida4].setComida(comidaTer5[posicion4]);
                while (comidaTer5[5] == boot.mazoBoot[comida1].getComida()){
                    posicion1 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida1].setComida(comidaTer5[posicion1]);
                }
                while (comidaTer5[5] == boot.mazoBoot[comida2].getComida()){
                    posicion2 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida2].setComida(comidaTer5[posicion2]);
                }
                while (comidaTer5[5] == boot.mazoBoot[comida3].getComida()){
                    posicion3 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida3].setComida(comidaTer5[posicion3]);
                }
                while (comidaTer5[5] == boot.mazoBoot[comida4].getComida()){
                    posicion4 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida4].setComida(comidaTer5[posicion4]);
                }
                while (comidaTer5[5] == boot.mazoBoot[comida5].getComida()){
                    posicion5 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida5].setComida(comidaTer5[posicion5]);
                }
                int experienciaR = randomm.nextInt(4) + 0;
                int experienciaR2 = randomm.nextInt(4) + 0;
                int experienciaR3 = randomm.nextInt(4) + 0;
                int experienciaR4 = randomm.nextInt(4) + 0;
                int experienciaR5 = randomm.nextInt(4) + 0;

                if(mazoBoot[experienciaR].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR].setPunch(boot.mazoBoot[experienciaR].getPunch() + 1);
                    boot. mazoBoot[experienciaR].setPuntosDeVida(boot.mazoBoot[experienciaR].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR].setExperiencia(2);
                }else{
                boot.mazoBoot[experienciaR].setExperiencia(0);
                }
                if(mazoBoot[experienciaR2].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR2].setPunch(boot.mazoBoot[experienciaR2].getPunch() + 1);
                    boot. mazoBoot[experienciaR2].setPuntosDeVida(boot.mazoBoot[experienciaR2].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR2].setExperiencia(2);
                }else{
                boot.mazoBoot[experienciaR2].setExperiencia(0);
                }
                if(mazoBoot[experienciaR3].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR3].setPunch(boot.mazoBoot[experienciaR3].getPunch() + 1);
                    boot. mazoBoot[experienciaR3].setPuntosDeVida(boot.mazoBoot[experienciaR3].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR3].setExperiencia(1);
                }else{
                boot.mazoBoot[experienciaR3].setExperiencia(0);
                }
                if(mazoBoot[experienciaR4].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR4].setPunch(boot.mazoBoot[experienciaR4].getPunch() + 1);
                    boot. mazoBoot[experienciaR4].setPuntosDeVida(boot.mazoBoot[experienciaR4].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR4].setExperiencia(2);
                }else{
                boot.mazoBoot[experienciaR4].setExperiencia(0);
                }
                if(mazoBoot[experienciaR5].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR5].setPunch(boot.mazoBoot[experienciaR5].getPunch() + 1);
                    boot. mazoBoot[experienciaR5].setPuntosDeVida(boot.mazoBoot[experienciaR5].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR5].setExperiencia(1);
                }else{
                    boot.mazoBoot[experienciaR5].setExperiencia(0);
                }
                }
            break;
            case 10:
                if(rondas == 10){
                    int m1 = randomm.nextInt(32) + 0;
                    int m2 = randomm.nextInt(32) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(32) + 0;
                    }
                    int m3 = randomm.nextInt(32) + 0;
                    while(m3 == m2 || m3 == m1){
                        m3 = random.nextInt(32) + 0;
                    }
                    int m4 = randomm.nextInt(32) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(32) + 0;
                    }
                    int m5 = randomm.nextInt(32) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(32) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 32){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer6.length; i++) {
                                if (u == 0){
                                    if(mascotasTer6[i] == mascotasTer6[u]){
                                       boot. mazoBoot[0+x] = mascotasTer6[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer6[i] == mascotasTer6[u]){
                                        boot.mazoBoot[0+x] = mascotasTer6[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int nivel2 = randomm.nextInt(4) + 0;
                while (nivel2 == nivel1){
                    nivel2 = randomm.nextInt(4) + 0;
                }
                int nivel3 = randomm.nextInt(4) + 0;
                while (nivel3 == nivel1 || nivel3 == nivel2){
                    nivel3 = randomm.nextInt(4) + 0;
                }
                int nivel4 = randomm.nextInt(4) + 0;
                while (nivel4 == nivel1 || nivel4 == nivel2 || nivel4 == nivel3){
                    nivel4 = randomm.nextInt(4) + 0;
                }
                int nivel5 = randomm.nextInt(5) + 0;
                while (nivel5 == nivel1 || nivel5 == nivel2 || nivel5 == nivel3 || nivel5 == nivel4){
                    nivel5 = randomm.nextInt(5) + 0;
                }
                boot.mazoBoot[nivel1].setNivelMascota(3);
                boot.mazoBoot[nivel2].setNivelMascota(2);
                boot.mazoBoot[nivel3].setNivelMascota(3);
                boot.mazoBoot[nivel4].setNivelMascota(3);
                boot.mazoBoot[nivel5].setNivelMascota(3);
                boot.mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 2);
                boot.mazoBoot[nivel2].setPunch(boot.mazoBoot[nivel2].getPunch() + 1);
                boot.mazoBoot[nivel3].setPunch(boot.mazoBoot[nivel3].getPunch() + 2);
                boot.mazoBoot[nivel4].setPunch(boot.mazoBoot[nivel4].getPunch() + 2);
                boot.mazoBoot[nivel5].setPunch(boot.mazoBoot[nivel5].getPunch() + 2);
                boot. mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +2);
                boot.mazoBoot[nivel2].setPuntosDeVida(boot.mazoBoot[nivel2].getPuntosDeVida() +1);
                boot.mazoBoot[nivel3].setPuntosDeVida(boot.mazoBoot[nivel3].getPuntosDeVida() +2);
                boot.mazoBoot[nivel4].setPuntosDeVida(boot.mazoBoot[nivel4].getPuntosDeVida() +2);
                boot.mazoBoot[nivel5].setPuntosDeVida(boot.mazoBoot[nivel5].getPuntosDeVida() +2);
                int comida1 = randomm.nextInt(4) +0;
                int comida2 = randomm.nextInt(4) +0;
                int comida3 = randomm.nextInt(4) +0;
                while(comida2 == comida1){
                    comida2 = randomm.nextInt(4) + 0;
                }
                while(comida3 == comida2 || comida3 == comida1){
                    comida3 = randomm.nextInt(4) + 0;
                }
                int comida4 = randomm.nextInt(4) + 0;
                while(comida4 == comida1 || comida3 == comida4 || comida4 == comida2){
                    comida4 = randomm.nextInt(4) + 0;
                }
                int comida5 = randomm.nextInt(5) + 0;
                while(comida5 == comida1 || comida3 == comida5 || comida5 == comida2 || comida5 == comida4){
                    comida5 = randomm.nextInt(5) + 0;
                }
                int posicion1 = randomm.nextInt(12) +0;
                int posicion2 = randomm.nextInt(12) +0;
                int posicion3 = randomm.nextInt(12) +0;
                int posicion4 = randomm.nextInt(12) +0;
                int posicion5 = randomm.nextInt(12) + 0;
                boot.mazoBoot[comida1].setComida(comidaTer6[posicion1]);
                boot.mazoBoot[comida2].setComida(comidaTer6[posicion2]);
                boot.mazoBoot[comida3].setComida(comidaTer6[posicion3]);
                boot.mazoBoot[comida4].setComida(comidaTer6[posicion4]);
                while (comidaTer6[5] == boot.mazoBoot[comida1].getComida()){
                    posicion1 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida1].setComida(comidaTer6[posicion1]);
                }
                while (comidaTer6[5] == boot.mazoBoot[comida2].getComida()){
                    posicion2 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida2].setComida(comidaTer6[posicion2]);
                }
                while (comidaTer6[5] == boot.mazoBoot[comida3].getComida()){
                    posicion3 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida3].setComida(comidaTer6[posicion3]);
                }
                while (comidaTer6[5] == boot.mazoBoot[comida4].getComida()){
                    posicion4 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida4].setComida(comidaTer6[posicion4]);
                }
                while (comidaTer6[5] == boot.mazoBoot[comida5].getComida()){
                    posicion5 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida5].setComida(comidaTer6[posicion5]);
                }
                int experienciaR = randomm.nextInt(4) + 0;
                int experienciaR2 = randomm.nextInt(4) + 0;
                int experienciaR3 = randomm.nextInt(4) + 0;
                int experienciaR4 = randomm.nextInt(4) + 0;
                int experienciaR5 = randomm.nextInt(4) + 0;

                if(mazoBoot[experienciaR].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR].setPunch(boot.mazoBoot[experienciaR].getPunch() + 1);
                    boot. mazoBoot[experienciaR].setPuntosDeVida(boot.mazoBoot[experienciaR].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR].setExperiencia(2);
                }else{
                boot.mazoBoot[experienciaR].setExperiencia(0);
                }
                if(mazoBoot[experienciaR2].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR2].setPunch(boot.mazoBoot[experienciaR2].getPunch() + 1);
                    boot. mazoBoot[experienciaR2].setPuntosDeVida(boot.mazoBoot[experienciaR2].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR2].setExperiencia(2);
                }else{
                boot.mazoBoot[experienciaR2].setExperiencia(0);
                }
                if(mazoBoot[experienciaR3].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR3].setPunch(boot.mazoBoot[experienciaR3].getPunch() + 1);
                    boot. mazoBoot[experienciaR3].setPuntosDeVida(boot.mazoBoot[experienciaR3].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR3].setExperiencia(2);
                }else{
                boot.mazoBoot[experienciaR3].setExperiencia(0);
                }
                if(mazoBoot[experienciaR4].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR4].setPunch(boot.mazoBoot[experienciaR4].getPunch() + 1);
                    boot. mazoBoot[experienciaR4].setPuntosDeVida(boot.mazoBoot[experienciaR4].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR4].setExperiencia(2);
                }else{
                boot.mazoBoot[experienciaR4].setExperiencia(0);
                }
                if(mazoBoot[experienciaR5].getExperiencia() != 3){
                    boot.mazoBoot[experienciaR5].setPunch(boot.mazoBoot[experienciaR5].getPunch() + 1);
                    boot. mazoBoot[experienciaR5].setPuntosDeVida(boot.mazoBoot[experienciaR5].getPuntosDeVida() +1);
                    boot.mazoBoot[experienciaR5].setExperiencia(2);
                }else{
                    boot.mazoBoot[experienciaR5].setExperiencia(0);
                }
                }
            break;
            case 11:
                if(rondas == 11 || rondas == 12){
                    int m1 = randomm.nextInt(32) + 0;
                    int m2 = randomm.nextInt(32) + 0;
                    while(m1 == m2){
                        m2 = random.nextInt(32) + 0;
                    }
                    int m3 = randomm.nextInt(32) + 0;
                    while(m3 == m2 || m3 == m1){
                        m3 = random.nextInt(32) + 0;
                    }
                    int m4 = randomm.nextInt(32) + 0;
                    while(m4 == m3 || m4 == m2 || m4 == m1){
                        m4 = random.nextInt(32) + 0;
                    }
                    int m5 = randomm.nextInt(32) + 0;
                    while(m5 == m4 || m5 == m3 || m5 == m2 || m5 == m1){
                        m5 = random.nextInt(32) + 0;
                    }
                    int u = 0;
                    int x = 0;
                    while(u >= 0 && u <= 32){
                        if(u == m1 || u == m2 || u == m3 || u == m4 || u == m5){
                            for (int i = 0; i < mascotasTer6.length; i++) {
                                if (u == 0){
                                    if(mascotasTer6[i] == mascotasTer6[u]){
                                       boot. mazoBoot[0+x] = mascotasTer6[i];
                                        x = x + 1;
                                    }
                                }else if(mascotasTer6[i] == mascotasTer6[u]){
                                        boot.mazoBoot[0+x] = mascotasTer6[i];
                                        x = x + 1;
                                    }
                                }
                            } 
                    u = u +1;
                    }
                int nivel1 = randomm.nextInt(4) + 0;
                int nivel2 = randomm.nextInt(4) + 0;
                while (nivel2 == nivel1){
                    nivel2 = randomm.nextInt(4) + 0;
                }
                int nivel3 = randomm.nextInt(4) + 0;
                while (nivel3 == nivel1 || nivel3 == nivel2){
                    nivel3 = randomm.nextInt(4) + 0;
                }
                int nivel4 = randomm.nextInt(4) + 0;
                while (nivel4 == nivel1 || nivel4 == nivel2 || nivel4 == nivel3){
                    nivel4 = randomm.nextInt(4) + 0;
                }
                int nivel5 = randomm.nextInt(5) + 0;
                while (nivel5 == nivel1 || nivel5 == nivel2 || nivel5 == nivel3 || nivel5 == nivel4){
                    nivel5 = randomm.nextInt(5) + 0;
                }
                boot.mazoBoot[nivel1].setNivelMascota(3);
                boot.mazoBoot[nivel2].setNivelMascota(3);
                boot.mazoBoot[nivel3].setNivelMascota(3);
                boot.mazoBoot[nivel4].setNivelMascota(3);
                boot.mazoBoot[nivel5].setNivelMascota(3);
                boot.mazoBoot[nivel1].setPunch(boot.mazoBoot[nivel1].getPunch() + 4);
                boot.mazoBoot[nivel2].setPunch(boot.mazoBoot[nivel2].getPunch() + 4);
                boot.mazoBoot[nivel3].setPunch(boot.mazoBoot[nivel3].getPunch() + 4);
                boot.mazoBoot[nivel4].setPunch(boot.mazoBoot[nivel4].getPunch() + 4);
                boot.mazoBoot[nivel5].setPunch(boot.mazoBoot[nivel5].getPunch() + 4);
                boot. mazoBoot[nivel1].setPuntosDeVida(boot.mazoBoot[nivel1].getPuntosDeVida() +4);
                boot.mazoBoot[nivel2].setPuntosDeVida(boot.mazoBoot[nivel2].getPuntosDeVida() +4);
                boot.mazoBoot[nivel3].setPuntosDeVida(boot.mazoBoot[nivel3].getPuntosDeVida() +4);
                boot.mazoBoot[nivel4].setPuntosDeVida(boot.mazoBoot[nivel4].getPuntosDeVida() +4);
                boot.mazoBoot[nivel5].setPuntosDeVida(boot.mazoBoot[nivel5].getPuntosDeVida() +4);
                int comida1 = randomm.nextInt(4) +0;
                int comida2 = randomm.nextInt(4) +0;
                int comida3 = randomm.nextInt(4) +0;
                while(comida2 == comida1){
                    comida2 = randomm.nextInt(4) + 0;
                }
                while(comida3 == comida2 || comida3 == comida1){
                    comida3 = randomm.nextInt(4) + 0;
                }
                int comida4 = randomm.nextInt(4) + 0;
                while(comida4 == comida1 || comida3 == comida4 || comida4 == comida2){
                    comida4 = randomm.nextInt(4) + 0;
                }
                int comida5 = randomm.nextInt(5) + 0;
                while(comida5 == comida1 || comida3 == comida5 || comida5 == comida2 || comida5 == comida4){
                    comida5 = randomm.nextInt(5) + 0;
                }
                int posicion1 = randomm.nextInt(12) +0;
                int posicion2 = randomm.nextInt(12) +0;
                int posicion3 = randomm.nextInt(12) +0;
                int posicion4 = randomm.nextInt(12) +0;
                int posicion5 = randomm.nextInt(12) + 0;
                boot.mazoBoot[comida1].setComida(comidaTer6[posicion1]);
                boot.mazoBoot[comida2].setComida(comidaTer6[posicion2]);
                boot.mazoBoot[comida3].setComida(comidaTer6[posicion3]);
                boot.mazoBoot[comida4].setComida(comidaTer6[posicion4]);
                while (comidaTer6[5] == boot.mazoBoot[comida1].getComida()){
                    posicion1 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida1].setComida(comidaTer6[posicion1]);
                }
                while (comidaTer6[5] == boot.mazoBoot[comida2].getComida()){
                    posicion2 = randomm.nextInt(12)+0;
                    boot.mazoBoot[comida2].setComida(comidaTer6[posicion2]);
                }
                while (comidaTer6[5] == boot.mazoBoot[comida3].getComida()){
                    posicion3 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida3].setComida(comidaTer6[posicion3]);
                }
                while (comidaTer6[5] == boot.mazoBoot[comida4].getComida()){
                    posicion4 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida4].setComida(comidaTer6[posicion4]);
                }
                while (comidaTer6[5] == boot.mazoBoot[comida5].getComida()){
                    posicion5 = randomm.nextInt(12) + 0;
                    boot.mazoBoot[comida5].setComida(comidaTer6[posicion5]);
                }
                }
            break;
    }
        return boot.mazoBoot;
}
    public void pintarMazoBoot(Mascota[] mazoBoot){
        for (int i = 0; i < mazoBoot.length; i++) {
            if(mazoBoot[i] != null){
                System.out.print(mazoBoot[i]);
            }
        }
    }

    

    public Mascota getMazoBoot(int posicionMazo){
       return mazoBoot[posicionMazo];
    }


    public void aplicarHabilidadComidaIA(Boot boot, int p, int ter){
            Scanner scaner = new Scanner(System.in);
            Random rand = new Random();
            if (ter == 1){
                if(boot.mazoBoot[p].getComida() == comidaTer1[0]){
                    boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() +1);
                    boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                    boot.mazoBoot[p].setComida(null);
                }
            //fin ter == 1   
            }else if(ter == 2){
                    if(boot.mazoBoot[p].getComida() == comidaTer2[0]){
                    boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() +1);
                    boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                    boot.mazoBoot[p].setComida(null);

            //Fin ter 3
            }else if(ter == 3){
                    if(boot.mazoBoot[p].getComida() == comidaTer3[0]){
                    boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() +1);
                    boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                    boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer3[7]){
                    int pet1 = rand.nextInt(4) + 0;
                    int pet2 = rand.nextInt(4) + 0;
                    while (pet1 == pet2){
                        pet2 = rand.nextInt(4) + 0;
                    }//FIN WHILE    
                    boot.mazoBoot[pet1].setPunch(boot.mazoBoot[pet1].getPunch() + 1);
                    boot.mazoBoot[pet1].setPuntosDeVida(boot.mazoBoot[pet1].getPuntosDeVida() + 1);
                    boot.mazoBoot[pet2].setPunch(boot.mazoBoot[pet2].getPunch() + 1);
                    boot.mazoBoot[pet2].setPuntosDeVida(boot.mazoBoot[pet2].getPuntosDeVida() + 1);                
                }
            //Fin ter 3
            }else if(ter == 4){
                if(boot.mazoBoot[p].getComida() == comidaTer4[0]){
                boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() +1);
                boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer4[7]){
                    int pet1 = rand.nextInt(4) + 0;
                    int pet2 = rand.nextInt(4) + 0;
                    while (pet1 == pet2){
                        pet2 = rand.nextInt(4) + 0;
                    }//FIN WHILE    
                    boot.mazoBoot[pet1].setPunch(boot.mazoBoot[pet1].getPunch() + 1);
                    boot.mazoBoot[pet1].setPuntosDeVida(boot.mazoBoot[pet1].getPuntosDeVida() + 1);
                    boot.mazoBoot[pet2].setPunch(boot.mazoBoot[pet2].getPunch() + 1);
                    boot.mazoBoot[pet2].setPuntosDeVida(boot.mazoBoot[pet2].getPuntosDeVida() + 1);                
                }else if(boot.mazoBoot[p].getComida() == comidaTer4[8]){
                    boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer4[9]){
                    boot.mazoBoot[p].setComida(null);
                }else  if(boot.mazoBoot[p].getComida() == comidaTer4[11]){
                    boot.mazoBoot[p].setExperiencia(boot.mazoBoot[p].getExperiencia() + 1);
                    boot.mazoBoot[p].setComida(null);
                    if(boot.mazoBoot[p].getExperiencia() == 2){
                        if(boot.mazoBoot[p].getNivelMascota() == 1){
                            boot.mazoBoot[p].setNivelMascota(boot.mazoBoot[p].getNivelMascota() + 1);
                            boot.mazoBoot[p].setExperiencia(1);
                        }
                    }else if(boot.mazoBoot[p].getExperiencia() == 3){
                        if(boot.mazoBoot[p].getNivelMascota() == 2){
                            boot.mazoBoot[p].setNivelMascota(boot.mazoBoot[p].getNivelMascota() + 1);
                            boot.mazoBoot[p].setExperiencia(0);
                        }
                    }
                }else  if(boot.mazoBoot[p].getComida() == comidaTer4[12]){
                    boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                    boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() + 1);
                    boot.mazoBoot[p].setComida(null);
                    int ran = rand.nextInt(4) + 0;
                    while(ran == p){
                        ran = rand.nextInt(4) + 0;
                    }
                    int ran2 = rand.nextInt(4) + 0;
                    while(ran2 == ran || ran2 == p){
                        ran2 = rand.nextInt(4) + 0;
                    }
                    boot.mazoBoot[ran].setPunch(boot.mazoBoot[ran].getPunch() + 1);
                    boot.mazoBoot[ran].setPuntosDeVida(boot.mazoBoot[ran].getPuntosDeVida() + 1);
                    boot.mazoBoot[ran2].setPunch(boot.mazoBoot[ran2].getPunch() + 1);
                    boot.mazoBoot[ran2].setPuntosDeVida(boot.mazoBoot[ran2].getPuntosDeVida() + 1);


                }
            //fin ter 4
            }else if(ter == 5){
                if(boot.mazoBoot[p].getComida() == comidaTer5[0]){
                    boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() +1);
                    boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                    boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer5[7]){
                    int pet1 = rand.nextInt(4) + 0;
                    int pet2 = rand.nextInt(4) + 0;
                    while (pet1 == pet2){
                        pet2 = rand.nextInt(4) + 0;

                    }//FIN WHILE    
                    boot.mazoBoot[pet1].setPunch(boot.mazoBoot[pet1].getPunch() + 1);
                    boot.mazoBoot[pet1].setPuntosDeVida(boot.mazoBoot[pet1].getPuntosDeVida() + 1);
                    boot.mazoBoot[pet2].setPunch(boot.mazoBoot[pet2].getPunch() + 1);
                    boot.mazoBoot[pet2].setPuntosDeVida(boot.mazoBoot[pet2].getPuntosDeVida() + 1);                
                }else if(boot.mazoBoot[p].getComida() ==comidaTer5[8]){
                    boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer5[9]){
                    boot.mazoBoot[p].setComida(null);
                }else  if(boot.mazoBoot[p].getComida() == comidaTer5[11]){
                    boot.mazoBoot[p].setExperiencia(boot.mazoBoot[p].getExperiencia() + 1);
                    boot.mazoBoot[p].setComida(null);
                    if(boot.mazoBoot[p].getExperiencia() == 2){
                        if(boot.mazoBoot[p].getNivelMascota() == 1){
                            boot.mazoBoot[p].setNivelMascota(boot.mazoBoot[p].getNivelMascota() + 1);
                            boot.mazoBoot[p].setExperiencia(1);
                        }
                    }else if(boot.mazoBoot[p].getExperiencia() == 3){
                        if(boot.mazoBoot[p].getNivelMascota() == 2){
                            boot.mazoBoot[p].setNivelMascota(boot.mazoBoot[p].getNivelMascota() + 1);
                            boot.mazoBoot[p].setExperiencia(0);
                        }
                    }
                }else  if(boot.mazoBoot[p].getComida() == comidaTer5[12]){
                    boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                    boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() + 1);
                    boot.mazoBoot[p].setComida(null);
                    int ran = rand.nextInt(4) + 0;
                    while(ran == p){
                        ran = rand.nextInt(4) + 0;
                    }
                    int ran2 = rand.nextInt(4) + 0;
                    while(ran2 == ran || ran2 == p){
                        ran2 = rand.nextInt(4) + 0;
                    }
                    boot.mazoBoot[ran].setPunch(boot.mazoBoot[ran].getPunch() + 1);
                    boot.mazoBoot[ran].setPuntosDeVida(boot.mazoBoot[ran].getPuntosDeVida() + 1);
                    boot.mazoBoot[ran2].setPunch(boot.mazoBoot[ran2].getPunch() + 1);
                    boot.mazoBoot[ran2].setPuntosDeVida(boot.mazoBoot[ran2].getPuntosDeVida() + 1);
                }
    //fin ter 5
            }else if(ter == 6){
                if(boot.mazoBoot[p].getComida() == comidaTer6[0]){
                boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() +1);
                boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer6[7]){
                    int pet1 = rand.nextInt(4) + 0;
                    int pet2 = rand.nextInt(4) + 0;
                    while (pet1 == pet2){
                        pet2 = rand.nextInt(4) + 0;
                    }//FIN WHILE    
                    boot.mazoBoot[pet1].setPunch(boot.mazoBoot[pet1].getPunch() + 1);
                    boot.mazoBoot[pet1].setPuntosDeVida(boot.mazoBoot[pet1].getPuntosDeVida() + 1);
                    boot.mazoBoot[pet2].setPunch(boot.mazoBoot[pet2].getPunch() + 1);
                    boot.mazoBoot[pet2].setPuntosDeVida(boot.mazoBoot[pet2].getPuntosDeVida() + 1);                
                }else if(boot.mazoBoot[p].getComida() == comidaTer6[8]){
                    boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer6[9]){
                    boot.mazoBoot[p].setComida(null);
                }else  if(boot.mazoBoot[p].getComida() == comidaTer6[11]){
                    boot.mazoBoot[p].setExperiencia(boot.mazoBoot[p].getExperiencia() + 1);
                    boot.mazoBoot[p].setComida(null);
                    if(boot.mazoBoot[p].getExperiencia() == 2){
                        if(boot.mazoBoot[p].getNivelMascota() == 1){
                            boot.mazoBoot[p].setNivelMascota(boot.mazoBoot[p].getNivelMascota() + 1);
                            boot.mazoBoot[p].setExperiencia(1);
                        }
                    }else if(boot.mazoBoot[p].getExperiencia() == 3){
                        if(boot.mazoBoot[p].getNivelMascota() == 2){
                            boot.mazoBoot[p].setNivelMascota(boot.mazoBoot[p].getNivelMascota() + 1);
                            boot.mazoBoot[p].setExperiencia(0);
                        }
                    }
                }else  if(boot.mazoBoot[p].getComida() == comidaTer6[12]){
                    boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                    boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() + 1);
                    boot.mazoBoot[p].setComida(null);
                    int ran = rand.nextInt(4) + 0;
                    while(ran == p){
                        ran = rand.nextInt(4) + 0;
                    }
                    int ran2 = rand.nextInt(4) + 0;
                    while(ran2 == ran || ran2 == p){
                        ran2 = rand.nextInt(4) + 0;
                    }
                    boot.mazoBoot[ran].setPunch(boot.mazoBoot[ran].getPunch() + 1);
                    boot.mazoBoot[ran].setPuntosDeVida(boot.mazoBoot[ran].getPuntosDeVida() + 1);
                    boot.mazoBoot[ran2].setPunch(boot.mazoBoot[ran2].getPunch() + 1);
                    boot.mazoBoot[ran2].setPuntosDeVida(boot.mazoBoot[ran2].getPuntosDeVida() + 1);
                }else if(boot.mazoBoot[p].getComida() == comidaTer6[15]){
                    boot.mazoBoot[p].setComida(null);
                    int ran = rand.nextInt(4) + 0;
                    int ran2 = rand.nextInt(4) + 0;
                    while(ran2 == ran){
                        ran2 = rand.nextInt(4) + 0;
                    }
                    boot.mazoBoot[ran].setPunch(boot.mazoBoot[ran].getPunch() + 2);
                    boot.mazoBoot[ran].setPuntosDeVida(boot.mazoBoot[ran].getPuntosDeVida() + 2);
                    boot.mazoBoot[ran2].setPunch(boot.mazoBoot[ran2].getPunch() + 2);
                    boot.mazoBoot[ran2].setPuntosDeVida(boot.mazoBoot[ran2].getPuntosDeVida() + 2);
                }
    // fin ter 6
            }else if(ter == 7){
                if(boot.mazoBoot[p].getComida() == comidaTer7[0]){
                boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() +1);
                boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer7[7]){
                    int pet1 = rand.nextInt(4) + 0;
                    int pet2 = rand.nextInt(4) + 0;
                    while (pet1 == pet2){
                        pet2 = rand.nextInt(4) + 0;
                    }//FIN WHILE    
                    boot.mazoBoot[pet1].setPunch(boot.mazoBoot[pet1].getPunch() + 1);
                    boot.mazoBoot[pet1].setPuntosDeVida(boot.mazoBoot[pet1].getPuntosDeVida() + 1);
                    boot.mazoBoot[pet2].setPunch(boot.mazoBoot[pet2].getPunch() + 1);
                    boot.mazoBoot[pet2].setPuntosDeVida(boot.mazoBoot[pet2].getPuntosDeVida() + 1);                
                }else if(boot.mazoBoot[p].getComida() == comidaTer7[8]){
                    boot.mazoBoot[p].setComida(null);
                }else if(boot.mazoBoot[p].getComida() == comidaTer7[9]){
                    boot.mazoBoot[p].setComida(null);
                }else  if(boot.mazoBoot[p].getComida() == comidaTer7[11]){
                    boot.mazoBoot[p].setExperiencia(boot.mazoBoot[p].getExperiencia() + 1);
                    boot.mazoBoot[p].setComida(null);
                    if(boot.mazoBoot[p].getExperiencia() == 2){
                        if(boot.mazoBoot[p].getNivelMascota() == 1){
                            boot.mazoBoot[p].setNivelMascota(boot.mazoBoot[p].getNivelMascota() + 1);
                            boot.mazoBoot[p].setExperiencia(1);
                        }
                    }else if(boot.mazoBoot[p].getExperiencia() == 3){
                        if(boot.mazoBoot[p].getNivelMascota() == 2){
                            boot.mazoBoot[p].setNivelMascota(boot.mazoBoot[p].getNivelMascota() + 1);
                            boot.mazoBoot[p].setExperiencia(0);
                        }
                    }
                }else  if(boot.mazoBoot[p].getComida() == comidaTer7[12]){
                    boot.mazoBoot[p].setPunch(boot.mazoBoot[p].getPunch() + 1);
                    boot.mazoBoot[p].setPuntosDeVida(boot.mazoBoot[p].getPuntosDeVida() + 1);
                    boot.mazoBoot[p].setComida(null);
                    int ran = rand.nextInt(4) + 0;
                    while(ran == p){
                        ran = rand.nextInt(4) + 0;
                    }
                    int ran2 = rand.nextInt(4) + 0;
                    while(ran2 == ran || ran2 == p){
                        ran2 = rand.nextInt(4) + 0;
                    }
                    boot.mazoBoot[ran].setPunch(boot.mazoBoot[ran].getPunch() + 1);
                    boot.mazoBoot[ran].setPuntosDeVida(boot.mazoBoot[ran].getPuntosDeVida() + 1);
                    boot.mazoBoot[ran2].setPunch(boot.mazoBoot[ran2].getPunch() + 1);
                    boot.mazoBoot[ran2].setPuntosDeVida(boot.mazoBoot[ran2].getPuntosDeVida() + 1);
                }else if(boot.mazoBoot[p].getComida() == comidaTer7[15]){
                    boot.mazoBoot[p].setComida(null);
                    int ran = rand.nextInt(4) + 0;
                    int ran2 = rand.nextInt(4) + 0;
                    while(ran2 == ran){
                        ran2 = rand.nextInt(4) + 0;
                    }
                    boot.mazoBoot[ran].setPunch(boot.mazoBoot[ran].getPunch() + 2);
                    boot.mazoBoot[ran].setPuntosDeVida(boot.mazoBoot[ran].getPuntosDeVida() + 2);
                    boot.mazoBoot[ran2].setPunch(boot.mazoBoot[ran2].getPunch() + 2);
                    boot.mazoBoot[ran2].setPuntosDeVida(boot.mazoBoot[ran2].getPuntosDeVida() + 2);
                }else if(boot.mazoBoot[p].getComida() == comidaTer7[17]){
                    boot.mazoBoot[p].setComida(null);
                    System.out.println("¿Que tipo de animal desea agregar a su mascota?");
                    System.out.println("1. insecto  2. volador  3.acuatico  4.terrestre  5.reptil  6. mamifero  7.domestico 8.solitario  9.desertico");
                    String tipo;
                    int eleccion = scaner.nextInt();
                    while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4 && eleccion != 5 && eleccion != 6 && eleccion != 7 && eleccion != 7
                    && eleccion != 9){
                        switch (eleccion) {
                            case 1:
                               tipo = "insecto";
                                boot.mazoBoot[p].setTipoAnimal(boot.mazoBoot[p].getTipoAnimal() + tipo);
                                break;
                            case 2:
                                tipo = "volador";
                                boot.mazoBoot[p].setTipoAnimal(boot.mazoBoot[p].getTipoAnimal() + tipo);
                                break;
                            case 3:
                                tipo = "acuatico";
                                boot.mazoBoot[p].setTipoAnimal(boot.mazoBoot[p].getTipoAnimal() + tipo);
                                break;
                            case 4:
                                tipo = "terrestre";
                                boot.mazoBoot[p].setTipoAnimal(boot.mazoBoot[p].getTipoAnimal() + tipo);
                                break;
                            case 5:
                                tipo = "reptil";
                                boot.mazoBoot[p].setTipoAnimal(boot.mazoBoot[p].getTipoAnimal() + tipo);
                                break;
                            case 6:
                                tipo = "mamifero";
                                boot.mazoBoot[p].setTipoAnimal(boot.mazoBoot[p].getTipoAnimal() + tipo);
                                break;
                            case 7:
                                tipo = "domestico";
                                boot.mazoBoot[p].setTipoAnimal(boot.mazoBoot[p].getTipoAnimal() + tipo);
                                break;
                            case 8:
                                tipo = "solitario";
                                boot.mazoBoot[p].setTipoAnimal(boot.mazoBoot[p].getTipoAnimal() + tipo);
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
}