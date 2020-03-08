package MODEL.GestionRutinas;

import java.util.ArrayList;
import java.util.Scanner;

public class RutinaGeneral extends Rutina {

    private String nombre;
    private String tipoRutina;
    private ArrayList<Ejercicio> ejercicios;
    private Ejercicio ejercicioNuevo;
    private String seccion;
    private String imagen;
    private String comentarios;
    private Ejercicio ejercicio;

    public RutinaGeneral(String nombre, String tipoRutina, String seccion, String imagen, String comentarios) {
        this.nombre = nombre;
        this.tipoRutina = tipoRutina;
        this.seccion = seccion;
        this.imagen = imagen;
        this.comentarios = comentarios;
    }

     public RutinaGeneral(String tipoRutina,Ejercicio ejercicio) {
        
        this.tipoRutina = tipoRutina;
       this.ejercicio= ejercicio;
    }
    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public Ejercicio getEjercicioNuevo() {
        return ejercicioNuevo;
    }

    public void setEjercicioNuevo(Ejercicio ejercicioNuevo) {
        this.ejercicioNuevo = ejercicioNuevo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public RutinaGeneral(String tipoRutina, ArrayList<Ejercicio> e) {
        this.tipoRutina = tipoRutina;
        this.ejercicios = e;
    }

    public RutinaGeneral(String tipoRutina) {
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
    public Ejercicio agregarEjercicios() {
       
        ejercicioNuevo = new Ejercicio();
        ejercicioNuevo = ejercicioNuevo.agregarEjercicio(); //ya me regresa el ejercicio con sus datos

        return ejercicioNuevo;
    }

    @Override
    public void visualizaRutina(ArrayList<Ejercicio> e, Rutina rutina) {
        System.out.println("Nombre Rutina: " + this.nombre);
        System.out.println("Sección: " + this.seccion);
        System.out.println("Tipo: " + this.tipoRutina);
        System.out.println("Imagen: " + this.imagen);
        System.out.println("Comentarios: " + this.comentarios);
        System.out.println("Ahora comenzamos con los ejercicios de dichaRutina");
        
        /*for (Ejercicio recorre : ejercicios) {
            byte numE = 1;
            System.out.println("Ejercicio" + numE);
            System.out.println("Nombre del ejercicio: " + recorre.getNombreEjercicio());
            System.out.println("Número de series: " + recorre.getNumeroSeries());
            System.out.println("Numero de Repeticiones: " + recorre.getNumeroRepeticiones());
            System.out.println("Tiempo de descanso: " + recorre.getTiempoDescanso());
            System.out.println("Información extra: " + recorre.getInforExtra());
            numE++;
        }*/
    }
}
