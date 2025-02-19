package fabricas;

import veiculos.Veiculo;
import veiculos.toyota.BarcoToyota;
import veiculos.toyota.CaminhaoToyota;

public class FabricaToyota implements FabricaVeiculos {

    public FabricaToyota(){
    }

    @Override
    public Veiculo criarCaminhao() {
        return new CaminhaoToyota();
    }

    @Override
    public Veiculo criarBarco() {
        return new BarcoToyota();
    }
}
