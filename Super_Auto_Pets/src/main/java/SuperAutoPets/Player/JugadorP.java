/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperAutoPets.Player;

import Controlador.Tienda;

public class JugadorP extends Player {

    public JugadorP(int numJugador, int oro, int vidas, int trofeos) {
        super(numJugador, oro, vidas, trofeos);
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(int trofeos) {
        this.trofeos = trofeos;
    }

    public Tienda getMenuEntreB() {
        return menuEntreB;
    }

    public void setMenuEntreB(Tienda menuEntreB) {
        this.menuEntreB = menuEntreB;
    }
    
    
    public void invocarTienda(Tienda tienda, int ter){
        tienda.menuCompraInicial(ter);
    }
}
