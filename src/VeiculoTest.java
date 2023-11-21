import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    Pessoa p1;
    Veiculo v1;
    Veiculo b1;
    VeiculoCarga vC1;

    @BeforeEach
    void executaAntes(){
        p1 = new Pessoa("P1",18,'M');
        v1 = new Veiculo(2000,false);
        b1 = new Veiculo(2000, true);
        vC1 = new VeiculoCarga(2000, 4000);
    }

    @Test
    void adicionarPessoaEnvolvidaTest(){
        v1.adicionarPessoaEnvolvida(p1);
        assertEquals(1,v1.getPEnvolvidas().size());
    }

    @Test
    void toStringTest(){
        assertEquals(2000, v1.getAnoFb());
        assertFalse(v1.isBicicleta);
        assertEquals(4000,vC1.getQtdCarga());

        assertEquals("2000 - 0",v1.toString());
        assertEquals("2000 - 0 - Bicicleta",b1.toString());
        assertEquals("2000 - 0 - Veículo de carga - 4000.0 Kg",vC1.toString());
    }

    @Test
    void setsTest(){
        ArrayList<Pessoa> ps = new ArrayList<>();

        v1.setAnoFb(2023);
        assertEquals(2023, v1.getAnoFb());

        v1.setBicicleta(true);
        assertTrue(v1.isBicicleta);

        v1.setPEnvolvidas(ps);
        assertEquals(ps, v1.getPEnvolvidas());

        vC1.setQtdCarga(2000);
        assertEquals(2000,vC1.getQtdCarga());
    }

}