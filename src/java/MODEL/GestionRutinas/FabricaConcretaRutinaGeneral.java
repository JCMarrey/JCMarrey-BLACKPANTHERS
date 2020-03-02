
package MODEL.GestionRutinas;

public class FabricaConcretaRutinaGeneral extends FabricaAbstractaRutina {
    private RutinaGeneral rutinaGeneral;
    @Override
    public void creaRutina(String tipoRutina) {
        switch(tipoRutina){
            //FALTA INSTANCIAR BIEN LAS CLASES (colocar atributos necesarios)
           case "Pierna":   rutinaGeneral = new RutinaGeneral();break;
           case "Gluteos": rutinaGeneral = new RutinaGeneral();break;
           case "Espalda": rutinaGeneral = new RutinaGeneral();break;
           case "Abdomen": rutinaGeneral = new RutinaGeneral();break;
           case "Pecho": rutinaGeneral = new RutinaGeneral();break;
           case "Brazos": rutinaGeneral = new RutinaGeneral();break;
           case "Hombros": rutinaGeneral = new RutinaGeneral();break;
        }
    }

    @Override
    public Rutina getRutina() {
       return rutinaGeneral;
    }
}
