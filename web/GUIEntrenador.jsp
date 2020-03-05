
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="https://kit-free.fontawesome.com/releases/latest/css/free.min.css" media="all">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css">
        
    </head>
    <body>
        <header>
            <div class="barraPrincipal">
                <img src="img/Logo-header.jpg" alt="LogoBlackPanthers" class="imagen-header">
                <p class="usuario-header"> <i class="far fa-user-circle"></i> Nombre Usuario</p>
            </div>
            <nav class="barra-navegacion navbar navbar-expand-lg navbar-dark ">
                <ul class="navbar-nav alinear-nav">
                    
                    <li class=" dropdown elemento-nav">
                        <a class="nav-link dropdown-toggle" href="#" id="Nav-GestorRutinas" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Rutinas <!--Gestor Socios-->
                        </a>
                        <div class="dropdown-menu" aria-labelledby="Nav-GestorInventario">
                            <a class="dropdown-item" href="GestionRutinas/GUI_RutinasGenerales.jsp">Rutinas Generales</a>
                            <a class="dropdown-item" href="#">Rutinas Personalizadas</a>
                            
                        </div>
                    </li>
                  
                    
                    <li class=" dropdown elemento-nav">
                        <a class="nav-link dropdown-toggle" href="#" id="Nav-GestorInventario" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Socios <!--Gestor Socios-->
                        </a>
                        <div class="dropdown-menu" aria-labelledby="Nav-GestorInventario">
                            <a class="dropdown-item" href="#">Buscar en socios</a>
                            <a class="dropdown-item" href="#">Agregar Socio nuevo</a>
                            <a class="dropdown-item" href="#">Actualizar Socios</a> <!--Modificar-->
                            <a class="dropdown-item" href="#">Dar de baja a un Socio</a>
                        </div>
                    </li>
                    <li class=" dropdown elemento-nav">
                        <a class="nav-link dropdown-toggle" href="#" id="Nav-GestorInventario" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Ventas <!--Gestor Ventas-->
                        </a>
                        <div class="dropdown-menu" aria-labelledby="Nav-GestorInventario">
                            <a class="dropdown-item" href="#">Cobrar Producto</a>
                            <a class="dropdown-item" href="#">Cobrar Membresia</a>
                            <a class="dropdown-item" href="#">Cobrar entrada a evento</a>
                        </div>
                    </li>
                    <li class=" dropdown elemento-nav">
                        <a class="nav-link dropdown-toggle" href="#" id="Nav-GestorInventario" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Eventos <!--Gestor Ventas-->
                        </a>
                        <div class="dropdown-menu" aria-labelledby="Nav-GestorInventario">
                            <a class="dropdown-item" href="#">Buscar Eventos</a>
                            <a class="dropdown-item" href="#">Agregar Evento nuevo</a>
                            <a class="dropdown-item" href="#">Actualizar Eventos</a> <!--Modificar-->
                            <a class="dropdown-item" href="#">Eliminar Evento</a>
                        </div>
                    </li>
                    <li class=" dropdown elemento-nav">
                        <a class="nav-link dropdown-toggle" href="#" id="Nav-GestorInventario" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Membresias <!--Gestor Inventario-->
                        </a>
                        <div class="dropdown-menu" aria-labelledby="Nav-GestorInventario">
                            <a class="dropdown-item" href="#">Visualizar Membresias</a>
                            <a class="dropdown-item" href="#">Agregar Membresia nueva</a>
                            <a class="dropdown-item" href="#">Actualizar Membresias</a> <!--Modificar-->
                            <a class="dropdown-item" href="#">Eliminar Membresia</a>
                        </div>
                    </li>
                    <li class=" dropdown elemento-nav">
                        <a class="nav-link dropdown-toggle" href="#" id="Nav-GestorInventario" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Usuarios <!--Gestor Inventario-->
                        </a>
                        <div class="dropdown-menu" aria-labelledby="Nav-GestorInventario">
                            <a class="dropdown-item" href="#">Agregar un nuevo usuario</a>
                            <a class="dropdown-item" href="#">Actualizar usuarios</a> <!--Modificar-->
                            <a class="dropdown-item" href="#">Eliminar usuario</a>
                        </div>
                    </li>
                </ul>
            </nav>
        </header>
         <!--FooterGeneral-->
       <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </body>
</html>
