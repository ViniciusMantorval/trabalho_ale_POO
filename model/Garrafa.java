package model;

public class Garrafa {

    String cor;
    boolean estaAberta;
    int capacidade = 0;
    int quantidade = 0;

    public Garrafa(String cor, boolean estaAberta,int capacidade, int quantidade) {
        this.cor = cor;
        this.estaAberta = estaAberta;
        this.capacidade = capacidade;
        this.quantidade = quantidade;

        if (quantidade > capacidade)
            this.quantidade = 0;
        if (quantidade < 0)
            this.quantidade = 0;
        if (capacidade < 0)
            this.capacidade = 0;
    }

    public void encher() {
        if (!estaAberta) {
            System.out.println("Não é possível encher com a garrafa fechada!");
            return;
        }
        if (quantidade >= capacidade) {
            System.out.println("A garrafa está cheia!");
            return;
        }

        quantidade += .5;
        if (quantidade > capacidade)
            quantidade = capacidade;

        System.out.println("Enchido mais .5 L!");
    }

    public void esvaziar() {
        if (!estaAberta) {
            System.out.println("Não é possível esvaziar com a garrafa fechada!");
            return;
        }
        if (quantidade <= 0) {
            System.out.println("A garrafa está vazia!");
            return;
        }

        quantidade -= .5;
        if (quantidade <= 0)
            quantidade = 0;

        System.out.println("Esvaziado mais .5 L!");
    }

    public void abrir() {
        if (estaAberta) {
            System.out.println("A garrafa já está aberta!");
            return;
        }

        estaAberta = true;
        System.out.println("Garrafa aberta!");
    }

    public void fechar() {
        if (!estaAberta) {
            System.out.println("A garrafa já está fechada!");
            return;
        }

        estaAberta = false;
        System.out.println("Garrafa fechada!");
    }

    public boolean getEstaAberta() {return estaAberta;}

}
