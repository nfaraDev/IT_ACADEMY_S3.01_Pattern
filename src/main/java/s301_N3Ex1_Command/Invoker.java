package s301_N3Ex1_Command;

public class Invoker {
    /*6-Crear una clase Invoker que actúe como el invocador de los comandos.
    Esta clase tendrá métodos para asignar y ejecutar los comandos*/

    private Vehiculos command;

    public void setCommand(Vehiculos command) { //asigna comandos
        this.command = command;
    }

    public void ejecutaCommand() { //ejecuta comandos
        command.arrancar();
        command.acelerar();
        command.frenar();
    }
}
