package br.edu.ifpb.ads.padroes.atv2.pagamento;

import br.edu.ifpb.ads.padroes.atv2.pagamento.Pagamento.PagamentoConfigure;
import br.edu.ifpb.ads.padroes.atv2.pagamento.Pagamento.PagamentoService;



public class Main {
    public static void main(String[] args) {
        //Teste com PayPal

        Injector injectorPayPal = Guice.createInjector(new PagamentoConfigure("PayPal"));
        PagamentoService servicePayPal = injectorPayPal.getInstance(PagamentoService.class);
        servicePayPal.pagar("12345",100);

        //Teste com Stripe

        Injector injectorStripe = Guice.createInjector(new PagamentoConfigure("Stripe"));
        PagamentoService serviceStripe = injectorStripe.getInstance(PagamentoService.class);
        serviceStripe.pagar("1510",250);

    }
}