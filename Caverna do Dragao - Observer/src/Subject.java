
public interface Subject {
    void registrarObservador(Observer obs);
    void removerObservador(Observer obs);
    void notificar();
}
