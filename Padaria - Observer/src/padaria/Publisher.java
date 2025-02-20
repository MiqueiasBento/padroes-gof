package padaria;

public interface Publisher {
    public void adicionarObservador(Subscriber s);
    public void removerObservador(Subscriber s);
    public void notificar();
}
