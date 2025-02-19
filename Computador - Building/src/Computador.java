
// Product do padrão Builder
public class Computador {
    private String processador;
    private int ram;
    private int armazenamento;
    private boolean placaDeVideoDedicada;

    // Construtor privado para forçar o uso do Builder
    Computador() {}

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isPlacaDeVideoDedicada() {
        return placaDeVideoDedicada;
    }

    public void setPlacaDeVideoDedicada(boolean placaDeVideoDedicada) {
        this.placaDeVideoDedicada = placaDeVideoDedicada;
    }

    @Override
    public String toString() {
        return "Computador{" + '\n' +
                " processador='" + processador + '\n' +
                " ram=" + ram + '\n' +
                " armazenamento=" + armazenamento + '\n' +
                " placaDeVideoDedicada=" + placaDeVideoDedicada + '\n' +
                '}';
    }
}
