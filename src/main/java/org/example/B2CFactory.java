package org.example;

public class B2CFactory implements ISegmentoClienteFactory {

    public IContrato criarContrato() {
        return new ContratoB2C();
    }

    public IFatura criarFatura() {
        return new FaturaB2C();
    }
}