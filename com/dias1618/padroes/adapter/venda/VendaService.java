package com.dias1618.padroes.adapter.venda;

import com.dias1618.padroes.adapter.carrinho.Carrinho;
import com.dias1618.padroes.adapter.conta.Conta;
import com.dias1618.padroes.adapter.item.Item;
import com.dias1618.padroes.adapter.pagamento.Pagamento;
import com.dias1618.padroes.adapter.paypal.Comprovante;
import com.dias1618.padroes.adapter.paypal.IPaypal;
import com.dias1618.padroes.adapter.paypal.Paypal;

public class VendaService {
    
    private IPaypal paypal;

    public VendaService(){
        this.paypal = new Paypal();
    }

    public Carrinho criarVenda(){
        return new Carrinho();
    }

    public Carrinho adicionarItem(Carrinho carrinho, Item item){
        return carrinho;
    }

    public void selecionarFormaPagamento(IPaypal paypal){
        this.paypal = paypal;
    }

    public Comprovante fazerPagamento(Carrinho carrinho){
        Pagamento pagamento = new Pagamento();
        Conta conta = new Conta();
        return paypal.receberPagamento(pagamento, conta);
    }


}
