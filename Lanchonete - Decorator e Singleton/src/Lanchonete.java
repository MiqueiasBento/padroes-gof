import pedidos.ListaPedidos;
import sanduiche.Sanduiche;
import sanduiche.SanduicheSimples;
import sanduiche.decoradores.*;

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        ListaPedidos listaPedidos = ListaPedidos.getInstancia();
        Scanner scanner = new Scanner(System.in);
        Sanduiche sanduiche = new SanduicheSimples();
        boolean sair = false;

        while (!sair) {

                System.out.println("Digite o ingrediente desejado ou 'sair' para encerrar: ");
                System.out.println("1. Carne");
                System.out.println("2. Presunto");
                System.out.println("3. Queijo");
                System.out.println("4. Tomate");
                System.out.println("5. Alface");
                String ingrediente = scanner.nextLine();

                switch (ingrediente) {
                    case "Carne", "1":
                        sanduiche = new SanduicheDecorador(new CarneDecorador(sanduiche));
                        break;
                    case "Presunto", "2":
                        sanduiche = new SanduicheDecorador(new PresuntoDecorador(sanduiche));
                        break;
                    case "Queijo", "3":
                        sanduiche = new SanduicheDecorador(new QueijoDecorador(sanduiche));
                        break;
                    case "Tomate", "4":
                        sanduiche = new SanduicheDecorador(new TomateDecorador(sanduiche));
                        break;
                    case "Alface", "5":
                        sanduiche = new SanduicheDecorador(new AlfaceDecorador(sanduiche));
                        break;
                    default:
                        sair = true;
                        break;
                }
        }

        listaPedidos.adicionarSanduiche(sanduiche);
        listaPedidos.listarPedidos();
    }
}