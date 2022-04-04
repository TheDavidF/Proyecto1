
package SuperAutoPets.Mascota;

import SuperAutoPets.Comida.Comida;


public class Mascota {
    protected String tipoAnimal;
    protected String nombreMascota;
    protected int punch;
    protected String habilidad;
    protected int puntosDeVida;
    protected Comida comida;
    protected boolean efectoActivo;
    protected int experiencia;
    protected int nivelMascota;

    public Mascota(int experiencia, String nombreMascota, String tipoAnimal, int punch, int puntosDeVida, Comida comida,int nivelMascota) {
        this.tipoAnimal = tipoAnimal;
        this.punch = punch;
        this.puntosDeVida = puntosDeVida;
        this.comida = comida;
        this.experiencia = experiencia;
        this.nombreMascota =nombreMascota;
        this.nivelMascota = nivelMascota;
    }

    public Mascota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getPunch() {
        return punch;
    }

    public void setPunch(int punch) {
        this.punch = punch;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Comida getComida() {
        return comida;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getNivelMascota() {
        return nivelMascota;
    }

    public void setNivelMascota(int nivelMascota) {
        this.nivelMascota = nivelMascota;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

 

public void perderVida(){
int vida = puntosDeVida;
vida = vida - punch;

}
@Override
public String toString(){
    if(comida != null){
        return " |"+nombreMascota+" "+punch+"/"+puntosDeVida+"/"+nivelMascota+"/"+experiencia+"/"+comida+"|";
    }else{
        return " |"+nombreMascota+" "+punch+"/"+puntosDeVida+"/"+nivelMascota+"/"+experiencia+"/"+"| ";
    }
}


}
