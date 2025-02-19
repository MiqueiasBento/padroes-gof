import componente.Sanduiche;
import decoradores.DecoradorQueijo;
import decoradores.DecoradorTomate;
import decoradores.SanduicheBasico;

public class SanduicheTest {
    public static void main(String[] args) {
        // 1) Cria um sanduíche básico
        Sanduiche sanduiche = new SanduicheBasico();

        // 2) Decora com queijo
        sanduiche = new DecoradorQueijo(sanduiche);

        // 3) Decora com tomate
        sanduiche = new DecoradorTomate(sanduiche);

        // 4) Exibe o resultado
        System.out.println(sanduiche.getDescricao()
                + " -> Custo: R$" + sanduiche.getPreco());
    }
}
