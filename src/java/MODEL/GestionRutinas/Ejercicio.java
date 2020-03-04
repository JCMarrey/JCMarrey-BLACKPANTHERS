
package MODEL.GestionRutinas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio {

    private String nombreEjercicio;
    private byte numeroSeries;
    private byte numeroRepeticiones;
    private float tiempoDescanso;
    private String inforExtra;
    private String foto;

    public Ejercicio(String nombreEjercicio, byte numeroSeries, byte numeroRepeticiones, float tiempoDescanso, String inforExtra) {
        this.nombreEjercicio = nombreEjercicio;
        this.numeroSeries = numeroSeries;
        this.numeroRepeticiones = numeroRepeticiones;
        this.tiempoDescanso = tiempoDescanso;
        this.inforExtra = inforExtra;
    }

    public Ejercicio() {

    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public byte getNumeroSeries() {
        return numeroSeries;
    }

    public void setNumeroSeries(byte numeroSeries) {
        this.numeroSeries = numeroSeries;
    }

    public byte getNumeroRepeticiones() {
        return numeroRepeticiones;
    }

    public void setNumeroRepeticiones(byte numeroRepeticiones) {
        this.numeroRepeticiones = numeroRepeticiones;
    }

    public float getTiempoDescanso() {
        return tiempoDescanso;
    }

    public void setTiempoDescanso(float tiempoDescanso) {
        this.tiempoDescanso = tiempoDescanso;
    }

    public String getInforExtra() {
        return inforExtra;
    }

    public void setInforExtra(String inforExtra) {
        this.inforExtra = inforExtra;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Ejercicio agregarEjercicio() {
        Ejercicio ejercicioNuevo=new Ejercicio();
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nombre del ejericio");
            String nombreEjer = teclado.readLine();
            
            System.out.println("Número de series:");
            byte numSeries = Byte.parseByte(teclado.readLine());
            
            System.out.println("Número de repeticiones:");
            byte numeroRep= Byte.parseByte(teclado.readLine());
            
            System.out.println("Tiempo de descanso:");
            float tiempoD = Float.parseFloat(teclado.readLine());
            
            System.out.println("Información extra:");
            String infoEx = "";
            infoEx += teclado.readLine();
            
            //una vez leído todos los datos se instancia el nuevo ejercicio y se agrega al arrayList
            ejercicioNuevo = new Ejercicio(nombreEjer, numSeries, numeroRep, tiempoD, infoEx);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return ejercicioNuevo;
    }
    public Ejercicio modificarEjercicio(Ejercicio ejercicioE) {
        return ejercicioE;
    }

    public boolean eliminarEjercicio(Ejercicio ejercicioM) {
        return true;
    }

}

