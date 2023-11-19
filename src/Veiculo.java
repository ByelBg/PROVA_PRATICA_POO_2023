import java.lang.reflect.Array;
import java.util.ArrayList;

public class Veiculo {
    protected int anoFb;
    protected ArrayList<Pessoa> PEnvolvidas = new ArrayList<>();
    protected boolean isBicicleta;
    Veiculo(int ano, boolean isBc){
        this.anoFb = ano;
        this.isBicicleta = isBc;
    }
    void adicionarPessoaEnvolvida(Pessoa p){
        PEnvolvidas.add(p);
    }
    @Override
    public String toString(){
        String result = anoFb+" - "+PEnvolvidas.size();
        if (isBicicleta == true){
            return result+=" - Bicicleta";
        }else{
            return result;
        }
    }

    //GETS E SETS

    public int getAnoFb() {
        return anoFb;
    }

    public void setAnoFb(int anoFb) {
        this.anoFb = anoFb;
    }

    public ArrayList<Pessoa> getPEnvolvidas() {
        return PEnvolvidas;
    }

    public void setPEnvolvidas(ArrayList<Pessoa> PEnvolvidas) {
        this.PEnvolvidas = PEnvolvidas;
    }

    public boolean isBicicleta() {
        return isBicicleta;
    }

    public void setBicicleta(boolean bicicleta) {
        isBicicleta = bicicleta;
    }
}
