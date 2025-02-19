
// Builder (Cliente)
// O cliente pode escolher os componentes e construir o computador.
public class LojaComputadores {
    public static void main(String[] args) {
        ComputadorBuilder builder = new ComputadorGamerBuilder();

        // Configuração passo-a-passo
        builder.setProcessador("Intel Core i9");
        builder.setRAM(32);
        builder.setArmazenamento(1000);
        builder.setPlacaDeVideoDedicada(true);

        // Construção do computador
        Computador computador = builder.build();

        System.out.println("Computador Gamer montado: \n" + computador);
    }
}