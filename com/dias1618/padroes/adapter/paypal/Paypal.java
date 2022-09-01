package com.dias1618.padroes.adapter.paypal;

import com.dias1618.padroes.adapter.conta.Conta;
import com.dias1618.padroes.adapter.pagamento.Pagamento;

public class Paypal implements IPaypal {

    @Override
    public Comprovante fazerPagamento(Pagamento pagamento, Conta conta) {
        return new Comprovante();
    }

    @Override
    public Comprovante receberPagamento(Pagamento pagamento, Conta conta) {
        return new Comprovante();
    }
    
}
