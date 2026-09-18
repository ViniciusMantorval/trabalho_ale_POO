package model;

public class Celular {
    String cor;
    int armazenamento;
    boolean possuiChip;
    boolean ligado;

    public Celular(String cor, int armazenamento, boolean possuiChip,boolean ligado) {
        this.cor = cor;
        this.armazenamento = armazenamento;
        this.possuiChip = possuiChip;
        this.ligado = ligado;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O aparelho já está ligado!");
            return;
        }

        ligado = true;
        System.out.println("Aparelho ligado!");
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O aparelho já está desligado!");
            return;
        }

        ligado = false;
        System.out.println("Aparelho desligado!");
    }

    public void reiniciar() {
        if (!ligado) {
            System.out.println("Não é possível reiniciar um aparelho desligado!");
            return;
        }
        System.out.println("Aparelho reiniciado!");
    }

    public void colocarChip() {
        if (possuiChip) {
            System.out.println("O aparelho já possui chip!");
            return;
        }

        possuiChip = true;
        System.out.println("Chip inserido com sucesso!");
    }

    public void tirarChip() {
        if (!possuiChip) {
            System.out.println("O aparelho não tem chip!");
            return;
        }

        possuiChip = false;
        System.out.println("Chip removido com sucesso!");
    }

    public boolean getLigado() {return ligado;}
}
