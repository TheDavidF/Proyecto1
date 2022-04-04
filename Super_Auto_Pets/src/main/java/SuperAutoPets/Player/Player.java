/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperAutoPets.Player;

import Controlador.Tienda;
import SuperAutoPets.Comida.Comida;
import SuperAutoPets.Mascota.Mascota;

/**
 *
 * @author canof
 */
public abstract class Player {
    protected int numJugador;
    protected int oro;
    protected int vidas;
    protected int trofeos;
    Tienda menuEntreB = new Tienda();

    public Player(int numJugador, int oro, int vidas, int trofeos) {
        this.numJugador = numJugador;
        this.oro = oro;
        this.vidas = vidas;
        this.trofeos = trofeos;
    }
    public void invocarTienda(){

    }
}
