/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import MODEL.GestionRutinas.Ejercicio;
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
@WebServlet(name = "ServletGUI_AgregarEjercicio", urlPatterns = {"/ServletGUI_AgregarEjercicio"})
public class ServletGUI_AgregarEjercicio extends HttpServlet {

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
        try{
            /* TODO output your page here. You may use following sample code. */
            //SE RECUPERAN LOS DATOS DEL OBJETO "request"
            //ESTOS DATOS FUERON ENVIADOS DESDE LA PÁGINA "Agregar_Ejercicio.jsp"
            //CON EL MÉTODO "post
            String nombreEjercicio = request.getParameter("nombreEj");
            Byte numeroSeries = Byte.parseByte(request.getParameter("numSeries"));
            Byte numeroRepeticiones = Byte.parseByte(request.getParameter("numRep"));
            float tiempoDescanso = Float.parseFloat(request.getParameter("tiempoE"));
            String infoExtra = request.getParameter("comentarios");
            
            //String foto;
            //Se instancia un objeto de tipo ejercicio, instanciado con los parámetros recuperados con el objeto request.
            Ejercicio nuevoEjercicio= new Ejercicio(nombreEjercicio,numeroSeries,numeroRepeticiones,tiempoDescanso,infoExtra);
            System.out.println("jala:" + nuevoEjercicio.getInforExtra());
            System.out.println("jala:" + nuevoEjercicio.getNumeroRepeticiones());
            //onsole.log("jala:"+ nuevoEjercicio.getNumeroRepeticiones());
            //EN EL OBJETO  "request" SE ALMACENA EL OBJETO "alumno" EN EL ATRIBUTO
            //NOMBRADO "datosAlumno", EL CUAL SE CREA EN ESE MOMENTO
            request.setAttribute("datosEjercicio",nuevoEjercicio);
            //AHORA SE HACE UN REENVÍO (forward) DE LOS OBJETOS "request" Y "response"
            //A LA PÁGINA "visualizaDatosEjercicio.jsp"
            request.getRequestDispatcher("GestionRutinas/visualizaEjercicio.jsp").forward(request, response);
        }finally {
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
