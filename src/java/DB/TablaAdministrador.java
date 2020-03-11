package DB;

import MODEL.GestionUsuarios.Usuario;
import MODEL.GestionUsuarios.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TablaAdministrador {

    public TablaAdministrador() {

    }
        
    ResultSet rs;
    ConexionUsuarios cn = new ConexionUsuarios();
    Connection conec;
    PreparedStatement ps; //mi consulta y usar la bd para enviar datos
    Administrador admin = new Administrador();
    
     public boolean buscarAdministrador(Administrador admin) {
        conec = ConexionUsuarios.getCon();        
        String sql = "SELECT*FROM RutinaGeneral WHERE correo=?";

        try {
            conec = Conexion.getCon();            
            ps = conec.prepareStatement(sql);
            ps.setString(1,admin.getCorreo());
            rs = ps.executeQuery();
            return rs.next();
            } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }        
        }        
    }
    
//para sacar todos mis registros de tabla administrador
    public ArrayList mostrarAdmins() {            
        ArrayList<Administrador> listAdmin = new ArrayList<>();                
        String sql = "SELECT*FROM administrador";                
        System.out.println("ENTRO A BUSCAR ADMINS");
        try {
            conec = ConexionUsuarios.getCon();            
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Administrador a = new Administrador();
                a.setNombre(rs.getNString("nombre"));
                a.setApellidoP(rs.getNString("aPaterno"));
                a.setApellidoM(rs.getNString("aMaterno"));
                a.setEdad(rs.getInt("ed"));
                a.setSex(rs.getNString("sexo"));
                a.setNombreU(rs.getNString("nombreU"));
                a.setCorreo(rs.getNString("correo"));
                a.setPaswordU(rs.getNString("password"));
                a.setTipoU(rs.getNString("tipoU"));
                a.setDireccion(rs.getNString("direccion"));
                a.setTelefono(rs.getDouble("telefono"));    
                 listAdmin.add(a);
            }
            System.out.println("VAMOS A VER DESDE la tabla SI ES NULLO" + listAdmin );
            return listAdmin;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    public Administrador cargarInfoAdministrador(String correo) {
        conec = Conexion.getCon();        
        String sql = "SELECT*FROM administrador WHERE correo= '"+correo+"'";
        //se mandan los datos

        try {

            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                admin.setNombre(rs.getString("nombre"));
                admin.setApellidoP(rs.getString("aPaterno"));
                admin.setApellidoM(rs.getString("aMaterno"));
                admin.setEdad(rs.getInt("edad"));
                admin.setSex(rs.getString("sexo"));
                admin.setNombreU(rs.getString("nombreU"));
                admin.setCorreo(rs.getNString("correo"));
                admin.setPaswordU(rs.getNString("password"));
                admin.setTipoU(rs.getNString("tipoU"));
                admin.setDireccion(rs.getNString("direccion"));
                admin.setTelefono(rs.getDouble("telefono"));    
                
            }
            return admin;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public boolean agregarAdmin(Usuario usu, Administrador admin) {
        conec = ConexionUsuarios.getCon();

        String sql = "INSERT INTO administrador (nombre,aPaterno,aMaterno,edad,sexo,nUsuario,correo,contrasena,tipoUsuario,domicilio,telefono) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        //se mandan los datos

        try {
            ps = conec.prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellidoP());
            ps.setString(3, usu.getApellidoM());
            ps.setInt(4, usu.getEdad());
            ps.setString(5, usu.getSex());
            ps.setString(6, usu.getNombreU());
            ps.setString(7, usu.getCorreo());           
            ps.setString(8, usu.getPaswordU());
            ps.setString(9, usu.getTipoU());
            ps.setString(10, admin.getDireccion());
            ps.setDouble(11, admin.getTelefono());
            
            ps.executeUpdate();

            System.out.println("ADMIN AGREGADO");
            return true; //agrego mi admin
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public boolean eliminarAdmin(Usuario usu) {
        conec = ConexionUsuarios.getCon();

        String sql = "DELETE  FROM administrador WHERE correo=?";
        //puede ser con eel id del usuario que sera invisible

        //mandar los datos
        try {
            ps = conec.prepareStatement(sql);
            ps.setString(1, usu.getCorreo());                       
            ps.executeUpdate();
            return true; //agrego usuarios
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public boolean modificarAdmin(Administrador admin) {        

        String sql = "UPDATE administrador SET nombre ='" + admin.getNombre() + "', aPaterno ='" + admin.getApellidoP() + 
                "',  aMaterno='" + admin.getApellidoM() + "', edad='" + admin.getEdad() + "', sexo='" + admin.getSex() + "', nUsuario='" + admin.getNombreU()
                + "', correo='" + admin.getCorreo() + "', contrasena='" + admin.getPaswordU() + "', tipoUsuario='" + admin.getTipoU() 
                + "', domicilio='" + admin.getDireccion() + "', telefono='" + admin.getTelefono()
                + "' WHERE correo='" + admin.getCorreo() + "'";
        //se mandan los datos
        try {
            conec = Conexion.getCon();
            ps = conec.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Admin actualizado");
            return true; //agrego mi rutina :D
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("No se actualizo Admin");
            return false;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    public boolean modificarAdmin2(Administrador admin, String correo) {        

        String sql = "UPDATE administrador SET nombre=?,aPaterno =?,aMaterno=?,edad=?,sexo=?,nUsuario=?,correo=?,contrasena=?,tipoUsuario=?,domicilio=?,telefono=?,where correo='" + correo + "'";
        //se mandan los datos
        
        try {
            conec = Conexion.getCon();
            conec.prepareStatement(sql);
            ps.setString(1, admin.getNombre());
            ps.setString(2, admin.getApellidoP());
            ps.setString(3, admin.getApellidoM());
            ps.setInt(4, admin.getEdad());
            ps.setString(5, admin.getSex());
            ps.setString(6, admin.getNombreU());
            ps.setString(7, admin.getCorreo());           
            ps.setString(8, admin.getPaswordU());
            ps.setString(9, admin.getTipoU());
            ps.setString(10, admin.getDireccion());
            ps.setDouble(11, admin.getTelefono());
            ps.executeUpdate();
            System.out.println("Admin actualizado");
            return true; //agrego mi rutina :D
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("No se actualizo Admin");
            return false;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }


}