package DB;

import MODEL.GestionRutinas.Ejercicio;
import MODEL.GestionRutinas.RutinaGeneral;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TablaAdministrador {

    public TablaAdministrador() {

    }

    //comenzamos con los métodos
    ResultSet rs;
    //llamamos a nuestra clase Conexión para poder realizar conexión a bd
    ConexionUsuarios cn = new ConexionUsuarios();
    Connection conec = null;

    public boolean agregarRutinaGeneral(RutinaGeneral rutinaG) {

        PreparedStatement ps = null;
        conec = ConexionUsuarios.getCon();

        String sql = "INSERT INTO RutinaGeneral (nombreRutina,seccion,tipoRutina,imagen,comentarios) VALUES(?,?,?,?,?)";
        //se mandan los datos

        try {

            ps = conec.prepareStatement(sql);

            ps.setString(1, rutinaG.getNombre());
            ps.setString(2, rutinaG.getSeccion());
            ps.setString(3, rutinaG.getTipoRutina());
            ps.setString(4, rutinaG.getImagen());
            ps.setString(5, rutinaG.getComentarios());
            ps.executeUpdate();

            System.out.println("RUTINA GENERAL AGREGADA");
            return true; //agrego mi rutina :D
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

    public boolean eliminarRutinaGeneral(RutinaGeneral rutinaG) {

        PreparedStatement ps = null; //mi consulta y usar la bd para enviar datos
        conec = ConexionUsuarios.getCon();

        String sql = "DELETE  FROM RutinaGeneral WHERE nombreRutina=?";
        //puede ser con eel id del usuario que sera invisible

        //mandar los datos
        try {

            ps = conec.prepareStatement(sql);
            ps.setString(1, rutinaG.getNombre());
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

    public boolean agregarEjercicio(Ejercicio ejercicio) {

        PreparedStatement ps = null;
        conec = ConexionUsuarios.getCon();

        String sql = "INSERT INTO ejercicios (nombreEjercicio,numeroSeries,numeroRepeticiones,tiempoDescanso,comentarios,imagen,RutinaGeneral_nombreRutina) VALUES(?,?,?,?,?,?,?)";
        //se mandan los datos

        try {

            ps = conec.prepareStatement(sql);

            ps.setString(1, ejercicio.getNombreEjercicio());
            ps.setInt(2, ejercicio.getNumeroSeries());
            ps.setInt(3, ejercicio.getNumeroRepeticiones());
            ps.setFloat(4, ejercicio.getTiempoDescanso());
            ps.setString(5, ejercicio.getInforExtra());
            ps.setString(6, ejercicio.getFoto());
            ps.setString(7, ejercicio.getNombreRutina());
            ps.executeUpdate();

            System.out.println("Ejercicio Agregado");
            return true; //agrego mi rutina :D
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

    public boolean buscarRutinaGeneral(RutinaGeneral rutinaG) {
        PreparedStatement ps = null; //mi consulta y usar la bd para enviar datos
        conec = ConexionUsuarios.getCon();
        rs = null;
        String sql = "SELECT*FROM RutinaGeneral WHERE nombreRutina=?";

        try {
            ps = conec.prepareStatement(sql);
            ps.setString(1, rutinaG.getNombre());
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


}