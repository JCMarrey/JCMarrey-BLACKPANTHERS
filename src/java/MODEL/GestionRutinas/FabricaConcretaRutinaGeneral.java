
package MODEL.GestionRutinas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class FabricaConcretaRutinaGeneral extends FabricaAbstractaRutina {

    private RutinaGeneral rutinaGeneral;
    private ArrayList<Ejercicio> e;
    @Override
    public void creaRutina(String tipoRutina) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba el tipo de ejercicio: Pierna,Gluteos,EspaldaS");
       
        String tipoEjercicio;
        try {
            tipoEjercicio = teclado.readLine();
            //una vez elegido que es rutina1 que pertenece a la rutina general, ahora vamos a elegir el tipo de ejercicio
            switch (tipoEjercicio) {

                case "Pierna":
                    System.out.println("ENTRA EN EJERCICIO PIERNA");
                    rutinaGeneral = new RutinaGeneral(); //me va acrear una rutina para pierna
                    rutinaGeneral=(RutinaGeneral)rutinaGeneral.agregarRutina(e,tipoEjercicio);
                    
                    break;
                case "Gluteos":
                    rutinaGeneral = new RutinaGeneral("Gluteos");
                    break;
                case "Espalda":
                    rutinaGeneral = new RutinaGeneral("Espalda");
                    break;
                case "Abdomen":
                    rutinaGeneral = new RutinaGeneral("Abdomen");
                    break;
                case "Pecho":
                    rutinaGeneral = new RutinaGeneral("Pecho");
                    break;
                case "Brazos":
                    rutinaGeneral = new RutinaGeneral("Brazos");
                    break;
                case "Hombros":
                    rutinaGeneral = new RutinaGeneral("Hombros");
                    break;
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public Rutina getRutina() {
        return rutinaGeneral;
    }
}