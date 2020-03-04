
package MODEL.GestionRutinas;
import java.util.ArrayList;
import java.util.Scanner;

public class RutinaGeneral extends Rutina {

    private String nombre;
    private String tipoRutina;
    private ArrayList<Ejercicio> ejercicios;
    private Ejercicio ejercicioNuevo;

    public RutinaGeneral(String tipoRutina,ArrayList<Ejercicio> e) {
        this.tipoRutina = tipoRutina;
        this.ejercicios=e;
    }
    
     public RutinaGeneral( String tipoRutina) {
        this.tipoRutina = tipoRutina;
    }

    public RutinaGeneral() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRutina() {
        return tipoRutina;
    }

    public void setTipoRutina(String tipoRutina) {
        this.tipoRutina = tipoRutina;
    }

    @Override
    public Rutina agregarRutina(ArrayList<Ejercicio> e,String tipoRutina) {
        
        RutinaGeneral nuevaR=new RutinaGeneral();
        String opcion;
        ejercicios = new ArrayList();
        //mientras quiera agregar otro ejercicio
        do {
            ejercicioNuevo= new Ejercicio();
            ejercicioNuevo= ejercicioNuevo.agregarEjercicio(); //ya me regresa el ejercicio con sus datos
            ejercicios.add(ejercicioNuevo); //se agrega al ArrayList para tener una lista de ejercicios
            System.out.println("Desea agregar otro ejercicio?");
            Scanner sc = new Scanner(System.in);
            opcion= sc.nextLine();
        } while (opcion.equals("s"));  
        return nuevaR= new RutinaGeneral(tipoRutina,ejercicios); //aquí ya me regresa a mi rutina con todos los ejercicios
        
    }
    @Override
    public void visualizaRutina() {
        System.out.println("Rutina para: " + "");
        System.out.println("Ahora comenzamos con los ejercicios de dichaRutina");
        for (Ejercicio recorre : ejercicios) {
            byte numE = 1;
            System.out.println("Ejercicio" + numE);
            System.out.println("Nombre del ejercicio: " + recorre.getNombreEjercicio());
            System.out.println("Número de series: " + recorre.getNumeroSeries());
            System.out.println("Numero de Repeticiones: " + recorre.getNumeroRepeticiones());
            System.out.println("Tiempo de descanso: " +recorre.getTiempoDescanso());
            System.out.println("Información extra: " + recorre.getInforExtra());
            numE++;
        }
    }
}
