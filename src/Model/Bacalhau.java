package Model;

import Interfaces.IBacalhau;

public class Bacalhau extends Animal implements IBacalhau {

    String vitamina ;
    boolean viveEmCardumes;
    boolean facilDigestao;

    public Bacalhau(String cor,
                    int quantidadeDeDentes,
                    int patas,
                    String genero,
                    boolean castracao ,
                    String vitamina ,
                    boolean viveEmCardumes ,
                    boolean facilDigestao) {
        super(cor, quantidadeDeDentes, patas, genero, castracao);
        this.vitamina = vitamina ;
        this.facilDigestao = facilDigestao;
        this.viveEmCardumes = viveEmCardumes;
    }

    public String getVitamina() {
        return vitamina;
    }

    public void setVitamina(String vitamina) {
        this.vitamina = vitamina;
    }

    public boolean isViveEmCardumes() {
        return viveEmCardumes;
    }

    public void setViveEmCardumes(boolean viveEmCardumes) {
        this.viveEmCardumes = viveEmCardumes;
    }

    public boolean isFacilDigestao() {
        return facilDigestao;
    }

    public void setFacilDigestao(boolean facilDigestao) {
        this.facilDigestao = facilDigestao;
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
                ", vitamina=" + vitamina +
                ", viveEmCardumes=" + viveEmCardumes +
                ", facilDigestao=" + facilDigestao;


    }

    @Override
    public void tipoDeAgua() {
        System.out.println("Agua doce\n");
    }

    @Override
    public void eFresco() {
        System.out.println("Peixe fresco\n");
    }
}