package br.edu.ifpb.ads.padroes.atv2.pagamento.Pagamento;

import br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways.PayPalGateway;
import br.edu.ifpb.ads.padroes.atv2.pagamento.Gateways.StripeGateway;
import com.google.inject.AbstractModule;

public class PagamentoConfigure extends AbstractModule {

    private final String tipoPagamento;

    public PagamentoConfigure(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    protected void configure() {
        switch (tipoPagamento) {
            case "PayPal" -> bind(PagamentoGateway.class).to(PayPalGateway.class);
            case "Stripe" -> bind(PagamentoGateway.class).to(StripeGateway.class);
            case "PagSeguro" -> bind(PagamentoGateway.class).to(PagSeguroGateway.class);
            default -> System.out.println("Tipo de pagamento informado não existente");
        }
    }
}