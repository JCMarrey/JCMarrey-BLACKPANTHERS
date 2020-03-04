
package MODEL.GestionRutinas;
import MODEL.GestionUsuarios.Socio;
import java.util.ArrayList;


public class RutinaPersonalizada extends Rutina {
    
    private Socio socio;
    public RutinaPersonalizada(String nombre,String tipoRutina,Socio socio){
       
    } 
    public RutinaPersonalizada(){
        
    }

    @Override
    public void visualizaRutina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public Rutina agregarRutina(ArrayList<Ejercicio> e,String tipoR) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}