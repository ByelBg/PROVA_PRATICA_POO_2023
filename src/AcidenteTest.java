import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AcidenteTest {

    Rodovia r1;
    Veiculo v1;
    Veiculo v2;
    Acidente a1;

    @BeforeEach
    void executaAntes(){
        System.out.println("*");
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

    @Test
    void toStringTest(){
        assertEquals(0, a1.getFeridos());
        assertEquals(0, a1.getVitimasFatais());
        assertEquals("Janeiro", a1.getMes());
        assertEquals("R1 - Veículos Envolvidos: 0 - Feridos: 0 - Vítimas Fatais: 0 - Janeiro", a1.toString());
    }

    @Test
    void setsTest() {
        Rodovia r2 = new Rodovia("RS-231", "Baixo");
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        a1.setFeridos(10);
        assertEquals(10, a1.getFeridos());

        a1.setMes("Janeiro");
        assertEquals("Janeiro", a1.getMes());

        a1.setVitimasFatais(2);
        assertEquals(2, a1.getVitimasFatais());

        a1.setRodovia(r2);
        assertEquals(r2, a1.getRodovia());

        a1.setVeiculos(veiculos);
        assertEquals(veiculos, a1.getVeiculos());
    }

}