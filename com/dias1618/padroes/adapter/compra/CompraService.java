package com.dias1618.padroes.adapter.compra;

import com.dias1618.padroes.adapter.conta.Conta;
import com.dias1618.padroes.adapter.pagamento.Pagamento;
import com.dias1618.padroes.adapter.paypal.Comprovante;
import com.dias1618.padroes.adapter.paypal.IPaypal;
import com.dias1618.padroes.adapter.paypal.Paypal;

public class CompraService {
       
    private IPaypal paypal;

    public CompraService(){
        this.paypal = new Paypal();
    }

    public void selecionarFormaPagamento(IPaypal paypal){
        this.paypal = paypal;
    }

    public Comprovante fazerCompra(){
        Pagamento pagamento = new Pagamento();
        Conta conta = new Conta();
        return paypal.fazerPagamento(pagamento, conta);
    }


}
