
package MODEL.GestionRutinas;

import java.util.ArrayList;

public class Rutina {
    private String nombre;
    private String tipoRutina;
    ArrayList<Ejercicio> ejercicios = new ArrayList (); //ya que rutina contiene x ejercicios.
    public Rutina(String nombre,String tipoRutina){
           this.nombre=nombre;
           this.tipoRutina=tipoRutina;
        
    }
    
    public Rutina(){
        
    }
    
    public void setNombreRutina (String nombreR){
        this.nombre=nombreR;
    }
    public String getNombreRutina(){
        return this.nombre;
    }
    public void setTipoRutina (String tipoR){
        this.tipoRutina=tipoR;
    }
    public String getTipoRutina(){
        return this.tipoRutina;
    }
    public void agregarEjercicio(Ejercicio ejercicio){
            
    }
    
}
