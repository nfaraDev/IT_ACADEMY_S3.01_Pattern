package s301_N2Ex1_FabricaAbstracta;

public abstract class FabricaInternacional implements Fabrica {

    @Override
    public Direcciones creaDirecciones(String direcciones) {

        return new DireccionesInternacionales(direcciones);
    }

    @Override
    public  Telefonos creaTelefonos(String numTelefonos) {

        return new TelefonosInternacionales();
    }

}

