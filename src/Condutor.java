public class Condutor extends Pessoa{
    private boolean embriagado;
    Condutor(String nm, int idd, char sx, boolean embg) {
        super(nm, idd, sx);
        this.embriagado = embg;
    }

    @Override
    public String toString(){
        String result = nome+" - "+idade+" - "+sexo+" - Condutor";
        if(embriagado == true){
            return result+=" - Estava embriagado";
        }else{
            return result+=" - Não estava embriagado";
        }
    }

    //GETS E SETS
    public boolean isEmbriagado() {
        return embriagado;
    }

    public void setEmbriagado(boolean embriagado) {
        this.embriagado = embriagado;
    }
}
