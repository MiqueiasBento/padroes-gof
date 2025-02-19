package fabricas;

import veiculos.Veiculo;
import veiculos.volvo.BarcoVolvo;
import veiculos.volvo.CaminhaoVolvo;

public class FabricaVolvo implements FabricaVeiculos {

    public FabricaVolvo(){
    }

    @Override
    public Veiculo criarCaminhao() {
        return new CaminhaoVolvo();
    }

    @Override
    public Veiculo criarBarco() {
        return new BarcoVolvo();
    }
}
