package factory;

import hamburguer.Hamburguer;
import hamburguer.HamburguerClassico;
import hamburguer.HamburguerDuplo;

public class HamburgueriaNobreFactory implements Factory {

    @Override
    public Hamburguer criarHamburguer(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "clasic" -> new HamburguerClassico();
            case "duplo" -> new HamburguerDuplo();
            case "vegano" -> new HamburguerVegano();
            default -> null;
        };
    }
}
