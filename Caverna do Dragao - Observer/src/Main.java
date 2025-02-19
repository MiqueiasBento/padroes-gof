
public class Main {
    public static void main(String[] args) {
        Caverna caverna = new Caverna();
        Jogador jogador = new Jogador();
        MaeDragao maeDragao = new MaeDragao();

        // Registra ambos como observadores da caverna
        caverna.registrarObservador(jogador);
        caverna.registrarObservador(maeDragao);

        // Simula o jogador coletando 100 ovos
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            jogador.coletarOvo(caverna);
        }
    }
}
