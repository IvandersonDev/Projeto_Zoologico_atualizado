package Model;

public class Animal {
    String cor;
    int quantidadeDeDentes;
    int patas;
    String genero;
    boolean castracao;

    public Animal(String cor,
                  int quantidadeDeDentes,
                  int patas,
                  String genero,
                  boolean castracao
    ) {
        this.cor = cor;
        this.quantidadeDeDentes = quantidadeDeDentes;
        this.patas = patas;
        this.genero = genero;
        this.castracao = castracao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadeDeDentes() {
        return quantidadeDeDentes;
    }

    public void setQuantidadeDeDentes(int quantidadeDeDentes) {
        this.quantidadeDeDentes = quantidadeDeDentes;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isCastracao() {
        return castracao;
    }

    public void setCastracao(boolean castracao) {
        this.castracao = castracao;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "cor='" + cor + '\'' +
                ", quantidadeDeDentes=" + quantidadeDeDentes +
                ", patas=" + patas +
                ", genero='" + genero + '\'' +
                ", castracao=" + castracao +
                '}';
    }
}