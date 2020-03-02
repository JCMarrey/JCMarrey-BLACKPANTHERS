
package MODEL.GestionRutinas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GestorRutina {
    private static RutinaGeneral rutinaGeneral;
    private static RutinaGeneral rutinaPersonal;
    
    public  boolean agregarRutina(ArrayList <Ejercicio> ejercicios){
        //primero construyo mi rutina y luego ya la agrego a la bd
        System.out.println("¿Qué tipo de Rutina deseas agregar?");
        InputStreamReader opcion = new InputStreamReader(System.in); //lee catacteres sueltos
        BufferedReader opcionF = new BufferedReader(opcion); //ya lee todo completo
        String rutina1= "RutinaGeneral";
        if(rutina1.equalsIgnoreCase(opcionF.toString())){
            FabricaConcretaRutinaGeneral rutinaG= new FabricaConcretaRutinaGeneral();
            //falta que eliga el tipo de rutina agregar.
            rutinaG.creaRutina("Pierna"); //en este caso eligio perina
            rutinaG.getRutina(); //Se obtiene ya  nuestra rutina nueva
            //se manda a la BD
        }
        else{
            FabricaConcretaRutinaPersonalizada rutinaP= new FabricaConcretaRutinaPersonalizada();
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
