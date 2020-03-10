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

/**
 *
 * @author Alex Lira
 */
@WebServlet(name = "ServletAgregarUsuarioAdmin", urlPatterns = {"/ServletAgregarUsuarioAdmin"})
public class ServletAgregarUsuarioAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletGUIAgregarSocio</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletGUIAgregarSocio at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
            
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
            
            //SE CREA UNA INSTANCIA DE LA CLASE "Administrador" Y SE INICIALIZA CON 
            //LOS DATOS RECUPERADOS PREVIAMENTE DEL OBJETO "request"
            Administrador usuarioAdmin = new Administrador (nombre, apellidoP, apellidoM, ed, sexo, nombreU, password, correo, tipoU, direccion, tel);
            Usuario usuario = new Usuario (nombre, apellidoP, apellidoM, ed, sexo, nombreU, password, correo, tipoU);
            
            //EN EL OBJETO  "request" SE ALMACENA EL OBJETO "datosAdministrador y datosEntrenador" EN EL ATRIBUTO
            //NOMBRADO "usuarioAdmin y usuarioEntrena", EL CUAL SE CREA EN ESE MOMENTO
            request.setAttribute("datosAdministrador",usuarioAdmin);            
            request.setAttribute("datosUsuario",usuario);
            
            //AHORA SE HACE UN REENVÍO (forward) DE LOS OBJETOS "request" Y "response"
            //A LA PÁGINA "visualizaDatosUsuario.jsp"
            request.getRequestDispatcher("/visualizaDatosAdmin.jsp").forward(request, response);
        } finally {
            out.close();
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
