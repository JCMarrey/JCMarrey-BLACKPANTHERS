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
public class Administrador extends Usuario {
    

    private String direccion;
    private double telefono;
    
     public Administrador (String nombre,String apellidoP,String apellidoM,int edad,String sexo,String nombreU,String passwordU,String correo,String tipoU,String direccion,double telefono){
        super(nombre,apellidoP, apellidoM,edad,sexo,correo, nombreU,passwordU,tipoU);
        this.direccion=direccion;
        this.telefono=telefono;
    }

    public Administrador(){
        super();
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

    
}
