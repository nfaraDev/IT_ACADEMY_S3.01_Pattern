package s301_N3Ex1_Command;

public interface Vehiculos {
    /* 1-Se define una interfaz que contenga los métodos arrancar(), acelerar() y frenar().
     Esta interfaz actuará como el comando que se ejecutará para cada vehículo*/

    public void arrancar();
    public void acelerar();
    public void frenar();
}
