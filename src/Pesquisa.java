import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

public class Pesquisa {
    //Listar todos os acidentes que algum condutor estava embriagado
    public static void listarEmbriagados(ArrayList<Acidente> acidentes){
        String result = "";
        for(Acidente a : acidentes){
            for(Veiculo v : a.getVeiculos()){
                for(Pessoa p : v.PEnvolvidas){
                    if(p instanceof Condutor){
                        if( ((Condutor)p).isEmbriagado()) {
                            result += a;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

    //Listar a quantidade de acidentes para cada nível de periculosidade da rodovia
    public static void listarGrauPerigo(ArrayList<Rodovia> rodovias){
        int baixo = 0;
        int medio = 0;
        int alto = 0;
        for(Rodovia r : rodovias){
            if(r.getGPerigo().equals("Baixo")){
                baixo+=r.getQtdAcidentes();
            }else if(r.getGPerigo().equals("Médio")){
                medio+=r.getQtdAcidentes();
            }else{
                alto+=r.getQtdAcidentes();
            }
        }
        System.out.println( "Periculosidade baixa: "+baixo+
                "\nPericulosidade média: "+medio+
                "\nPericulosidade alta: "+alto);
    }

    //Listar todos os veículos de carga que se envolveram em acidentes
    public  static void listarVeiculosCarga(ArrayList<Veiculo> veiculos){
        String result = "";
        for(Veiculo v : veiculos){
            if(v instanceof VeiculoCarga){
                result += v +"\n";
            }
        }
        System.out.println(result);
    }
    //Listar rodovia onde ocorreu mais acidentes com bicicletas
    public static void listarAcidenteBicicletas(ArrayList<Acidente> acidentes){
        String result =  "";
        System.out.println(result);
    }
    //Listar rodovia com mais acidentes com vítimas fatais
    public static void listarAcidenteVitimasFatais(ArrayList<Acidente> acidentes){
        String result =  "";
        System.out.println(result);
    }
    //Listar rodovias com acidentes no carnaval
    public static void listarAcidentesCarnaval(ArrayList<Acidente> acidentes){
        String result =  "";
        System.out.println(result);
    }
}
