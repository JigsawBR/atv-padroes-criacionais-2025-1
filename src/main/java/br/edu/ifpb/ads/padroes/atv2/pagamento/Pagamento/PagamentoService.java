package br.edu.ifpb.ads.padroes.atv2.pagamento.Pagamento;
import br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways.PagamentoGateway;
import com.google.inject.Inject;


public class PagamentoService {

    private final PagamentoGateway gateway;

    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public boolean pagar(String idCompra, double valor) {
        return gateway.processarPagamento(idCompra, valor);
    }

}