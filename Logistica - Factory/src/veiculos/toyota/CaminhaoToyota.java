package veiculos.toyota;

import veiculos.Veiculo;

public class CaminhaoToyota implements Veiculo {

    public CaminhaoToyota() {
    }

    @Override
    public void entregar() {
        System.out.println("Caminhão toyota realizando entrega por terra");
    }
}
