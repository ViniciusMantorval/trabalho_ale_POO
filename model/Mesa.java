package model;

public class Mesa {
    String material;
    String cor;
    int quantidade_pernas;
    int objetos;
    int capacidade;

    public Mesa(String material, String cor, int quantidade_pernas, int objetos, int capacidade) {
        this.material = material;
        this.cor = cor;
        this.quantidade_pernas = quantidade_pernas;
        this.objetos = objetos;
        this.capacidade = capacidade;

        if (objetos > capacidade)
            this.objetos = 0;
        if (objetos < 0)
            this.objetos = 0;
        if (capacidade < 0)
            this.capacidade = 0;

    }

    public void porObjeto() {
        if (objetos == capacidade) {
            System.out.println("A mesa está cheia!");
            return;
        }
        objetos++;
        System.out.println("Objeto Adicionado! a mesa tem " + objetos + "!");
    }

    public void retirarObjeto() {
        if (objetos < 1) {
            System.out.println("A mesa não possui objetos sobre!");
            return;
        }
        objetos--;

        System.out.println("Objeto Adicionado! a mesa tem " + objetos + "!");
    }

    public int getObjetos() {return objetos;}

}
