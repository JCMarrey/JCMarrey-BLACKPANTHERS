<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rutinas Generales</title>
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

        <div class="container">
            <div class="row">
                <div class="col-md-2">
                    <a href="AgregarRutinaGeneral.jsp" class="btn btn-primary btn-block">
                        <!--AQUÍ HAY QUE MANDARLO AL SERVLET-->
                        Agregar Rutina
                    </a>
                </div>
                <div class="col-md-10">
                    <input type="text" name="buscarRutina" placeholder="buscar rutina"/>
                </div>

            </div>

        </div>


        <jsp:include page="ListadoDeRutinas.jsp"/>

        <!--FooterGeneral-->
        <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </body>
</html>









