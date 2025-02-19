package veiculos.volvo;

import veiculos.Veiculo;

public class BarcoVolvo implements Veiculo {

    public BarcoVolvo() {
    }

    @Override
    public void entregar() {
        System.out.println("Barco volvo realizando entrega pelo mar");
    }
}
