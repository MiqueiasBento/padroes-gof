package veiculos.volvo;

import veiculos.Veiculo;

public class CaminhaoVolvo implements Veiculo  {

    public CaminhaoVolvo() {
    }

    @Override
    public void entregar() {
        System.out.println("Caminhão volvo realizando entrega por terra");
    }
}
