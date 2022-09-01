package com.dias1618.padroes.adapter.pagamento;

import com.dias1618.padroes.adapter.CartaoEnum;

public class Pagamento {
    private Double valorTotal;
    private Integer quantidadeParcelas;
    private CartaoEnum cartao;

    public void setCartao(CartaoEnum cartao) {
        this.cartao = cartao;
    }

    public CartaoEnum getCartao() {
        return cartao;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
    
}
