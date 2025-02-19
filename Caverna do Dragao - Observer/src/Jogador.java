
// Classe inscrita para receber notificação da Caverna
public class Jogador implements Observer {

    @Override
    public void update(Caverna caverna) {
        // Se o dragão estiver acordado, jogador é notificado
        if (caverna.isDragaoAcordado()) {
            System.out.println("Jogador: Oh não, a mãe-dragão acordou!");
        }
    }

    // Jogador diz à caverna que pegou um ovo
    public void coletarOvo(Caverna caverna) {
        System.out.println("Jogador: Coletando ovo...");
        caverna.incrementarOvo();
    }
}
