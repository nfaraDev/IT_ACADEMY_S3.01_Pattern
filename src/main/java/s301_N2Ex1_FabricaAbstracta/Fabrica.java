package s301_N2Ex1_FabricaAbstracta;

public interface Fabrica {
    //actúa como la fábrica abstracta para crear objetos Address y PhoneNumber
    //contiene dos metodos para crear tel y direcciones

    public abstract Direcciones creaDirecciones(String direcciones);


    public abstract Telefonos creaTelefonos(String numTelefonos);


    Telefonos creaTelefonos();
}

