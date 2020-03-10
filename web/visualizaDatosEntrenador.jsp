<%-- 
    Document   : visualizaDatosEntrenador
    Created on : 5/03/2020, 12:48:08 PM
    Author     : Alex Lira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos registrados</title>
    </head>
    <body>                
        <%@ page import="MODEL.GestionUsuarios.Entrenador" %>                
         <%@ page import="MODEL.GestionUsuarios.Usuario" %>
        <% 
            Usuario usuario = (Usuario) request.getAttribute("datosUsuario");           
           Entrenador entrenaU = (Entrenador) request.getAttribute("datosEntrenador");
        %> 
        <h2> Aqui se despliegan los datos que envió el servlet</h2>
        <p> Datos del Usuario: </p>
        <table cellspacing="3" cellpadding="3" border="1" >
            <tr>
                <td align="right"> Nombre: </td>
                <td> <%= usuario.getNombre() %> </td>
            </tr>
            <tr>
                <td align="right">Apellido paterno: </td>
                <td> <%= usuario.getApellidoP() %> </td>
            </tr>
            <tr>
                <td align="right">Apellido materno: </td>
                <td> <%= usuario.getApellidoM() %> </td>
            </tr>
            <tr>
                <td align="right">Edad: </td>
                <td> <%= usuario.getEdad() %> </td>
            </tr>
            <tr>
                <td align="right">Sexo: </td>
                <td> <%= usuario.getSex() %> </td>
            </tr>
            <tr>
                <td align="right">Nombre de usuario: </td>
                <td> <%= usuario.getNombreU() %> </td>
            </tr>
            <tr>
                <td align="right">Correo electronico: </td>
                <td> <%= usuario.getCorreo() %> </td>
            </tr>
            <tr>
                <td align="right">Contraseña: </td>
                <td> <%= usuario.getPaswordU() %> </td>
            </tr>
            <tr>
                <td align="right">Tipo de Usuario: </td>
                <td> <%= entrenaU.getTipoU() %> </td>
            </tr>            
            <tr>
                <td align="right">Tipo de Entrenador: </td>
                <td> <%= entrenaU.getTipo()%> </td>
            </tr>  
            <tr>
                <td align="right">Domicilio: </td>
                <td> <%= entrenaU.getDireccion() %> </td>
            </tr>
            <tr>
                <td align="right">Telefono: </td>
                <td> <%= entrenaU.getTelefono() %> </td>
            </tr>            
        </table>
            
        <form action="index.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>
