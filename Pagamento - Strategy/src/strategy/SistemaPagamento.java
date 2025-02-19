package strategy;

public class SistemaPagamento {
    private MetodoPagamento metodoPagamento;

    public SistemaPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public SistemaPagamento() {
    }

    public void processarPagamento(double valor) {
        if(this.getMetodoPagamento() != null) {
            metodoPagamento.pagar(valor);
        } else {
            System.out.println("Nenhum método de pagamento selecionado.");
        }
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
