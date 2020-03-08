
package MODEL.GestionUsuarios;

/**
 *
 * @author Alex Lira
 */
public class Usuario {

    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private String sex;
    private String correo;
    private String nombreU;
    private String paswordU;
    private String tipoU;
    
    //private String tipoUsuario;
        
    public Usuario(){
        
    }
    public Usuario(String nombre,String apellidoP,String apellidoM,int edad,String Sexo,String nombreU,String passwordU,String correo,String tipoU){
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
        this.edad=edad;
        this.sex=Sexo;
        this.nombreU=nombreU;
        this.paswordU=passwordU;
        this.correo=correo;
        this.tipoU=tipoU;
        
    }

    public Usuario(String nombreU){
        this.nombreU=nombreU;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getPaswordU() {
        return paswordU;
    }

    public void setPaswordU(String paswordU) {
        this.paswordU = paswordU;
    }

    public String getTipoU() {
        return tipoU;
    }

    public void setTipoU(String tipoU) {
        this.tipoU = tipoU;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
  
    public String informacion() {
         
        String info;
        info="Nombre: " + nombre + "\nApellido Paterno: " +apellidoP + "\nApellido Materno: " +  apellidoM + 
                "\nEdad: " + edad  + "\n Sexo: "+sex +"Nombre Usuario: "  + nombreU 
              + "Contraseña: " + paswordU  + "\nCorreo electrónico: " + correo  + "\n Tipo: " + tipoU;
        return info;
    }
  
    
}
