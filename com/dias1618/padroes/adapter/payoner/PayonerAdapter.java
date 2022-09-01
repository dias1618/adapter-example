package com.dias1618.padroes.adapter.payoner;

import com.dias1618.padroes.adapter.conta.Conta;
import com.dias1618.padroes.adapter.pagamento.Pagamento;
import com.dias1618.padroes.adapter.paypal.Comprovante;
import com.dias1618.padroes.adapter.paypal.IPaypal;

public class PayonerAdapter implements IPaypal {

    private IPayoner payoner;

    public PayonerAdapter(){
        this.payoner = new Payoner();
    }

    @Override
    public Comprovante fazerPagamento(Pagamento pagamento, Conta conta) {
        byte[] comprovanteByte = this.payoner.pagar(pagamento.getValorTotal(), conta.getNrConta(), conta.getNrAgencia());
        Comprovante comprovante = new Comprovante();
        comprovante.setBoleto(comprovanteByte);
        return comprovante;
    }

    @Override
    public Comprovante receberPagamento(Pagamento pagamento, Conta conta) {
        byte[] comprovanteByte = this.payoner.receber(pagamento.getValorTotal(), conta.getNrConta(), conta.getNrAgencia());
        Comprovante comprovante = new Comprovante();
        comprovante.setBoleto(comprovanteByte);
        return comprovante;
    }
    
}
