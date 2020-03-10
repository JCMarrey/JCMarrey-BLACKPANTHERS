
package MODEL.GestionRutinas;

import DB.TablaRutinas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class GestorRutina {
    private static Rutina rutinaGeneral;
    private static Rutina rutinaPersonal;
    
    TablaRutinas tr= new TablaRutinas();
    Ejercicio ejercicio = new Ejercicio();
    RutinaGeneral aux= new RutinaGeneral();
    ArrayList<Ejercicio>ejercicios = new ArrayList();
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    public GestorRutina(){
        
    }
    
    public  boolean agregarRutina(Rutina rutinaX,String tipoRutina){
        //primero construyo mi rutina y luego ya la agrego a la bd
        
        String rutina= "Rutina General";
        if(rutina.equalsIgnoreCase(tipoRutina)){
            
            FabricaConcretaRutinaGeneral rutinaG= new FabricaConcretaRutinaGeneral();
            //falta que eliga el tipo de rutina agregar.
            rutinaG.creaRutina(rutinaX); //en este caso eligio perina
            // esta rutina ahora la agrego a la bd;
            System.out.println("Ya se creo la rutina :v?");
            RutinaGeneral rg= new RutinaGeneral();
            rg= (RutinaGeneral)rutinaG.getRutina();
            
            //para ver que se agrego la rutina a la db
            boolean agregar=tr.agregarRutinaGeneral(rg);
            
            if(agregar){
                System.out.println("RUTINA AGREGADA ALA BD");
                rutinaGeneral=rutinaG.getRutina(); //Se obtiene ya  nuestra rutina nueva
                //comenzamos a pedir los ejercicios de dicha rutina:
                
                rg.visualizaRutina(ejercicios,rutinaGeneral);
                System.out.println("Se agrego la rutina");
            }
            else{
                System.out.println("No se agrego la rutina :");
            }
            
        }
        else{
            FabricaConcretaRutinaPersonalizada rutinaP= new FabricaConcretaRutinaPersonalizada();
        }
        return true;
    }
    public  boolean modificarRutina(RutinaGeneral rutinaG,String nombR){
        
        /*
        if(tr.modificarRutinaGeneral(rutinaG)){
            System.out.println("Se modifico la rutina: GestorRutina");
         return true;
        
        }
        else{
            System.out.println("No se modifico la rutina");
            return false;
        }*/
        
        if(tr.modificarRutinaGeneral2(rutinaG, nombR)){
            System.out.println("estamos en el gestor y a ver si si se modifica :V");
            return true;
        }
        else{
            return false;
        }
    }
    public  boolean eliminarRutina(String nombreR){
        
        if(tr.eliminarRutina(nombreR)){
            System.out.println("RUTINA ELIMINADA :v");
            return true;
        }
        else{
            System.out.println("Rutina no eliminada");
            return false;
        }
    }
    public  RutinaGeneral buscarRutina(String id){
       
        RutinaGeneral aux= null;
        aux=tr.cargarInfoRutinaGeneral(id);
        System.out.println("CHECANDO SI JALA LOS DATOS");
        System.out.println("nombre" + aux.getNombre());
        System.out.println("seccion" + aux.getSeccion());
        System.out.println("Tipo rutina" + aux.getTipoRutina());
        return aux;
         
    }
    
    
    public ArrayList buscarRutinas (){
       return tr.buscarRutinasGenerales();
    }
    
    
    
    public boolean agregarEjercicioRutina(Ejercicio ejercicio){
         
         boolean agregar;
         agregar=tr.agregarEjercicio(ejercicio);
         if(agregar){
             System.out.println("Ejercicio agregado con éxito");
             return true;
         }else{
             System.out.println("Rutina inexistente:");
              return false;
         }
    }
}
