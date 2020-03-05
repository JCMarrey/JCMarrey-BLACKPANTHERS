<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Ejercicio</title>
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

        <!---Formulario para modificar los ejercicios-->
        <form action="#" method="POST">
            <!--este método lo procesa el dopost-->

            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"/>   


            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Ejercicio</h4>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label for="nombre">Nombre del ejercicio</label>
                                        <input type="text" class="form-control" name="nombre" required value="${ejercicio.nombreEjercicio}">

                                    </div>
                                    <div class="form-group">
                                        <label for="numeroSeries">Número de series</label>
                                        <input type="number" class="form-control" name="numeroSeries" required>

                                    </div>
                                    <div class="form-group">
                                        <label for="numRep">Número de repeticiones</label>
                                        <input type="number" class="form-control" name="numRep" required>

                                    </div>
                                    <div class="form-group">
                                        <label for="tiempoDes">Tiempo de descanso entre serie</label>
                                        <input type="number" class="form-control" name="tiempoDes" required step="any">

                                    </div>
                                    <div class="form-group">
                                        <label for="comentarios">Comentarios</label>
                                        <textarea class="form-control" name="comentarios" rows="3"></textarea>
                                    </div>

                                    <div class="form-group">
                                        <label for="imagenEjercicio">Cargar Imagen del ejercicio</label>
                                        <input type="file" class="form-control-file" name="imagenEjercicio">
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>    
                </div>
            </section>


        </form>
        <!--FooterGeneral-->
        <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </body>
</html>


