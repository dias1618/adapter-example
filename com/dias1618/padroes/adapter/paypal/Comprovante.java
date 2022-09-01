package com.dias1618.padroes.adapter.paypal;

import java.time.LocalTime;

public class Comprovante {

    private LocalTime dataComprovante;
    private byte[] boleto;
    private String observacao;
    
    public void setBoleto(byte[] boleto) {
        this.boleto = boleto;
    }
    
    public byte[] getBoleto() {
        return boleto;
    }

    public void setDataComprovante(LocalTime dataComprovante) {
        this.dataComprovante = dataComprovante;
    }

    public LocalTime getDataComprovante() {
        return dataComprovante;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }
    
}
