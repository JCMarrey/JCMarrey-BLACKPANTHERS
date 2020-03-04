<%-- 
    Document   : visualizaEjercicio
    Created on : 2/03/2020, 10:57:50 AM
    Author     : juanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="MODEL.GestionRutinas.Ejercicio" %>
        <%
            Ejercicio ejercicio = (Ejercicio) request.getAttribute("datosEjercicio");
        %>
        <h1>Prueba para ver que si guardo los datos</h1>
        <h2> Aqui se despliegan los datos que envió el servlet</h2>
        <table cellspacing="3" cellpadding="3" border="1" >
            <tr>
                <td align="right"> Nombre del Ejercicio </td>
                <td> <%= ejercicio.getNombreEjercicio() %> </td>
            </tr>
            <tr>
                <td align="right"> Número de series </td>
                <td> <%= ejercicio.getNumeroSeries() %> </td>
            </tr>
            <tr>
                <td align="right"> Número de repeticiones </td>
                <td> <%= ejercicio.getNumeroRepeticiones() %> </td>
            </tr>
            
            <tr>
                <td align="right"> Tiempo de descanso entre serie </td>
                <td> <%= ejercicio.getTiempoDescanso() %> </td>
            </tr>
            
            <tr>
                <td align="right"> Número de series </td>
                <td> <%= ejercicio.getInforExtra() %> </td>
            </tr>
            
        </table>
        <form action="index.jsp" method="get">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>
