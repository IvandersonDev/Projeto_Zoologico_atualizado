package Model;

import Interfaces.ISardinha;

public class Sardinha extends Animal implements ISardinha {

    boolean respiracao;
    boolean temEscama;
    String tipoDeAgua;



    public Sardinha(String cor,
                    int quantidadeDeDentes,
                    int patas, String genero,
                    boolean castracao ,
                    boolean respiracao,
                    boolean temEscama ,
                    String tipoDeAgua)
    {
        super(cor, quantidadeDeDentes, patas, genero, castracao);
        this.respiracao = respiracao;
        this.temEscama = temEscama;
        this.tipoDeAgua = tipoDeAgua;
    }

    public boolean isRespiracao() {
        return respiracao;
    }

    public void setRespiracao(boolean respiracao) {
        this.respiracao = respiracao;
    }

    public boolean getTemEscama() {
        return temEscama;
    }

    public void setTemEscama(boolean temEscama) {
        this.temEscama = temEscama;
    }

    public String getTipoDeAgua() {
        return tipoDeAgua;
    }

    public void setTipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
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
                ", respiraçao=" + respiracao +
                ", temEscama=" + temEscama +
                ", tipoDeAgua=" + tipoDeAgua;
    }

    @Override
    public void tamanho() {
        System.out.println("Entre 27 Cm");
    }

    @Override
    public void peso() {
        System.out.println("300 gramas");

    }
}