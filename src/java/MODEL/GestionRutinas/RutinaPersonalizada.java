
package MODEL.GestionRutinas;
import MODEL.GestionUsuarios.Socio;

public class RutinaPersonalizada extends Rutina {
    
    Socio socio;
    public RutinaPersonalizada(String nombre,String tipoRutina,Socio socio){
        super(nombre,tipoRutina);
        this.socio=socio;
    } 
    public RutinaPersonalizada(){
        
    }
    
  
    
}
