package observer;

public interface Sujeito {
    public void adicionarObserver(Observer o);
    public void removerObserver(Observer o);
    public void notificar();
}
