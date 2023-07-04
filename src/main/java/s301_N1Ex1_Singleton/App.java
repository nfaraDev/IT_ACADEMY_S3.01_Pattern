package s301_N1Ex1_Singleton;

public class App {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();

        undo.agregarPedidosZapatillas("Pedido 001 = Zapatillas Alpargatas");
        undo.agregarPedidosZapatillas("Pedido 003 = Zapatillas ADIDAS");
        undo.agregarPedidosZapatillas("Pedidos 002 = Zapatos niño");

        undo.listarPedidosZapatillas();

        undo.eliminarPedidosZapatilas("Pedido 003 = Zapatillas ADIDAS");

        undo.listarPedidosZapatillas();



    }
}
