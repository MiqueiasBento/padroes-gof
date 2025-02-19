package pedidos;

import sanduiche.Sanduiche;

import java.util.ArrayList;
import java.util.List;

public class ListaPedidos {
    private static ListaPedidos instancia;
    private List<Sanduiche> pedidos;

    private ListaPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public static ListaPedidos getInstancia() {
        if (instancia == null) {
            instancia = new ListaPedidos();
        }
        return instancia;
    }

    public void adicionarSanduiche(Sanduiche sanduiche) {
        this.pedidos.add(sanduiche);
    }

    public void listarPedidos() {
        for(Sanduiche sanduiche : this.pedidos) {
            System.out.println(sanduiche.montarSanduiche() + " - R$ " + sanduiche.precoSanduiche());
        }
    }
}
