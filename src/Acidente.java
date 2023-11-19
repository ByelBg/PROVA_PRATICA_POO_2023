import java.util.ArrayList;

public class Acidente {
    private Rodovia rodovia;
    private int feridos;
    private int vitimasFatais;
    private String mes;
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    Acidente(Rodovia rod, int feri, int vitFat, String mesOcorrido){
        this.rodovia = rod;
        this.feridos = feri;
        this.vitimasFatais = vitFat;
        this.mes = mesOcorrido;
        rodovia.aumentarAcidente();
    }

    @Override
    public String toString(){
        return rodovia.getSigla()+" - Veículos Envolvidos: "+veiculos.size()+" - Feridos: "+feridos+" - Vítimas Fatais: "+vitimasFatais+" - "+mes;
    }

    void adicionarVeiculoEnvolvido(Veiculo v){
        veiculos.add(v);
    }

    //GETS E SETS
    public Rodovia getRodovia() {
        return rodovia;
    }

    public void setRodovia(Rodovia rodovia) {
        this.rodovia = rodovia;
    }

    public int getFeridos() {
        return feridos;
    }

    public void setFeridos(int feridos) {
        this.feridos = feridos;
    }

    public int getVitimasFatais() {
        return vitimasFatais;
    }

    public void setVitimasFatais(int vitimasFatais) {
        this.vitimasFatais = vitimasFatais;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
