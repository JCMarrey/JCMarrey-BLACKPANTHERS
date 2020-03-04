
package MODEL.GestionRutinas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class GestorRutina {
    private static Rutina rutinaGeneral;
    private static Rutina rutinaPersonal;
    
    public GestorRutina(){
        
    }
    
    public  boolean agregarRutina(){
        try {
            //primero construyo mi rutina y luego ya la agrego a la bd
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("¿Qué tipo de Rutina deseas agregar?");
            String opcionF= teclado.readLine();
            
            String rutina= "RutinaGeneral";
            if(rutina.equalsIgnoreCase(opcionF)){
                
                FabricaConcretaRutinaGeneral rutinaG= new FabricaConcretaRutinaGeneral();
                //falta que eliga el tipo de rutina agregar.
                rutinaG.creaRutina(rutina); //en este caso eligio perina
                System.out.println("Ya se creo la rutina :v?");
                
                
                rutinaGeneral=rutinaG.getRutina(); //Se obtiene ya  nuestra rutina nueva
                rutinaGeneral.visualizaRutina();
                
                //se manda a la BD
            }
            else{
                FabricaConcretaRutinaPersonalizada rutinaP= new FabricaConcretaRutinaPersonalizada();
            }
            
        } catch (IOException ex) {
           ex.printStackTrace(System.out);
        }
        return true;
    }
    public  boolean modificarRutina(Rutina rutina){
        //con Rutina voy modificando cada uno de los ejercicios
        return true;
    }
    public  boolean eliminarRutina(Rutina rutina){
        return true;
    }
    public  boolean buscarRutina(Rutina rutina){
        //cuando me conecte a la base de datos voy a buscar rutina por nombre y regresar
        return true;
    }
    public void buscarRutinas (){
        //aquí accede a la BD y saca todas las rutinas
    }
}
