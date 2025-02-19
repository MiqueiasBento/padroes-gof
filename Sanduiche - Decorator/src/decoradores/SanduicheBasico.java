package decoradores;

import componente.Sanduiche;

// Representa o sanduíche básico (só pão, por exemplo). Ele implementa a interface Sandwich.
public class SanduicheBasico implements Sanduiche {
    @Override
    public String getDescricao() {
        return "Pão";
    }

    @Override
    public double getPreco() {
        return 2.0;
    }

}
