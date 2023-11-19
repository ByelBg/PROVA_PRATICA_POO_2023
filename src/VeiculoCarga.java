public class VeiculoCarga extends Veiculo {
    private double qtdCarga;
    VeiculoCarga(int ano, double carga) {
        super(ano, false);
        this.qtdCarga = carga;
    }

    @Override
    public String toString() {
        return anoFb+" - "+getPEnvolvidas().size()+" - Veículo de carga - "+qtdCarga+" Kg";
    }
    //GETS E SETS

    public double getQtdCarga() {
        return qtdCarga;
    }

    public void setQtdCarga(double qtdCarga) {
        this.qtdCarga = qtdCarga;
    }
}
