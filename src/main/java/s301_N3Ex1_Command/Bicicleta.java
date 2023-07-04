package s301_N3Ex1_Command;

public class Bicicleta implements Vehiculos{
    /*4-Se implementan las clases concretas para todos los vehículos (coche, bicicleta, avión y barco)
    que implementen la interfaz Vehiculos y definan el comportamiento específico de cada método*/

    public void arrancar(){

        System.out.println("la bicicleta ha arrancado");
    }
    public void acelerar(){

        System.out.println("la bicicleta ha acelerado");
    }
    public void frenar(){

        System.out.println("la bicicleta ha frenado");

    }

}
