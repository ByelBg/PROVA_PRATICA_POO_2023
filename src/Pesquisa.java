import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.sql.PreparedStatement;
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
                            result += a+"\n";
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
        ArrayList<Rodovia> rodovias = new ArrayList<>();
        Rodovia rFim = new Rodovia("","");
        boolean aux;
        int aux2 = 0;
        for(Acidente a : acidentes){
            aux = false;
            for(Veiculo v : a.getVeiculos()){
                if(v.isBicicleta){
                    aux = true;
                }
            }if(aux){
                aux = false;
                for(Rodovia r : rodovias){
                    if(r == a.getRodovia()){
                        aux = true;
                        r.aumentarAcidente();
                    }
                }if(!aux){
                    a.getRodovia().aumentarAcidente();
                    rodovias.add(a.getRodovia());
                }
            }
        }for(Rodovia r : rodovias){
            if(r.getQtdAcidentes() > aux2){
                aux2 = r.getQtdAcidentes();
                rFim = r;
            }
        }System.out.println(rFim);
    }
    //Listar rodovia com mais acidentes com vítimas fatais
    public static void listarAcidenteVitimasFatais(ArrayList<Acidente> acidentes){
        ArrayList<Rodovia> rodovias = new ArrayList<>();
        Rodovia rFim = new Rodovia("","");
        boolean aux;
        int aux2 = 0;
        for(Acidente a : acidentes){
            aux = false;
            if(a.getVitimasFatais() >= 1){
                for(Rodovia r : rodovias){
                    if(r == a.getRodovia()){
                        aux = true;
                        r.aumentarAcidente();
                    }
                }if(!aux){
                    a.getRodovia().aumentarAcidente();
                    rodovias.add(a.getRodovia());
                }
            }
        }for(Rodovia r : rodovias){
            if(r.getQtdAcidentes() > aux2){
                rFim = r;
                aux2 = r.getQtdAcidentes();
            }
        }System.out.println(rFim);
    }
    //Listar rodovias com acidentes no carnaval
    public static void listarAcidentesCarnaval(ArrayList<Acidente> acidentes){
        String result =  "";
        boolean aux = false;
        ArrayList<Rodovia> rodovias = new ArrayList<>();
        for(Acidente a : acidentes){
            aux = false;
            if(a.getMes().equals("Fevereiro")){
                for(Rodovia r : rodovias){
                    if(a.getRodovia() == r){
                        aux = true;
                    }
                }if(!aux){
                    rodovias.add(a.getRodovia());
                }
            }
        }for(Rodovia r : rodovias){
            result += r+"\n";
        }
        System.out.println(result);
    }
    //Listar acidentes com veículos novos
    public static void listarAcidentesVeiculosNovos(ArrayList<Acidente> acidentes){
        boolean aux;
        String result = "";
        for(Acidente a: acidentes){
            aux = false;
            for(Veiculo v : a.getVeiculos()){
                if (v.getAnoFb() > 2013){
                    aux = true;
                }
            }if(aux){
                result += a+"\n";
            }
        }System.out.println(result);
    }
}
