package org.example;

public class Venda {

    private ISegmentoClienteFactory fabrica;

    public Venda(ISegmentoClienteFactory fabrica) {
        this.fabrica = fabrica;
    }

    public String emitirContrato() {
        return fabrica.criarContrato().gerar();
    }

    public String emitirFatura() {
        return fabrica.criarFatura().gerar();
    }
}