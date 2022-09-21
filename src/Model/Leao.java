package Model;

import Interfaces.ILeao;

public class Leao extends Animal implements ILeao {

    boolean rugir;
    boolean temCauda;
    String vegetecao;

    public Leao(String cor,
                int quantidadeDeDentes,
                int patas,
                String genero,
                boolean castracao ,
                boolean rugir ,
                boolean temCauda ,
                String vegetecao) {
        super(cor, quantidadeDeDentes, patas, genero, castracao);
        this.rugir = rugir;
        this.temCauda = temCauda;
        this.vegetecao = vegetecao;
    }

    public boolean isRugir() {
        return rugir;
    }

    public void setRugir(boolean rugir) {
        this.rugir = rugir;
    }

    public boolean isTemCauda() {
        return temCauda;
    }

    public void setTemCauda(boolean temCauda) {
        this.temCauda = temCauda;
    }

    public String getVegetecao() {
        return vegetecao;
    }

    public void setVegetecao(String vegetecao) {
        this.vegetecao = vegetecao;
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    @Override
    public int getQuantidadeDeDentes() {
        return super.getQuantidadeDeDentes();
    }

    @Override
    public int getPatas() {
        return super.getPatas();
    }

    @Override
    public String getGenero() {
        return super.getGenero();
    }
    @Override
    public String toString() {
        return "Animal{" +
                "cor='" + cor + '\'' +
                ", quantidadeDeDentes=" + quantidadeDeDentes +
                ", patas=" + patas +
                ", genero='" + genero + '\'' +
                ", castracao=" + castracao +
                ", rugir=" + rugir +
                ", temCauda=" + temCauda +
                ", vegetacao=" + vegetecao;

    }

    @Override
    public void eDomesticalvel() {
        System.out.println("Nao e domesticavel");
    }

    @Override
    public void eCarnivoro() {
        System.out.println("E carnivoro");
    }
}