package Facade;

public class TesteFacade {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Smartphone");

        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.processarPedido(produto);
    }
}
