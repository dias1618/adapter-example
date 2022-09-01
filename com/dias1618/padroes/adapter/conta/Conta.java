package com.dias1618.padroes.adapter.conta;

import com.dias1618.padroes.adapter.BancoEnum;

public class Conta {
    private String nrConta;
    private String nrAgencia;
    private BancoEnum banco;

    public void setBanco(BancoEnum banco) {
        this.banco = banco;
    }
    
    public BancoEnum getBanco() {
        return banco;
    }

    public void setNrAgencia(String nrAgencia) {
        this.nrAgencia = nrAgencia;
    }

    public String getNrAgencia() {
        return nrAgencia;
    }

    public void setNrConta(String nrConta) {
        this.nrConta = nrConta;
    }

    public String getNrConta() {
        return nrConta;
    }
}
