import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PesquisaTest {
    Acidente a1;
    Acidente a2;
    Acidente a3;
    Acidente a4;
    Veiculo v1;
    Veiculo v2;
    Veiculo b1;
    Veiculo b2;
    VeiculoCarga vC1;
    Rodovia r1;
    Rodovia r2;
    Rodovia r3;
    Pessoa p1;
    Pessoa p2;
    Pessoa p3;
    Pessoa p4;
    Condutor c1;
    Condutor c2;
    Condutor c3;
    Condutor c4;

    @BeforeEach
    void executaAntes(){
        r1 = new Rodovia("R1","Baixo");
        r2 = new Rodovia("R2", "Médio");
        r3 = new Rodovia("R3", "Alto");

        v1 = new Veiculo(2023, false);
        v2 = new Veiculo(2023, false);
        b1 = new Veiculo(2000, true);
        b2 = new Veiculo(2000, true);
        vC1 = new VeiculoCarga(2010, 2000);

        p1 = new Pessoa("P1", 18, 'F');
        p2 = new Pessoa("P2", 18, 'M');
        p3 = new Pessoa("P1", 18, 'F');
        p4 = new Pessoa("P2", 18, 'M');

        c1 = new Condutor("C1", 18, 'F', true);
        c2 = new Condutor("C2", 18, 'M', false);
        c3 = new Condutor("C1", 18, 'F', true);
        c4 = new Condutor("C2", 18, 'M', false);

        a1 = new Acidente(r1, 1, 1, "Janeiro");
        a2 = new Acidente(r2, 1, 1, "Fevereiro");
        a3 = new Acidente(r2, 1, 1, "Janeiro");
        a4 = new Acidente(r3, 0, 0, "Fevereiro");
    }

    @Test
    void listarEmbriagadosTest(){
        ArrayList<Acidente> acidentes = new ArrayList<>();

        v1.adicionarPessoaEnvolvida(c1);
        v2.adicionarPessoaEnvolvida(c2);
        b1.adicionarPessoaEnvolvida(c3);
        b2.adicionarPessoaEnvolvida(c4);

        a1.adicionarVeiculoEnvolvido(v1);
        a2.adicionarVeiculoEnvolvido(v2);
        a3.adicionarVeiculoEnvolvido(b1);
        a4.adicionarVeiculoEnvolvido(b2);

        acidentes.add(a1);
        acidentes.add(a2);
        acidentes.add(a3);
        acidentes.add(a4);

        assertEquals("R1 - Veículos Envolvidos: 1 - Feridos: 1 - Vítimas Fatais: 1 - Janeiro\n" +
                "R2 - Veículos Envolvidos: 1 - Feridos: 1 - Vítimas Fatais: 1 - Janeiro",Pesquisa.listarEmbriagados(acidentes));
    }

}