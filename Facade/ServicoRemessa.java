package Facade;

public class ServicoRemessa {
    public static void shipProduct(Produto produto) {
        // Conecta-se a serviço externo de logística para enviar o produto
        System.out.println("Produto " + produto.name + " enviado com sucesso!");
    }
}
