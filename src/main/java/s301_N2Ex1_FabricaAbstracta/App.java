package s301_N2Ex1_FabricaAbstracta;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Creamos una instancia de la fábrica Internacional
        Fabrica fabricaInternacional = new FabricaInternacional() {
            @Override
            public Telefonos creaTelefonos() {
                return null;
            }
        };
        Fabrica fabricaNacional = new FabricaNacional() {
            @Override
            public Telefonos creaTelefonos() {
                return null;
            }
        };

        // Solicitamos al usuario su teléfono y dirección
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su número de teléfono: ");
        String telefonos = scanner.nextLine();
        System.out.print("Ingrese su dirección: ");
        String direcciones = scanner.nextLine();

        // Determinar el país basado en la dirección proporcionada
        String pais = determinePais(direcciones);

        // Crear los objetos de dirección y teléfono según el país
        Direcciones creaDirecciones;
        Telefonos creaTelefonos;

        if (pais.equals("España")) {
            creaDirecciones = fabricaNacional.creaDirecciones(direcciones);
            creaTelefonos = fabricaNacional.creaTelefonos();
        } else {
            creaDirecciones = fabricaInternacional.creaDirecciones(direcciones);
            creaTelefonos = fabricaInternacional.creaTelefonos();
        }
        // Crear el objeto de contacto
        Contacto contacto = new Contacto("Usuario", telefonos, direcciones);

        // Imprimir los detalles de los objetos creados
        System.out.println("Direcciones: " + creaDirecciones.getDireccionesDetalles());
        System.out.println("Números de Teléfonos: " + creaTelefonos.getTelefonosDetalles());
    }

    public static String determinePais(String direcciones) {
        if (direcciones.toLowerCase().contains("españa")) {
            return "España";
        } else {
            return "Direccion Internacional";
        }
    }
}



