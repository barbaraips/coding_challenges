import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaCorrenteTest {

    ContaCorrente cc;

    @BeforeEach
    void inicializaConta() {
        cc = new ContaCorrente();
        cc.depositar(200);
    }

    @Test
    void sacar() {
        int valorSacado = cc.sacar(50);
        assertEquals(150, cc.saldo);
        assertEquals(50, valorSacado);
    }

    @Test
    void sacarInvalido() {
        int valorSacado = cc.sacar(250);
        assertEquals(200, cc.saldo);
        assertEquals(0, valorSacado);
    }

    @Test
    void depositar() {
        assertEquals(200, cc.saldo);
    }
}