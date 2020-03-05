
<!--incluye todos, botones, páginas etc y se incluyen todo lo de bootstrap etc.-->
<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h5>Lista de clientes</h5>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                            <th>Nombre Rutina</th>
                            <th>Tipo Rutina</th>
                            <th></th> <!--Con esta voy a darle para el boton de editar rutina-->
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td>Prueba</td>
                                <td>Brazos</td>
                                <td><a href="EditarEjercicio.jsp" class="btn btn-secondary">Editar</a></td>
                            </tr>
                        </tbody>



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
    </div>
</section>