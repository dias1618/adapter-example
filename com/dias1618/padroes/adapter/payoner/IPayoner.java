package com.dias1618.padroes.adapter.payoner;

public interface IPayoner {
    public byte[] pagar(Double valor, String nrConta, String nrAgencia);
    public byte[] receber(Double valor, String nrConta, String nrAgencia); 
}
