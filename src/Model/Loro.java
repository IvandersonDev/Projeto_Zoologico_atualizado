package Model;

import Interfaces.Iloro;

public class Loro extends Animal implements Iloro {

    boolean temNarinas;
    boolean temAsas;
    String habitat;


    public Loro(String cor,
                int quantidadeDeDentes,
                int patas,
                String genero,
                boolean castracao ,
                boolean temNarinas ,
                boolean temAsas ,
                String habitat) {
        super(cor, quantidadeDeDentes, patas, genero, castracao);
        this.temNarinas = temNarinas ;
        this.temAsas = temAsas;
        this.habitat = habitat;
    }

    public boolean isTemNarinas() {
        return temNarinas;
    }

    public void setTemNarinas(boolean temNarinas) {
        this.temNarinas = temNarinas;
    }

    public boolean isTemAsas() {
        return temAsas;
    }

    public void setTemAsas(boolean temAsas) {
        this.temAsas = temAsas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
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
                ", temNarinas=" + temNarinas +
                ", temAsas=" + temAsas +
                ", habitat" + habitat;


    }

    @Override
    public void estaEmExtincao() {
        System.out.println("Esta em Extincao");
    }

    @Override
    public void quantosAnosVive() {
        System.out.println("Vive em Media 50 Anos");
    }
}