import fabricas.FabricaToyota;
import fabricas.FabricaVeiculos;
import fabricas.FabricaVolvo;
import veiculos.Veiculo;

import java.util.Scanner;

public class Logistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fabricante: ");
        String fabricante = scanner.nextLine();

        System.out.print("Tipo de veículo: ");
        String tipoVeiculo = scanner.nextLine();

        Veiculo veiculo = fabricar(fabricante, tipoVeiculo);

        if (veiculo != null) {
            veiculo.entregar();
        } else {
            System.out.println("Fabricante ou tipo de veículo inválido!");
        }
    }

    private static Veiculo fabricar(String fabricaEscolhida, String veiculoEscolhido) {
        Veiculo veiculo = null;

        fabricaEscolhida = fabricaEscolhida.toLowerCase();
        veiculoEscolhido = veiculoEscolhido.toLowerCase();

        if (fabricaEscolhida.equals("volvo")) {
            FabricaVeiculos fabricaVolvo = new FabricaVolvo();

            if (veiculoEscolhido.equals("caminhao")) {
                veiculo = fabricaVolvo.criarCaminhao();
            } else if(veiculoEscolhido.equals("barco")) {
                veiculo = fabricaVolvo.criarBarco();
            }
        } else if (fabricaEscolhida.equals("toyota")) {
            FabricaVeiculos fabricaToyota = new FabricaToyota();

            if (veiculoEscolhido.equals("caminhao")) {
                veiculo = fabricaToyota.criarCaminhao();
            } else if(veiculoEscolhido.equals("barco")) {
                veiculo = fabricaToyota.criarBarco();
            }
        }

        return veiculo;
    }
}
