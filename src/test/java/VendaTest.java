import org.example.B2BFactory;
import org.example.B2CFactory;
import org.example.ISegmentoClienteFactory;
import org.example.Venda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveEmitirContratoB2C() {
        ISegmentoClienteFactory fabrica = new B2CFactory();
        Venda venda = new Venda(fabrica);
        assertEquals("Contrato B2C gerado", venda.emitirContrato());
    }

    @Test
    void deveEmitirContratoB2B() {
        ISegmentoClienteFactory fabrica = new B2BFactory();
        Venda venda = new Venda(fabrica);
        assertEquals("Contrato B2B gerado (com cláusula de SLA)", venda.emitirContrato());
    }

    @Test
    void deveEmitirFaturaB2C() {
        ISegmentoClienteFactory fabrica = new B2CFactory();
        Venda venda = new Venda(fabrica);
        assertEquals("Fatura B2C gerada", venda.emitirFatura());
    }

    @Test
    void deveEmitirFaturaB2B() {
        ISegmentoClienteFactory fabrica = new B2BFactory();
        Venda venda = new Venda(fabrica);
        assertEquals("Fatura B2B gerada (com CNPJ e centro de custo)", venda.emitirFatura());
    }
}