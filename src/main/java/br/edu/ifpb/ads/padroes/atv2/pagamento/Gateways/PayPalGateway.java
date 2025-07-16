package br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways;

public class PayPalGateway implements PagamentoGateway {
    @Override
    public boolean processarPagamento(String idCompra, double valor) {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Id da compra: " + idCompra);
        System.out.println("Valor da compra: " + valor);
        System.out.println("Pagamento realizado pelo PayPal com sucesso!");
        System.out.println("----------------------PAYPAL---------------------");
        System.out.println();
        return true;
    }
}
