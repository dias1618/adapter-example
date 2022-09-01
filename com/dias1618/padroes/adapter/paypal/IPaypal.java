package com.dias1618.padroes.adapter.paypal;

import com.dias1618.padroes.adapter.conta.Conta;
import com.dias1618.padroes.adapter.pagamento.Pagamento;

public interface IPaypal {
    public Comprovante fazerPagamento(Pagamento pagamento, Conta conta);
    public Comprovante receberPagamento(Pagamento pagamento, Conta conta);
}
