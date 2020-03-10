<%-- 
    Document   : modificarUsuarioAdmin
    Created on : 9/03/2020, 05:34:42 PM
    Author     : Alex Lira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Admin</title>
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
        
        <STYLE type="text/css">
                   form { margin: 0 auto; width: 400px; padding: 1em; border: 1px solid #CCC; border-radius: 1em;}
                   button { padding-left: 10px; margin-left: 40%;}
                    
                </STYLE>                
          
         <div align="center">
             <img src="img/administrador.jpg" width="400" align="center" alt="No se pudo mostrar la imagen" border=0 hspace="20">
         </div> 
            <br><br>
                                  
        <h5 align="center">PARA MODIFICAR UN ADMIN COMPLETA LOS SIGUIENTES CAMPOS:</h5>        
            
        <form action="#" method="post">                                                                   
                <label for="lname">Nombre usuario:</label>
                <input type="text" id="nombreU" name="nombreU"><br><br>
                                
                <button type="submit">Buscar</button>                
            </form> 
        
        <!--FooterGeneral-->
       <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </body>
</html>
