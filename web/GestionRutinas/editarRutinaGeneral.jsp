
<%@page import="MODEL.GestionRutinas.GestorRutina"%>
<%@page import="MODEL.GestionRutinas.RutinaGeneral"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Rutina General</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="https://kit-free.fontawesome.com/releases/latest/css/free.min.css" media="all">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css">

    </head>
    <body>
        <!--llamar al header-->
        <jsp:include page="/WEB-INF/paginas/comunes/headerEntrenador.jsp"/>
        


        <!--
        <section id="actions" class="py-2 mb-2 bg-light">
            <div class="form-row">
                <div class="col-md-2 mb-3">
                    <a href="#" class="btn btn-primary btn-block" 
                       data-toggle="modal" data-target="#agregarEjercicioModal">
                        <!--agregar formulario
                         <i class="fas-plus"></i>
                    </a>
                </div>
            </div>
        </section>
        -->
        
         <%
            GestorRutina gr= new GestorRutina();
            String id=(String)request.getAttribute("nombreRA");
            RutinaGeneral rg= gr.buscarRutina(id);
        %>   
        
        
        
        <h2 style="text-align: center" >Modificar Rutina General</h2>
        
        <!--se manda al servlet rutinas-->
        <form class="container" name="formAgregarRGeneral" action="ServletRutinas" method="post" style="width: 800px;height:600px">
            <div class="form-group">
                <label for="nombreRutina" text-align="center" >Nombre de la Rutina</label>
                <input class="col-md-12"type="text"  name="nombreRutina" required value="<%=rg.getNombre()%>">
            </div>
             <div class="form-group">
                <label for="seccionR" text-align="center" >Sección de la rutina</label>
                <input class="col-md-12"type="text"  name="seccionR" value="Rutina General" readonly="readonly" required>
            </div>
            
            <div class="form-group">
                <label for="tipoEjercicio"> Tipo de Rutina</label>
                <select class="col-md-12" name="tipoRutina" required  value="<%=rg.getTipoRutina()%>">
                    <option value="<%=rg.getTipoRutina()%>"><%=rg.getTipoRutina()%></option>
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
                <label for="imagenRutina">Cargar Imagen Rutina</label>
                <input type="file" class="form-control-file" name="imagenRutina"  value="<%=rg.getImagen()%>"><%=rg.getImagen()%>
            </div>

            <div class="form-group">
                <label for="comentarios">Escribir algún comentario de la rutina</label>
                <textarea class="col-md-12" name="comentarios" rows="3"  value="<%=rg.getComentarios()%>"><%=rg.getComentarios()%></textarea>
            </div>
            
            <!--con este valor vamos a actualizar-->
            <div class="form-group">
                <input type="hidden"  name="txtid"  value="<%=rg.getNombre()%>">
            </div>
            <div class="form-group">
                <input type="submit" name="accion" value="actualizar" class="btn btn-secondary"/>
            </div>
            <div class="form-group col-md-11">
                <a href="ServletRutinas?accion=listar" class="btn btn-secondary" type="reset">Regresar</a>
            </div>                                      
        </form>
        <!--llamar al footer--->
        <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
    </body>
</html>
