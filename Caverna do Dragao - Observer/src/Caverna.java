import java.util.ArrayList;
import java.util.List;

// Mantém o estado (numero de ovos e se o dragão está acordado) e notifica os observadores a cada mudança.
// Classe para observar os estados da caverna, contendo a contagem de ovos e se o dragão acordou
public class Caverna implements Subject {
    private final List<Observer> observadores;
    private int ovoCount;
    private boolean dragaoAcordado;

    public Caverna() {
        this.observadores = new ArrayList<>();
        this.ovoCount = 0;
        this.dragaoAcordado = false;
    }

    @Override
    public void registrarObservador(Observer obs) {
        observadores.add(obs);
    }

    @Override
    public void removerObservador(Observer obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificar() {
        for (Observer obs : observadores) {
            obs.update(this);
        }
    }

    // -- Getters e Setters do estado --
    public int getOvoCount() {
        return ovoCount;
    }

    public boolean isDragaoAcordado() {
        return dragaoAcordado;
    }

    public void setDragaoAcordado(boolean dragaoAcordado) {
        this.dragaoAcordado = dragaoAcordado;
        notificar(); // Notifica que o dragão acordou
    }

    // Metodo para incrementar a contagem de ovos
    public void incrementarOvo() {
        ovoCount++;
        notificar(); // Notifica toda vez que um ovo é coletado
    }
}
