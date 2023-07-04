package s301_N3Ex1_Command;

public class App {
    public static void main(String[] args) {
        /* 8-Creamos el main para utilizar el patrón Command para ejecutar
         los comandos de cada vehículo en el orden deseado */

        Invoker invoker = new Invoker();

        // Crear instancias de los vehículos
        Avion avion = new Avion();
        Barco barco = new Barco();
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        /*Asignar los comandos a ejecutar, creamos una instancia de la clase Invoker
         y luego creamos instancias de los diferentes vehículos*/

        invoker.setCommand(avion);
        invoker.ejecutaCommand(); // El avion ha despegado. El avion ha acelerado. El avion ha frenado.

        invoker.setCommand(barco);
        invoker.ejecutaCommand(); // La barco ha zarpado. La barco ha acelerado. La barco ha frenado.

        invoker.setCommand(bicicleta); // La bicicleta ha arrancado. La bicicleta ha acelerado. La bicicleta ha frenado"
        invoker.ejecutaCommand();

        invoker.setCommand(coche); //El coche ha arranccado. El coche ha acelerado. El coche ha frenado"
        invoker.ejecutaCommand();
    }

}
