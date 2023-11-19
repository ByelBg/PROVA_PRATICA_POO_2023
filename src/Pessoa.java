public class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    Pessoa(String nm, int idd, char sx){
        this.nome = nm;
        this.idade = idd;
        this.sexo = sx;
    }
    @Override
    public String toString(){
        return nome+" - "+idade+" - "+sexo;
    }

    //GETS E SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
