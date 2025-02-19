package fabricas;

import veiculos.Veiculo;

public interface FabricaVeiculos {
    public Veiculo criarCaminhao();
    public Veiculo criarBarco();
}
