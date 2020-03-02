
package MODEL.GestionRutinas;

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

    public Ejercicio(){
        
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
   
    public Ejercicio agregarEjercicio(Ejercicio ejercicioM){
        return ejercicioM;
    }
    public Ejercicio modificarEjercicio(Ejercicio ejercicioE){
        return ejercicioE;
    }
    public boolean eliminarEjercicio(Ejercicio ejercicioM){
        return true;
    }
   
}
