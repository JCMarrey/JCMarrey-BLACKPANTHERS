<%-- 
    Document   : ListaRutinasGenerales
    Created on : 9/03/2020, 10:55:40 AM
    Author     : juanm
--%>

<%@page import="java.util.Iterator"%>
<%@page import="MODEL.GestionRutinas.GestorRutina"%>
<%@page import="java.util.ArrayList"%>
<%@page import="MODEL.GestionRutinas.RutinaGeneral"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de rutinas Generales</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="https://kit-free.fontawesome.com/releases/latest/css/free.min.css" media="all">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
       <jsp:include page="/WEB-INF/paginas/comunes/headerEntrenador.jsp"/>
       
       <div class="container">
            <div class="row">
                <div class="col-md-2">
                    <a href="ServletRutinas?accion=add" class="btn btn-primary btn-block">
                        <!--AgregarRutinaGeneral.jsp-->
                        <!--AQUÍ HAY QUE MANDARLO AL SERVLET-->
                        Agregar Rutina
                    </a>
                </div>
                <div class="col-md-10">
                    <input type="text" name="buscarRutina" placeholder="buscar rutina"/>
                </div>

            </div>
        </div>
      
        <section id="clientes">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header">
                                <h5>Lista de rutinas generales</h5>
                            </div>
                            <table class="table table-striped">
                                <thead class="thead-dark">
                                    <tr>
                                        <th>Nombre Rutina</th>
                                        <th>Sección Rutina</th>
                                        <th>Tipo de Rutina</th>
                                        <th>Imagen</th>
                                        <th>Comentarios</th>
                                        <th></th> <!--Con esta voy a darle para el boton de editar rutina-->
                                        <th></th>
                                    </tr>
                                </thead>
                                <%
                                  GestorRutina gestorR = new GestorRutina();
                                  RutinaGeneral rutinaG = null;
                                  ArrayList<RutinaGeneral> rutinas = gestorR.buscarRutinas();
                                  Iterator <RutinaGeneral> iter= rutinas.iterator();
                                  while(iter.hasNext()){
                                      rutinaG=iter.next();
                                  
                                %>

                                <tbody>
                                    <tr>
                                        <tr>
                                        <!--aquí voy a instanciar mi objeto rutinageneral para ir jalando los datos-->
                                        <td><%=rutinaG.getNombre()%></td>
                                        <td><%=rutinaG.getSeccion()%></td>
                                        <td><%=rutinaG.getTipoRutina()%></td>
                                        <td><%=rutinaG.getImagen()%></td>
                                        <td><%=rutinaG.getComentarios()%></td>
                                        <td><a href="ServletRutinas?accion=editar&nombreRutinaG=<%= rutinaG.getNombre()%>" class="btn btn-secondary">Editar</a></td> 
                                        
                                        <td><a href="ServletRutinas?accion=eliminar&nombreRutina=<%=rutinaG.getNombre()%>" class="btn btn-secondary">Eliminar</a></td> 
                                    </tr>
                                    </tr>
                                <%}%>
                                </tbody
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
 
   
    </body>
    <!--
    <footer>
        <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </footer-->
</html>
