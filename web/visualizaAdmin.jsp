<%-- 
    Document   : visualizaAdmin
    Created on : 10/03/2020, 01:25:44 AM
    Author     : Alex Lira
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@ page import="MODEL.GestionUsuarios.Administrador" %> <%--administrador--%>
<%@ page import="MODEL.GestionUsuarios.GestorUsuarios" %> <%--gestor--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Admin</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
          <link rel="stylesheet" href="https://kit-free.fontawesome.com/releases/latest/css/free.min.css" media="all">
          <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
          <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
          <link href="CSS/estilos.css" rel="stylesheet" type="text/css">             
    </head>
    <body>
        <!--headerPersonal entrenador/administrador-->
        <jsp:include page="/WEB-INF/paginas/comunes/headerPersonal.jsp"/>
        
        <h1>LISTA DE ADMINISTRADORES</h1>
                        
           
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>                        
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">APELLIDO PATERNO</th>
                        <th class="text-center">APELLIDO MATERNO</th>
                        <th class="text-center">EDAD</th>
                        <th class="text-center">SEXO</th>
                        <th class="text-center">NOMBRE USUARIO</th>
                        <th class="text-center">CORREO</th>                        
                        <th class="text-center">TIPO DE USUARIO</th>
                        <th class="text-center">DOMICILIO</th>
                        <th class="text-center">TELEFONO</th>
                    </tr>
                </thead>
                <%
                    GestorUsuarios gestorU = new GestorUsuarios();                    
                    Administrador admin;
                    ArrayList<Administrador>lista=gestorU.mostrarAdmins();
                    Iterator<Administrador>iter=lista.iterator();                    
                    while(iter.hasNext()){
                        admin=iter.next();                    
                %>
                
                <tbody>
                    <tr>
                        <td class="text-center"><%= admin.getNombre() %></td>
                        <td class="text-center"><%= admin.getApellidoP() %></td>
                        <td class="text-center"><%= admin.getApellidoM() %></td>
                        <td class="text-center"><%= admin.getEdad() %></td>
                        <td class="text-center"><%= admin.getSex() %></td>
                        <td class="text-center"><%= admin.getNombreU() %></td>
                        <td class="text-center"><%= admin.getCorreo() %></td>
                        <td class="text-center"><%= admin.getTipoU() %></td>
                        <td class="text-center"><%= admin.getDireccion() %></td>
                        <td class="text-center"><%= admin.getTelefono() %></td>                                                
                        <td class="text-center">
                            <a class="btn btn-warning" href="ServletAgregarUsuarioAdmin?accion=editar&correo=<%= admin.getCorreo()%>">Editar</a>
                            <a class="btn btn-danger" href="ServletAgregarUsuarioAdmin?accion=eliminar&correo=<%= admin.getCorreo()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
        
        <!--FooterGeneral-->
       <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </body>
</html>
