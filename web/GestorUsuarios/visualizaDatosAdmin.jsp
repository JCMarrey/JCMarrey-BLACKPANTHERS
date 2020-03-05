<%-- 
    Document   : visualizaDatosUsuario
    Created on : 5/03/2020, 10:41:57 AM
    Author     : Alex Lira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos registrados</title>
    </head>
    <body>                
        <%@ page import="MODEL.GestionUsuarios.Administrador" %>                
         <%@ page import="MODEL.GestionUsuarios.Usuario" %>
        <% 
            Usuario usuario = (Usuario) request.getAttribute("datosUsuario");           
            Administrador adminU = (Administrador) request.getAttribute("datosAdministrador");
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
                <td> <%= adminU.getTipoU() %> </td>
            </tr>            
            <tr>
                <td align="right">Domicilio: </td>
                <td> <%= adminU.getDireccion() %> </td>
            </tr>
            <tr>
                <td align="right">Telefono: </td>
                <td> <%= adminU.getTelefono() %> </td>
            </tr>            
        </table>
            
        <form action="index.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>
