package br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways;

public class PagSeguroGateway implements PagamentoGateway {
    @Override
    public boolean processarPagamento(String idCompra, double valor) {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Id da compra: " + idCompra);
        System.out.println("Valor da compra: " + valor);
        System.out.println("Pagamento realizado pela PagSeguro com sucesso!");
        System.out.println("---------------------PAGSEGURO-------------------");
        System.out.println();
        return true;
    }
}
