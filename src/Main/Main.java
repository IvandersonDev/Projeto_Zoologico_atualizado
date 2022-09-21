package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {
        Ambiente ambiente = new Ambiente(4);

        Sardinha sardinha = new Sardinha
                ("prata",
                        0 ,
                        0 ,
                        "Marinho" ,
                        false ,
                        true ,
                        true,
                        "Salgada");

        Bacalhau bacalhau = new Bacalhau
                ("Palha",
                        15 ,
                        0 ,
                        "Marinho" ,
                        false ,
                        "D",
                        true ,
                        true);

        Leao leao = new Leao
                ("Laranja",
                        42 ,
                        4 ,
                        "Macho",
                        false ,true, true,"Carnivoro");

        Loro loro = new Loro
                ("Verde",
                        0 ,
                        2 ,
                        "Macho",
                        false ,
                        true ,
                        true ,
                        "Selva");

        ambiente.setListaDeAnimal(0 , sardinha);
        ambiente.setListaDeAnimal(1 , bacalhau);
        ambiente.setListaDeAnimal(2 , leao);
        ambiente.setListaDeAnimal(3 , loro);

        Zoologico meuZoologico = new Zoologico(
                "Zoologico catolica",
                ambiente
        );
        System.out.println(meuZoologico);
        System.out.println(meuZoologico.getAmbiente());
        System.out.println("============");
        System.out.println("Bacalhau <-");
        bacalhau.tipoDeAgua();
        bacalhau.eFresco();
        System.out.println("============");
        System.out.println("Leao <-");
        leao.eDomesticalvel();
        leao.eCarnivoro();
        System.out.println("============");
        System.out.println("Loro <-");
        loro.estaEmExtincao();
        loro.quantosAnosVive();
        System.out.println("============");
        System.out.println("Sardinha <-");
        sardinha.tamanho();
        sardinha.peso();
        System.out.println("O Programa Finalizou");


    }
}