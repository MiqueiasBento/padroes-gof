
// ConcreteBuilder do padrão Builder
public class ComputadorGamerBuilder implements ComputadorBuilder {
    private Computador computador = new Computador();

    @Override
    public void setProcessador(String processador) {
        computador.setProcessador(processador);
    }

    @Override
    public void setRAM(int ram) {
        computador.setRam(ram);
    }

    @Override
    public void setArmazenamento(int armazenamento) {
        computador.setArmazenamento(armazenamento);
    }

    @Override
    public void setPlacaDeVideoDedicada(boolean placaDeVideoDedicada) {
        computador.setPlacaDeVideoDedicada(placaDeVideoDedicada);
    }

    @Override
    public Computador build() {
        return computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}
