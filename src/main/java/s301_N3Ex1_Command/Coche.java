package s301_N3Ex1_Command;

public class Coche implements Vehiculos{
    /*5-Se implementan las clases concretas para todos los vehículos (coche, bicicleta, avión y barco)
    que implementen la interfaz Vehiculos y definan el comportamiento específico de cada método*/

    public void arrancar(){

        System.out.println("El coche ha arrancado");
    }
    public void acelerar(){

        System.out.println("El coche ha acelerado");
    }
    public void frenar(){
        System.out.println("El coche ha frenado");

    }

}
