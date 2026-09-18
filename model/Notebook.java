package model;

public class Notebook {
    String cor;
    String marca;
    boolean estaAberto;
    boolean ligado;

    public Notebook(String cor, String marca, boolean estaAberto, boolean ligado) {
        this.cor = cor;
        this.marca = marca;
        this.estaAberto = estaAberto;
        this.ligado = ligado;
    }

    public void ligar() {
        if (!estaAberto) {
            System.out.println("Não é possível ligar com o notebook fechado!");
            return;
        }
        if (ligado) {
            System.out.println("O notebook já está ligado!");
            return;
        }

        ligado = true;
        System.out.println("Notebook ligado!");
    }

    public void desligar() {
        if (!estaAberto) {
            System.out.println("Não é possível desligar com o notebook fechado!");
            return;
        }
        if (!ligado) {
            System.out.println("O Notebook já está desligado!");
            return;
        }

        ligado = false;
        System.out.println("Notebook desligado!");
    }

    public void abrir() {
        if (estaAberto) {
            System.out.println("O Notebook já está aberto!");
            return;
        }

        estaAberto = true;
        System.out.println("Notebook aberto!");
    }

    public void fechar() {
        if (!estaAberto) {
            System.out.println("O Notebook já está fechado!");
            return;
        }

        estaAberto = false;
        System.out.println("Notebook fechado!");
    }

    public boolean getLigado() {return ligado;}

}
