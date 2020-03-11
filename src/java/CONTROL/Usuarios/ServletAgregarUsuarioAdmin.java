package CONTROL.Usuarios;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MODEL.GestionUsuarios.Usuario;
import MODEL.GestionUsuarios.Administrador;
import DB.TablaAdministrador;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Alex Lira
 */

@WebServlet(name = "ServletAgregarUsuarioAdmin", urlPatterns = {"/ServletAgregarUsuarioAdmin"})

public class ServletAgregarUsuarioAdmin extends HttpServlet {
    
    String agregarAdmin="web/agregarUsuarioAdmin.jsp";
    String eliminarAdmin="web/eliminarUsuarioAdmin.jsp";
    String modificarAdmin="web/modificarUsuarioAdmin.jsp";
    Usuario usu = new Usuario();
    Administrador admin = new Administrador();
           
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet socios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet socios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        String acceso ="";
        String action = request.getParameter("accion");               
        
        if(action.equalsIgnoreCase("agregarAdmin")){
            //SE RECUPERAN LOS DATOS DEL OBJETO "request"
            //ESTOS DATOS FUERON ENVIADOS DESDE LA PÁGINA "agregarUsuario.jsp"
            //CON EL MÉTODO "post"            
            String nombre= request.getParameter("nombre");            
            String apellidoP= request.getParameter("aPaterno");
            String apellidoM= request.getParameter("aMaterno");            
            String edad=request.getParameter("edad");
            int ed=Integer.parseInt(edad);            
            String sexo= request.getParameter("sexo");          
            String nombreU = request.getParameter("nombreU");
            String correo= request.getParameter("correo");
            String password= request.getParameter("password");
            String tipoU= request.getParameter("tipoU");            
            String direccion= request.getParameter("direccion");
            String telefono= request.getParameter("telefono");            
            double tel=Double.parseDouble(telefono);
            
            usu.setNombre(nombre); 
            usu.setApellidoP(apellidoP);
            usu.setApellidoM(apellidoM);
            usu.setEdad(ed);
            usu.setSex(sexo);
            usu.setNombreU(nombreU);
            usu.setPaswordU(password);
            usu.setCorreo(correo);
            usu.setTipoU(tipoU);
            admin.setDireccion(direccion);
            admin.setTelefono(tel);
        }
                       
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
