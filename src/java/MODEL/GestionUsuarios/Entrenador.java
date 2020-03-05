/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestionUsuarios;

/**
 *
 * @author Alex Lira
 */
public class Entrenador extends Usuario {
    
    private String tipo;
    private String direccion;
    private double telefono;

   
   
    public Entrenador(String nombre,String apellidoP,String apellidoM,int edad,String sexo,String nombreU,String passwordU,String correo,String tipoU,String direccion,double telefono,String tipo){
        
        super(nombre,apellidoP, apellidoM,edad,sexo, nombreU, passwordU,correo,tipoU);
        this.tipo=tipo;
        this.direccion=direccion;
        this.telefono=telefono;
        
    }
    public Entrenador(){
        super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public String visualizaDatos(){
        String inf= "\nINFORMACIÓN ENTRENADOR: " + super.informacion() + "\nTipo: " + tipo +
                "\nDireccion: " + direccion;
        return inf;
    }
    
}
