package br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways;

public class StripeGateway implements PagamentoGateway {

    @Override
    public boolean processarPagamento(String idCompra, double valor) {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Id da compra: " + idCompra);
        System.out.println("Valor da compra: " + valor);
        System.out.println("Pagamento realizado pelo Stripe com sucesso!");
        System.out.println("----------------------STRIPE---------------------");
        System.out.println();
        return true;
    }

}
