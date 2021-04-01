import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaEspecialTest extends ContaCorrenteTest {


    @BeforeEach
    void inicializaContaEspecial() {
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }

    @Test
    void sacarInvalido() {
        int valorSacado = cc.sacar(350);
        assertEquals(200, cc.saldo);
        assertEquals(0, valorSacado);
    }

    @Test
    void sacarInvalidoLimite() {
        int valorSacado = cc.sacar(250);
        assertEquals(-50, cc.saldo);
        assertEquals(250, valorSacado);
    }


}