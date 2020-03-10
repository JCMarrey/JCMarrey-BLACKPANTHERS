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

    String listar = "GestionRutinas/ListaRutinasGenerales.jsp";
    String add = "GestionRutinas/AgregarRutinaGeneral.jsp";
    String edit = "GestionRutinas/editarRutinaGeneral.jsp";
    FabricaConcretaRutinaGeneral rutinaGFC = new FabricaConcretaRutinaGeneral(); //para crear mi rutina General
    RutinaGeneral rutinaGeneral,rutinaGeneral2= new RutinaGeneral();
    GestorRutina gestorRutina = new GestorRutina();

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
        try (PrintWriter out = response.getWriter()){ 
            /* TODO output your page here. You may use following sample code. */
        
        String action = request.getParameter("accion");

        switch (action) {
            case "listar":
                request.getRequestDispatcher(listar).forward(request, response);
                break;
            case "add":
                request.getRequestDispatcher(add).forward(request, response);
                break;
            case "agregarRG":
                System.out.println("VAMOS A LLENAR LOS DATOS DE LA RUTINA");
                String nombreR = request.getParameter("nombreRutina");
                String seccion = request.getParameter("seccionR");
                String tipoEjercicio = request.getParameter("tipoRutina");
                String imagenR = request.getParameter("imagenRutina");
                String comentarios = request.getParameter("comentarios");

                //ya recuperamos lo que acaba de ingresar el usuario
                //Crear instancia de mi RutinaGeneral;
                rutinaGeneral = new RutinaGeneral(nombreR, tipoEjercicio, seccion, imagenR, comentarios);

                // me comúnico ahora con mi paquete model
                gestorRutina.agregarRutina(rutinaGeneral, seccion);
                rutinaGFC.creaRutina(rutinaGeneral); //hay que mandarle los campos a nuestra clase FabricaConcretaRutinaGeneral
                
                request.getRequestDispatcher(listar).forward(request, response);
                break;
                
            case "editar":
                
                request.setAttribute("nombreRA",request.getParameter("nombreRutinaG"));
                request.getRequestDispatcher(edit).forward(request, response);
                break;
                
            case "actualizar":
                
                
                System.out.println("VAMOS A LLENAR LOS DATOS DE LA RUTINA");
                String idRutina=request.getParameter("txtid");
                
                String nombreRR = request.getParameter("nombreRutina");
                String seccionR = request.getParameter("seccionR");
                String tipoEjercicioR = request.getParameter("tipoRutina");
                String imagenRR = request.getParameter("imagenRutina");
                String comentariosR = request.getParameter("comentarios");
                
                /*
                
                rutinaGeneral2.setIdRutina(idRutina);
                rutinaGeneral2.setNombre(nombreRR);
                rutinaGeneral2.setSeccion(seccionR);
                rutinaGeneral2.setTipoRutina(tipoEjercicioR);
                rutinaGeneral2.setImagen(imagenRR);
                rutinaGeneral2.setComentarios(comentariosR);
                */
                rutinaGeneral2 = new RutinaGeneral(nombreRR, tipoEjercicioR, seccionR, imagenRR, comentariosR);
               
                //ya recuperamos lo que acaba de ingresar el usuario
                //Crear instancia de mi RutinaGeneral;
                gestorRutina.modificarRutina(rutinaGeneral2,nombreRR);
                request.getRequestDispatcher(listar).forward(request, response);
                break;
                
            case "eliminar":
                
                String nombreRutina= request.getParameter("nombreRutina");
                gestorRutina.eliminarRutina(nombreRutina);
                request.getRequestDispatcher(listar).forward(request, response);
                break;
        }
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
