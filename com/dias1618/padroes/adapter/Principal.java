package com.dias1618.padroes.adapter;

import com.dias1618.padroes.adapter.carrinho.Carrinho;
import com.dias1618.padroes.adapter.compra.CompraService;
import com.dias1618.padroes.adapter.item.Item;
import com.dias1618.padroes.adapter.payoner.PayonerAdapter;
import com.dias1618.padroes.adapter.paypal.Comprovante;
import com.dias1618.padroes.adapter.paypal.Paypal;
import com.dias1618.padroes.adapter.venda.VendaService;

public class Principal{

    public static void main(String args[]){
        vender();
        comprar();
    }

    private static void vender(){
        VendaService vendaService = new VendaService();
        vendaService.selecionarFormaPagamento(new Paypal());
        Carrinho carrinho = vendaService.criarVenda();
        vendaService.adicionarItem(carrinho, new Item());
        vendaService.adicionarItem(carrinho, new Item());
        vendaService.adicionarItem(carrinho, new Item());
        Comprovante comprovante = vendaService.fazerPagamento(carrinho);
        System.out.println(comprovante.getBoleto());
    }

    private static void comprar(){
        CompraService compraService = new CompraService();
        compraService.selecionarFormaPagamento(new PayonerAdapter());
        Comprovante comprovante = compraService.fazerCompra();
        System.out.println(comprovante.getBoleto());
    }

}