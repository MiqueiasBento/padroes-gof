
// Classe inscrita para receber notificação da Caverna
public class MaeDragao implements Observer {

    @Override
    public void update(Caverna caverna) {
        // Se o jogador tiver 100 ovos e o dragão ainda estiver dormindo, acorde-o
        if (caverna.getOvoCount() >= 100 && !caverna.isDragaoAcordado()) {
            System.out.println("Mãe-Dragão: RAWR! Acordei!");
            caverna.setDragaoAcordado(true);
        }
    }
}
