
package SuperAutoPets.Comida;


public class Comida {
    protected String nombre;
 
    public Comida(String nombre) {
       
       
        this.nombre = nombre; 
    }

    public String getNombre() {
        return nombre;
    }


public String toString(){
return " |"+ nombre+"| ";
}
}

