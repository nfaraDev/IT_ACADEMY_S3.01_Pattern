package com.S301N1Ex1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    //1 Añade un campo estático privado a la clase Undo para almacenar la instancia Singleton
    //atributos
    private static Undo instance;// declaramos una variable estática instance de tipo Undo que almacenará la única instancia de la clase
    private List<String> pedidosZapatillas;//declaramos una lista pedidosZapatillas para almacenar los últimos pedidos de zapatillas introducidas

    //Constructor definimos un constructor privado para evitar que otras clases puedan instanciar la clase directamente.
    private Undo() {
        pedidosZapatillas = new ArrayList<>();
    }
    //getter
    //implementamos el método getInstance() para obtener la instancia de la clase dentro del campo estatico
    static synchronized Undo getInstance () { // el modificador synchronized para asegurar que solo un hilo pueda acceder a la creación de la instancia a la vez
        if(instance == null) {
            instance = new Undo (); //El método deberá devolver siempre esa instancia en todas las llamadas siguientes
        }
        return instance; //si la instancia ya se ha hecho y o es nula,devolvera la instancia

    }
    //metodos generales
    //el método agregarPedidoZapatillas() para añadir un pedido de zapatillas a la lista de pedidos
    public void agregarPedidosZapatillas(String pedido){
        pedidosZapatillas.add(pedido);
    }
    //implementamos el método eliminarPedidoZapatillas() para eliminar un pedido de zapatillas de la lista de pedidos
    public void eliminarPedidosZapatilas(String pedido) {
        pedidosZapatillas.remove(pedido);
    }
    //implementamos el método listarPedidosZapatillas() para mostrar por consola los últimos pedidos de zapatillas introducidos
    public void listarPedidosZapatillas() {
        for (String pedido : pedidosZapatillas) {
            System.out.println(pedido);
        }
    }
}
