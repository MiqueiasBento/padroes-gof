import padaria.Cliente;
import padaria.Padaria;
import padaria.Publisher;
import padaria.Subscriber;

public class SistemaDeNotificacao {
    public static void main(String[] args) {
        Publisher padaria = new Padaria();
        Subscriber cliente1 = new Cliente("João");
        Subscriber cliente2 = new Cliente("Maria");
        Subscriber cliente3 = new Cliente("Joana");

        padaria.adicionarObservador(cliente1);
        padaria.adicionarObservador(cliente2);
        padaria.adicionarObservador(cliente3);

        padaria.notificar();

        padaria.removerObservador(cliente2);
        padaria.notificar();
    }
}