package model;

public class Cadeira {

    String material;
    int quantidade_pernas;
    int altura;
    boolean sentado;

    public Cadeira(String material,int quantidade_pernas,int altura,boolean sentado) {
        this.material = material;
        this.quantidade_pernas = quantidade_pernas;
        this.altura = altura;
        this.sentado = sentado;
    }

    public void sentar() {
        if (sentado) {
            System.out.println("Já está sentado!");
            return;
        }

        sentado = true;
        System.out.println("Sentado!");
    }

    public void levantar() {
        if (!sentado) {
            System.out.println("Já está levantado!");
            return;
        }

        sentado = false;
        System.out.println("Levantado!");
    }

    public int getQuantidadePernas() {return quantidade_pernas;}

}
