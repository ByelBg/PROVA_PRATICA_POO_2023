import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa p1;
    Condutor c1;
    Condutor c2;

    @BeforeEach
    void executaAntes(){
        p1 = new Pessoa("P1",18,'M');
        c1 = new Condutor("C1",18,'F',false);
        c2 = new Condutor("C2",18,'M',true);
    }

    @Test
    void toStringTest(){
        assertEquals("P1",p1.getNome());
        assertEquals(18,p1.getIdade());
        assertEquals('M',p1.getSexo());

        assertEquals("P1 - 18 - M",p1.toString());
        assertEquals("C1 - 18 - F - Condutor - Não estava embriagado",c1.toString());
        assertEquals("C2 - 18 - M - Condutor - Estava embriagado",c2.toString());
    }

    @Test
    void setsTest(){
        p1.setNome("P2");
        assertEquals("P2", p1.getNome());

        p1.setIdade(20);
        assertEquals(20, p1.getIdade());

        p1.setSexo('F');
        assertEquals('F',p1.getSexo());

        c1.setEmbriagado(true);
        assertTrue(c1.isEmbriagado());
    }

}