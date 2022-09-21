package Model;

public class Ambiente {

    Animal [] listaDeAnimal;

    public Ambiente(int capacidadeDoAmbiente){
        listaDeAnimal = new Animal[capacidadeDoAmbiente];
    }
    public void getlistaDeAnimal() {
        for (int i = 0; i < this.listaDeAnimal.length; i++) {
            System.out.println(listaDeAnimal[i]);
        }
    }
    public void setListaDeAnimal(int posicao, Animal animal) {
        this.listaDeAnimal[posicao] = animal;
    }

    @Override
    public String toString() {
        this.getlistaDeAnimal();
        return "Lista";
    }

}
