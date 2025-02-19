
// Interface Builder do padrão Builder
public interface ComputadorBuilder {
    void setProcessador(String processador);
    void setRAM(int ram);
    void setArmazenamento(int armazenamento);
    void setPlacaDeVideoDedicada(boolean placaDeVideoDedicada);
    Computador build();
}