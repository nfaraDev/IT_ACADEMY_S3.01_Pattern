package s301_N2Ex1_FabricaAbstracta;

public abstract class FabricaNacional implements Fabrica {

    @Override
    public Direcciones creaDirecciones(String direcciones) {

        return new DireccionesNacionales();
    }

    @Override
    public Telefonos creaTelefonos(String numTelefonos) {

        return new TelefonosNacionales() ;
    }
}
