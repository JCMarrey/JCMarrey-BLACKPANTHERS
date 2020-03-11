<%-- 
    Document   : agregarUsuario
    Created on : 4/03/2020, 03:12:58 PM
    Author     : Alex Lira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Admin</title>        
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
            
        <%@ page import="CONTROL.Usuarios.ServletAgregarUsuarioAdmin" %>
                        
                <STYLE type="text/css">
                   form { margin: 0 auto; width: 400px; padding: 1em; border: 1px solid #CCC; border-radius: 1em;}
                   button { padding-left: 10px; margin-left: 40%;}
                    
                </STYLE>
                <br><h1 align="center">¡UNA NUEVA EXPERIENCIA DE TRABAJO TE ESPERA!</h1><br>
          
         <div align="center">
             <img src="img/administrador.jpg" width="400" align="center" alt="No se pudo mostrar la imagen" border=0 hspace="20">
         </div> 
            <br><br>
                                  
        <h5 align="center">PARA AGREGAR UN ADMIN COMPLETA LOS SIGUIENTES CAMPOS:</h5>        
            
        <form action="ServletAgregarUsuarioAdmin" method="post">                                
                <label for="lname">Nombre(s):</label>
                <input type="text" id="nombre" name="nombre"><br><br>                
                <label for="fname">Apellido paterno:</label>
                <input type="text" id="aPaterno" name="aPaterno"><br><br>
                <label for="lname">Apellido materno:</label>
                <input type="text" id="aMaterno" name="aMaterno"><br><br>                
                <label for="lname">Edad:</label>
                <input type="text" id="edad" name="edad"><br><br>                 
                <label for="fname">Sexo:</label>
                <select name="sexo">
                    <option>Femenino</option>
                    <option>Masculino</option>                    
                </select> <br><br>                    
                <label for="lname">Nombre usuario:</label>
                <input type="text" id="nombreU" name="nombreU"><br><br>
                <label for="lname">Correo electrónico:</label>
                <input type="email" id="correo" name="correo"><br><br>
                <label for="lname">Contraseña de acceso:</label>
                <input type="password" id="password" name="password"><br><br>                                
                <label for="lname">Tipo de Usuario:</label>
                <input type="text" id="tipoU" name="tipoU" value="Administrador" ><br><br>
                <label for="lname">Domicilio:</label>
                <input type="text" id="direccion" name="direccion"><br><br>
                <label for="lname">Telefono:</label>
                <input type="text" id="telefono" name="telefono"><br><br>                
                <button type="submit" name="accion" value="agregarAdmin">Registrar</button>                
            </form> 
        
        <!--FooterGeneral-->
       <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </body>
</html>
