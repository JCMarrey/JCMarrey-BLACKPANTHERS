package DB;

import MODEL.GestionRutinas.Ejercicio;
import MODEL.GestionRutinas.RutinaGeneral;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TablaRutinas {

    public TablaRutinas() {

    }

    //comenzamos con los métodos
    ResultSet rs;
    //llamamos a nuestra clase Conexión para poder realizar conexión a bd
    ConexionUsuarios cn = new ConexionUsuarios();
    Connection conec = null;
    RutinaGeneral rg = new RutinaGeneral();

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

    //para sacar todas mis rutinas
    public ArrayList buscarRutinasGenerales() {
        PreparedStatement ps = null; //mi consulta y usar la bd para enviar datos
        ArrayList<RutinaGeneral> rutinas = new ArrayList();
        rs = null;
        String sql = "SELECT*FROM RutinaGeneral";
        System.out.println("ENTRO A BUSCAR RUTINASGENERALES");
        try {
            conec = Conexion.getCon();
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                RutinaGeneral rutinaG = new RutinaGeneral();
                rutinaG.setNombre(rs.getNString("nombreRutina"));
                rutinaG.setSeccion(rs.getString("seccion"));
                rutinaG.setTipoRutina(rs.getString("tipoRutina"));
                rutinaG.setImagen(rs.getString("imagen"));
                rutinaG.setComentarios(rs.getString("comentarios"));
                rutinas.add(rutinaG);
            }
            return rutinas;

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

    public RutinaGeneral cargarInfoRutinaGeneral(String idRutinaGeneral) {
        PreparedStatement ps = null;
        conec = Conexion.getCon();
        rs = null;
        String sql = "SELECT*FROM rutinageneral WHERE nombreRutina= '"+idRutinaGeneral+"'";
        //se mandan los datos

        try {

            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                rg.setNombre(rs.getString("nombreRutina"));
                rg.setSeccion(rs.getString("seccion"));
                rg.setTipoRutina(rs.getString("tipoRutina"));
                rg.setImagen(rs.getString("imagen"));
                rg.setComentarios(rs.getString("comentarios"));

            }
            return rg;
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
    public boolean modificarRutinaGeneral(RutinaGeneral rg) {
        PreparedStatement ps = null;

        String sql = "UPDATE rutinageneral SET nombreRutina ='" + rg.getNombre() + "', seccion ='" + rg.getSeccion() + "',  tipoRutina='" + rg.getTipoRutina() + "', imagen='" + rg.getImagen() + "', comentarios='" + rg.getComentarios()
                + "' WHERE nombreRutina='" + rg.getNombre() + "'";
        //se mandan los datos
        try {
            conec = Conexion.getCon();
            ps = conec.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("RUTINA GENERAL ACTUALIZADA");
            return true; //agrego mi rutina :D
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("no sé actualizo la rutina");
            return false;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    public boolean modificarRutinaGeneral2(RutinaGeneral rg, String nombR) {
        PreparedStatement ps = null;

        String sql = "UPDATE rutinageneral SET nombreRutina=?,seccion =?,tipoRutina=?,imagen=?, comentarios=? where nombreRutina='" + nombR + "'";
        //se mandan los datos
        
        try {
            conec = Conexion.getCon();
            conec.prepareStatement(sql);
            ps.setString(1, rg.getNombre());
            ps.setString(2, rg.getSeccion());
            ps.setString(3, rg.getTipoRutina());
            ps.setString(4, rg.getImagen());
            ps.setString(5, rg.getComentarios());
            ps.executeUpdate();
            System.out.println("RUTINA GENERAL ACTUALIZADA");
            return true; //agrego mi rutina :D
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("no sé actualizo la rutina");
            return false;
        } finally {
            try {
                conec.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

     public boolean eliminarRutina(String nombreR) {
        PreparedStatement ps = null;
        String sql="DELETE FROM rutinageneral WHERE nombreRutina='"+nombreR+"'";
        try {
            conec=Conexion.getCon();
            ps=conec.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }
}
