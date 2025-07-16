package br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways;

public interface PagamentoGateway {
    boolean processarPagamento(String idCompra,double valor);
}
