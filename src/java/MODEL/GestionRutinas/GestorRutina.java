
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
    
    public void menu(){
        /*System.out.println("Qué desea hacer? \n1: Agregar Rutina \n2:Agregar un ejercicio");
        try {
            byte opcion=Byte.parseByte(teclado.readLine());
            switch(opcion){
                case 1: agregarRutina();
                        break;
                case 2: 
                        Ejercicio ejercicioAux=new Ejercicio();
                        RutinaGeneral aux2= new RutinaGeneral();
                        ejercicioAux=aux2.agregarEjercicios();
                        agregarEjercicioRutina(ejercicioAux);
                        break;
                default: System.out.println("Opción incorrecta");
           }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);        
        }*/
        //se quita el menú porque eso ya se manejará desde mi servlet
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
                //agregar los ejercicios a la bd
                
                /*
                agregar=tr.agregarEjercicio(rutinaGeneral.agregarEjercicios());
                if(agregar){
                System.out.println("Ejercicios agregados");
                }
                else{
                System.out.println("Valio pito :v");
                }*/
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
