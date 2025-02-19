package veiculos.toyota;

import veiculos.Veiculo;

public class BarcoToyota implements Veiculo {

    public BarcoToyota() {
    }

    @Override
    public void entregar() {
        System.out.println("Barco toyota realizando entrega pelo mar");
    }
}
