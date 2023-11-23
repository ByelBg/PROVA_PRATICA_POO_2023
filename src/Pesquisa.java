import java.util.ArrayList;

public class Pesquisa {
    //Listar todos os acidentes que algum condutor estava embriagado
    public static String listarEmbriagados(ArrayList<Acidente> acidentes){
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
        return result;
    }

    //Listar a quantidade de acidentes para cada nível de periculosidade da rodovia
    public static String listarGrauPerigo(ArrayList<Acidente> acidentes){
        int baixo = 0;
        int medio = 0;
        int alto = 0;
        for(Acidente a : acidentes){
            switch (a.getRodovia().getGPerigo()) {
                case "Baixo" -> baixo++;
                case "Médio" -> medio++;
                case "Alto" -> alto++;
            }
        }
        return  "Periculosidade baixa: "+baixo+
                "\nPericulosidade média: "+medio+
                "\nPericulosidade alta: "+alto;
    }

    //Listar todos os veículos de carga que se envolveram em acidentes
    public  static String listarVeiculosCarga(ArrayList<Veiculo> veiculos){
        String result = "";
        for(Veiculo v : veiculos){
            if(v instanceof VeiculoCarga){
                result += v +"\n";
            }
        }
        return result;
    }
    //Listar rodovia onde ocorreu mais acidentes com bicicletas
    public static String listarAcidenteBicicletas(ArrayList<Acidente> acidentes){
        ArrayList<Rodovia> rodovias = new ArrayList<>();
        Rodovia rFim = new Rodovia("","");
        boolean aux;
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
            if(r.getQtdAcidentes() > rFim.getQtdAcidentes()){
                rFim = r;
            }
        }return rFim.toString();
    }
    //Listar rodovia com mais acidentes com vítimas fatais
    public static String listarAcidenteVitimasFatais(ArrayList<Acidente> acidentes){
        ArrayList<Rodovia> rodovias = new ArrayList<>();
        Rodovia rFim = new Rodovia("","");
        boolean aux;
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
            if(r.getQtdAcidentes() > rFim.getQtdAcidentes()){
                rFim = r;
            }
        }return rFim.toString();
    }
    //Listar rodovias com acidentes no carnaval
    public static String listarAcidentesCarnaval(ArrayList<Acidente> acidentes){
        String result =  "";
        boolean aux;
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
        return result;
    }
    //Listar acidentes com veículos novos
    public static String listarAcidentesVeiculosNovos(ArrayList<Acidente> acidentes){
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
        }return result;
    }
}
