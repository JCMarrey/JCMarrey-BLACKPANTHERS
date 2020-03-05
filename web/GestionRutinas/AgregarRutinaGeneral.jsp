
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AgregarMiRutinaGeneral</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="https://kit-free.fontawesome.com/releases/latest/css/free.min.css" media="all">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css">

    </head>
    <body>
        <!--llamar al header-->
        <jsp:include page="/WEB-INF/paginas/comunes/headerPersonal.jsp"/>


        <section id="actions" class="py-2 mb-2 bg-light">
            <div class="form-row">
                <div class="col-md-2 mb-3">
                    <a href="#" class="btn btn-primary btn-block" 
                       data-toggle="modal" data-target="#agregarEjercicioModal">
                        <!--agregar formulario
                         <i class="fas-plus"></i>-->Agregar Ejercicio
                    </a>
                </div>
            </div>
        </section>
        <jsp:include page="/GestionRutinas/AgregarEjercicio.jsp"/>

        <form name="formAgregarRGeneral" action="#" method="post">
            <div class="form-group">
                <label for="nombreRutina" text-align="center" >Nombre de la Rutina</label>
                <input class="col-md-12"type="text"  name="nombreRutina" >
            </div>
            <div class="form-group">
                <label for="tipoEjercicio"> Tipo de Rutina</label>
                <select class="col-md-12" name="tipoRutina">
                    <option value="Pierna">Pierna</option>
                    <option value="Gluteos">Glúteos</option>
                    <option value="Espalda">Espalda</option>
                    <option value="Abdomen">Abdomen</option>
                    <option value="Pecho">Pecho</option>
                    <option value="Brazos">Brazos</option>
                    <option value="Hombros">Hombros</option>
                </select>
            </div>

            <div class="form-group">
                <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4>Lista de Ejercicios</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>Nombre ejercicio</th>
                                <th>Repeticiones</th>
                                <th>Series</th>
                                <th></th> <!--Con esta voy a darle para el boton de editar rutina-->
                            </tr>
                        </thead>
 
                        <!--
                        <tbody>
                            <!--se usa cada elemento de la lista clientes para poder cargar todos los elementos
                                <c:forEach  var="cliente" items="${clientes}">
                                            <tr>
                                                <td>${cliente.idCliente}</td>
                                                <td>${cliente.nombre} ${cliente.apellid}</td>
                                                <td>${cliente.saldo}</td>
                                                <td>
                                                    <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idCliente=${cliente.idCliente}"
                                                       class="btn btn-secondary">
                                                        <i class="fas fa-angle-double-right"></i>Editar
                                                    </a>

                                                </td>
                                            </tr>
                                </c:forEach> 
                        </tbody>
                        -->
                    </table>
                </div>
            </div>
            </div>
            
            <div class="form-group">
                <label for="imagenRutina">Cargar Imagen Rutina</label>
                <input type="file" class="form-control-file" name="imagenRutina">
            </div>

            <div class="form-group">
                <label for="comentarios">Escribir algún comentario de la rutina</label>
                <textarea class="col-md-12" name="comentarios" rows="3"></textarea>
            </div>
                                                       
            <div class="form-row">
                <div class="form-group col-md-11">
                    <button class="btn btn-secondary" type="reset">Regresar</button>
                </div>
                <div class="form-group col-md-1">
                    <button class="btn btn-success" type="submit">Guardar rutina</button>
                </div>
            </div>
        </form>
        <!--llamar al footer--->
        <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </body>
</html>
