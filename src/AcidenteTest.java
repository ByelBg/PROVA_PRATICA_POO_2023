import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;

import static org.junit.jupiter.api.Assertions.*;

class AcidenteTest {

    Rodovia r1;
    Veiculo v1;
    Veiculo v2;
    Acidente a1;

    @BeforeEach
    void executaAntes(){
        System.out.println("*****");
        v1 = new Veiculo(2020,false);
        v2 = new Veiculo(2019,true);
        r1 = new Rodovia("R1","Baixo");
        a1 = new Acidente(r1,0,0,"Janeiro");
    }

    @Test
    void adicionarVeiculoTest(){
        a1.adicionarVeiculoEnvolvido(v1);
        a1.adicionarVeiculoEnvolvido(v2);
        assertEquals(2, a1.getVeiculos().size());
    }

}