package MODEL.GestionRutinas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FabricaConcretaRutinaGeneral extends FabricaAbstractaRutina {

    private RutinaGeneral rutinaGeneral;
    private ArrayList<Ejercicio> e;

    /*
    public void creaRutina(RutinaGeneral rutinaG) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String tipoEjercicio;
        try {
            
            //esto ahora es sustituido por nuestro servlet entonces ahora le mando un objeto, ya que lo tendré instanciado desde el servlet
            /*
            System.out.println("VAMOS A LLENAR LOS DATOS DE LA RUTINA");
            System.out.println("Nombre de la rutina:");
            String nombreR = teclado.readLine();
            String seccion= "RutinaGeneral";
            System.out.println("Escriba el tipo de rutina: Pierna,Gluteos,EspaldaS");
            tipoEjercicio = teclado.readLine();
            System.out.println("Imagen de la rutina:");
            String imagenR=teclado.readLine();
            System.out.println("Comentarios:");
            String comentarios=teclado.readLine();
            
            //una vez elegido que es rutina1 que pertenece a la rutina general, ahora vamos a elegir el tipo de ejercicio
            switch (tipoEjercicio) {

                case "Pierna":
                    System.out.println("ENTRA EN EJERCICIO PIERNA");
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
  
                    break;
                case "Gluteos":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Espalda":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Abdomen":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Pecho":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Brazos":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Hombros":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
*/

    @Override
    public void creaRutina(Rutina rutinaG) {
       
            
            //esto ahora es sustituido por nuestro servlet entonces ahora le mando un objeto, ya que lo tendré instanciado desde el servlet
            /*
            System.out.println("VAMOS A LLENAR LOS DATOS DE LA RUTINA");
            System.out.println("Nombre de la rutina:");
            String nombreR = teclado.readLine();
            String seccion= "RutinaGeneral";
            System.out.println("Escriba el tipo de rutina: Pierna,Gluteos,EspaldaS");
            tipoEjercicio = teclado.readLine();
            System.out.println("Imagen de la rutina:");
            String imagenR=teclado.readLine();
            System.out.println("Comentarios:");
            String comentarios=teclado.readLine();
            */
            //una vez elegido que es rutina1 que pertenece a la rutina general, ahora vamos a elegir el tipo de ejercicio
           
                    System.out.println("ENTRA EN EJERCICIO PIERNA");
                    
                    rutinaGeneral=(RutinaGeneral)rutinaG;
                   
                    /*
                case "Gluteos":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Espalda":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Abdomen":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Pecho":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Brazos":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                case "Hombros":
                    rutinaGeneral = new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios); //me va acrear una rutina para pierna
                    break;
                    */
            }
    
    @Override
    public Rutina getRutina() {
        return rutinaGeneral;
    }

    @Override
    public Rutina agregarEjerciciosRutina(Rutina r) {
       
        Ejercicio ejercicios = new Ejercicio();
        ejercicios=rutinaGeneral.agregarEjercicios();
        RutinaGeneral rutinaG= new RutinaGeneral("",ejercicios);
        return rutinaG;
    }
    
}
