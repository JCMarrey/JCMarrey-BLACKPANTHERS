package MODEL.GestionUsuarios;

import DB.TablaAdministrador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Alex Lira
 */
public class GestorUsuarios {
    
    private static Administrador admin;
    private static Entrenador entrenador;
    private static Socio socio;
    
    TablaAdministrador tr= new TablaAdministrador();
    Administrador a = new Administrador();    
    ArrayList<Administrador>adm = new ArrayList();
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    public GestorUsuarios(){
        
    }
    
    public  boolean agregarAdmin(Usuario usu, Administrador admin){
        //primero construyo mi rutina y luego ya la agrego a la bd
                            
            //para ver que se agrego la admin a la db
            boolean agregar=tr.agregarAdmin(usu, admin);
            
            if(agregar){
                System.out.println("Admin agregado");                
            }else{
                System.out.println("No se agrego Admin :");
            }            
        return true;
    }
    
    
    public  boolean modificarAdmin(Administrador admin, String correo){
        
        /*
        if(tr.modificarRutinaGeneral(rutinaG)){
            System.out.println("Se modifico la rutina: GestorRutina");
         return true;
        
        }
        else{
            System.out.println("No se modifico la rutina");
            return false;
        }*/
        
        System.out.println("Admin a modificar: " +admin.getNombreU());
        System.out.println("Correo:" + correo);       
        
        if(tr.modificarAdmin2(admin, correo)){
            System.out.println("estamos en el gestor y a ver si si se modifica :V");
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public  boolean eliminarAdmin(Usuario usu){
        
        if(tr.eliminarAdmin(usu)){
            System.out.println("Admin eliminado");
            return true;
        }else{
            System.out.println("Admin no eliminado");
            return false;
        }
    }
    
    
     public  Administrador buscarAdmin(String correo){
       
        Administrador aux;
        aux=tr.cargarInfoAdministrador(correo);        
        return aux;         
    }
    
    
    public ArrayList mostrarAdmins (){
        ArrayList<Usuario> usuarios= tr.mostrarAdmins();
        System.out.println("VAMOS A VER DESDE EL GESTOR SI ES NULLO" + usuarios );
       return tr.mostrarAdmins();
    }
    
    
}