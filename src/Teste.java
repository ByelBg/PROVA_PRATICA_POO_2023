import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Acidente> acidentes = new ArrayList<>();
        ArrayList<Rodovia> rodovias = new ArrayList<>();
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Rodovia r1 = new Rodovia("R1", "Baixo");
        Rodovia r2 = new Rodovia("R2", "Médio");
        Rodovia r3 = new Rodovia("R3", "Alto");

        rodovias.add(r1);
        rodovias.add(r2);
        rodovias.add(r3);

        Acidente a1 = new Acidente(r1, 0, 0, "Janeiro");
        Acidente a2 = new Acidente(r3, 0, 0, "Fevereiro");

        acidentes.add(a1);
        acidentes.add(a2);

        Veiculo v1 = new Veiculo(2000, false);
        VeiculoCarga v2 = new VeiculoCarga(2000, 2000);

        Veiculo b1 = new Veiculo(2000, true);
        Veiculo b2 = new Veiculo(2000, true);
        Veiculo b3 = new Veiculo(2000, true);
        Veiculo b4 = new Veiculo(2000, true);

        veiculos.add(v1);
        veiculos.add(v2);
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        a1.adicionarVeiculoEnvolvido(v1);
        a1.adicionarVeiculoEnvolvido(b1);
        a1.adicionarVeiculoEnvolvido(b2);
        a1.adicionarVeiculoEnvolvido(b3);
        a2.adicionarVeiculoEnvolvido(v2);
        a2.adicionarVeiculoEnvolvido(b4);

        Pessoa p1 = new Pessoa("P1", 18, 'F');
        Pessoa p2 = new Pessoa("P2", 20, 'M');
        Condutor c1 = new Condutor("C1", 20, 'M', true);
        Condutor c2 = new Condutor("C2", 25, 'F', false);

        v1.adicionarPessoaEnvolvida(p1);
        v1.adicionarPessoaEnvolvida(c1);
        v2.adicionarPessoaEnvolvida(p2);
        v2.adicionarPessoaEnvolvida(c2);

        Pesquisa.listarGrauPerigo(rodovias);
        System.out.println("\n------------------\n");
        Pesquisa.listarVeiculosCarga(veiculos);
        System.out.println("\n------------------\n");
        Pesquisa.listarEmbriagados(acidentes);
    }
}