<%-- 
    Document   : AgregarRutinaGeneral
    Created on : 2/03/2020, 08:35:42 PM
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
        <form name="form1" action="ServletRutinas" method="post"> <!--Métodos para mandar informacipon al servidor-->
            <table  id="one-column-emphasis">
                <caption>
                    Agregar Rutina General
                </caption>

                <tr>
                    <td class="oce-first" > Tipo de rutina</td>
                    <td><select name="tipoRutina">
                        <option value="Pierna">Pierna</option>
                        <option value="Gluteos">Glúteos</option>
                        <option value="Espalda">Espalda</option>
                        <option value="Abdomen">Adomen</option>
                        <option value="Pecho">Pecho</option>
                        <option value="Brazos">Brazos</option>
                        <option value="Hombros">Hombros</option>
                    </td>
                </select>
                </td>  <!--Se usa para capturar el dato ingresado-->
                </tr>

                <tr>
                    <td class="oce-first" > Agregar Ejercicio </td>
                    <td><input class="default" type="text" name="ejercicioRG"</td>  <!--Se usa para capturar el dato ingresado-->
                    <td><button id="agregarEjercicio">
                            <a href="ServletRutinas?seleccion=2" target="_blank">+</a>
                        </button>
                    </td>
                </tr>
                <tr>
                    <td class="oce-first">
                        Comentarios
                    </td>

                    <td>
                        <textarea name="comentarios" cols="30" rows="2" class="default">
                            Escribir algún comentario sobre el ejercicio
                        </textarea>
                    </td>

                </tr>

                <tr style="text-align: center">
                    <td>
                        <input type="reset" value="Cancelar" class="default">

                    </td>
                    
                    <td>
                        <input type="submit" value="Guardar Rutina" class="default">
                    </td>

                </tr>

            </table>
        </form>
    </body>
</html>
