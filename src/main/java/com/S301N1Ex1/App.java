package com.S301N1Ex1;

public class App {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();

        undo.agregarPedidosZapatillas("Pedido 001 = Zapatillas Alpargatas");
        undo.agregarPedidosZapatillas("Pedido 002 = Zapatos niño");

        undo.listarPedidosZapatillas();

        undo.eliminarPedidosZapatilas("Pedido 001 = Zapatillas Alpargatas");

        undo.listarPedidosZapatillas();


    }
}
