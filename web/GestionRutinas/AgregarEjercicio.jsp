<div class="modal fade" id="agregarEjercicioModal" >
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar Ejercicio</h5>
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>

                </button>  
            </div>

            
                <form action="#"  class="was-validated">
                    <div class="modal-body">
                        <div class="form-group">
                            <label for="nombre">Nombre del ejercicio</label>
                            <input type="text" class="form-control" name="nombre" required>

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
                            <input type="number" class="form-control" name="tiempoDes" required>

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

                    <div class="modal-footer">
                        <button class="btn btn-success" type="submit" >
                            GUARDAR
                        </button>
                    </div>    
                </form>
        </div>
    </div>
</div>