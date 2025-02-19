import Pedido.Item;
import Pedido.Pedido;
import frete.FretePAC;
import frete.FreteSedex;

public class EnvioPedidos {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new FretePAC());

        // Itens do pedido
        pedido.adicionarItem(new Item("Livro", 1.0, 50.0));
        pedido.adicionarItem(new Item("Notebook", 2.5, 2000.0));

        // Calculando total usando PAC
        double totalComPAC = pedido.calcularTotal();
        System.out.println("Total do pedido (PAC): R$ " + totalComPAC);

        // Trocando a estratégia de frete para SEDEX
        pedido.setFrete(new FreteSedex());

        // Recalculando total com SEDEX
        double totalComSEDEX = pedido.calcularTotal();
        System.out.println("Total do pedido (SEDEX): R$ " + totalComSEDEX);
    }
}