import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodoviaTest {

    Rodovia r1;

    @BeforeEach
    void executaAntes(){
        r1 = new Rodovia("R1","Alto");
    }

    @Test
    void setsTest(){
        r1.setSigla("RS-723");
        assertEquals("RS-723", r1.getSigla());

        r1.setQtdAcidentes(15);
        assertEquals(15,r1.getQtdAcidentes());

        r1.setGPerigo("Baixo");
        assertEquals("Baixo", r1.getGPerigo());

    }

    @Test
    void toStringTest(){
        assertEquals("R1 - Alto", r1.toString());
    }

}