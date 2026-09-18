package model;

public class Mochila {
    String material;
    String cor;
    int quantidade_bolsos;
    int objetos;
    int capacidade;

    public Mochila(String material, String cor, int quantidade_bolsos, int objetos, int capacidade) {
        this.material = material;
        this.cor = cor;
        this.quantidade_bolsos = quantidade_bolsos;
        this.objetos = objetos;
        this.capacidade = capacidade;
    }

    public void porObjeto() {
        if (objetos == capacidade) {
            System.out.println("A mochila está lotada!");
            return;
        }
        objetos++;
        System.out.println("Objeto Adicionado! a mochila tem " + objetos + " de " + capacidade + " objetos!");
    }

    public void retirarObjeto() {
        if (objetos < 1) {
            System.out.println("A mochila já está vazia!");
            return;
        }
        objetos--;

        System.out.println("Objeto removido! a mochila tem " + objetos + " de " + capacidade + " objetos!");
    }

    public int getObjetos() {return objetos;}

}
