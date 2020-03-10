package DB;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionUsuarios {
    private static Connection con;
   //private static final String driver ="com.mysql.jdbc.Driver"; //hacemos referencias al driver que sé conecto
   private static final String usuario= "root";
   private static final String pwd ="jUAM2017CNI";
   private static final String url= "jdbc:mysql://localhost:3306/bp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   /*MÉTODO PARA CONECTAR A LA BD*/
   
  public ConexionUsuarios(){
  }
  public static Connection getCon()
  {
      try { //carga la clase controlador
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda2","root","jUAM2017CNI");
            con=DriverManager.getConnection(url, usuario, pwd);
            if(con!=null){
                System.out.println("conexión establecida");
            }
        } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("Conexión fallida");
        }
      return con;
  }
  
  public static void close()
  {
      try {
          if(con != null)
              System.out.println("Conexión terminada");
             con.close();
      } catch (SQLException ex) {
      }
  }

  
}

