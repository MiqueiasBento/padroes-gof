package padaria;

import java.util.ArrayList;
import java.util.List;

public class Padaria implements Publisher {
    private String mensagem;
    private List<Subscriber> clientes;

    public Padaria() {
        clientes = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Subscriber s) {
        clientes.add(s);
    }

    @Override
    public void removerObservador(Subscriber s) {
        clientes.remove(s);
    }

    @Override
    public void notificar() {
        for (Subscriber s : clientes) {
            s.update(this.mensagem);
        }
    }

    public void novaFornada() {
        this.mensagem = "Nova fornada de pão quentinho está pronta!";
        notificar();
    }
}
