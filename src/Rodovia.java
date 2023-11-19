public class Rodovia {
    private String sigla;
    private String GPerigo;
    Rodovia(String sg, String perigo){
        this.sigla = sg;
        this.GPerigo = perigo;
    }
    private int qtdAcidentes = 0;

    void aumentarAcidente(){
        qtdAcidentes++;
    }
    @Override
    public String toString() {
        return sigla+" - "+GPerigo;
    }

    //GETS E SETS

    public int getQtdAcidentes() {
        return qtdAcidentes;
    }

    public void setQtdAcidentes(int qtdAcidentes) {
        this.qtdAcidentes = qtdAcidentes;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getGPerigo() {
        return GPerigo;
    }

    public void setGPerigo(String GPerigo) {
        this.GPerigo = GPerigo;
    }
}
