<%-- 
    Document   : Agregar_Rutina
    Created on : 26/02/2020, 08:35:45 PM
    Author     : juanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Manejo de Formularios</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="estilos.css">   
        <script  type="text/javascript"  src="validaciones.js"  ></script>        
    </head>
    <body>
        <form name="form1" action="#" method="post"  onsubmit="return validarForma(this);" > <!--Métodos para mandar informacipon al servidor-->
            <input type="hidden" name="oculto" value="valorOculto">
            <table  id="one-column-emphasis">
                <caption>
                    Nombre del ejercicio
                </caption>
                    
                <tr>
                    <td class="oce-first" > Nombre del ejercicio</td>
                    <td><input class="default" type="text" name="nombreEj" value="Escribir el nombre del ejercicio"
                     </td>  <!--Se usa para capturar el dato ingresado-->
                </tr>
                
                 <tr>
                    <td class="oce-first" > Número de series </td>
                    <td><input class="default" type="number" name="numSeries" value="Número de series"
                     </td>  <!--Se usa para capturar el dato ingresado-->
                </tr>
               
                 <tr>
                    <td class="oce-first" > Número de repeticiones</td>
                    <td><input class="default" type="text" name="numRep" value="Número de repeticiones"
                     </td>  <!--Se usa para capturar el dato ingresado-->
                </tr>
                
                
                 <tr>
                    <td class="oce-first" > Tiempo de descanso entre serie</td>
                    <td><input class="default" type="number" name="nombreEj" value="Escribir el nombre del ejercicio"
                     </td>  <!--Se usa para capturar el dato ingresado-->
                </tr>
               
                <tr>
                    <td class="oce-first">
                        Comentarios
                    </td>
                    
                    <td>
                        <textarea name="comentarios" cols="30" rows="2" class="default" onfocus="this.selected();">
                            Escribir algún comentario sobre el ejercicio
                        </textarea>
                    </td>
                 
                </tr>
                
                <tr style="text-align: center">
                    <td>
                        <input type="reset" value="Cancelar" class="default">
                        
                    </td>
                    
                    <td>
                        <input type="submit" value="Enviar" class="default">
                    </td>
                    
                </tr>
                
            </table>
        </form>
    </body>
</html>
