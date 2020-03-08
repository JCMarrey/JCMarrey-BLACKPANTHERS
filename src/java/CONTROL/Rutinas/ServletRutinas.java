/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL.Rutinas;

import MODEL.GestionRutinas.FabricaConcretaRutinaGeneral;
import MODEL.GestionRutinas.GestorRutina;
import MODEL.GestionRutinas.RutinaGeneral;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juanm
 */
@WebServlet(name = "ServletRutinas", urlPatterns = {"/ServletRutinas"})
public class ServletRutinas extends HttpServlet {
    
    FabricaConcretaRutinaGeneral rutinaGFC= new FabricaConcretaRutinaGeneral(); //para crear mi rutina General
    RutinaGeneral rutinaGeneral = new RutinaGeneral();
    GestorRutina gestorRutina= new GestorRutina();
    
    
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            System.out.println("VAMOS A LLENAR LOS DATOS DE LA RUTINA");
            System.out.println("Nombre de la rutina:");
            String nombreR = request.getParameter("nombreRutina");
            String seccion= request.getParameter("seccionR");
            System.out.println("Escriba el tipo de rutina: Pierna,Gluteos,EspaldaS");
            String tipoEjercicio =request.getParameter("tipoRutina");
            System.out.println("Imagen de la rutina:");
            String imagenR=request.getParameter("imagenRutina");
            System.out.println("Comentarios:");
            String comentarios=request.getParameter("comentarios");
            
            
              out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletAgregarEjercicio</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAgregarEjercicio at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            
            
            //ya recuperamos lo que acaba de ingresar el usuario
            
            //Crear instancia de mi RutinaGeneral;
            
           rutinaGeneral=new RutinaGeneral(nombreR,seccion,tipoEjercicio,imagenR,comentarios);
            
            // me comúnico ahora con mi paquete model
            
            gestorRutina.agregarRutina(rutinaGeneral,seccion);
            rutinaGFC.creaRutina(rutinaGeneral); //hay que mandarle los campos a nuestra clase FabricaConcretaRutinaGeneral
            
            
            //request.getRequestDispatcher("/BLACKPANTHERS_DSAGE/GUIEntrenador.jsp").forward(request, response);
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
