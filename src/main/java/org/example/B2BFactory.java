package org.example;

public class B2BFactory implements ISegmentoClienteFactory {

    public IContrato criarContrato() {
        return new ContratoB2B();
    }

    public IFatura criarFatura() {
        return new FaturaB2B();
    }
}