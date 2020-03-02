package MODEL.GestionRutinas;

public class FabricaConcretaRutinaPersonalizada extends FabricaAbstractaRutina {

    private RutinaPersonalizada rutinaPersonalizada;
    
    @Override
    public void creaRutina(String tipoRutina) {
        switch (tipoRutina) {
            //FALTA INSTANCIAR BIEN LAS CLASES (colocar atributos necesarios)
            case "Pierna":
                rutinaPersonalizada = new RutinaPersonalizada();
                break;
            case "Gluteos":
                rutinaPersonalizada = new RutinaPersonalizada();
                break;
            case "Espalda":
                rutinaPersonalizada = new RutinaPersonalizada();
                break;
            case "Abdomen":
                rutinaPersonalizada = new RutinaPersonalizada();
                break;
            case "Pecho":
                rutinaPersonalizada = new RutinaPersonalizada();
                break;
            case "Brazos":
                rutinaPersonalizada = new RutinaPersonalizada();
                break;
            case "Hombros":
                rutinaPersonalizada = new RutinaPersonalizada();
                break;
        }
    }

    @Override
    public Rutina getRutina() {
        return rutinaPersonalizada;
    }
}
