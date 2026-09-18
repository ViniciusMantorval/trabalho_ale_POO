package model;
public class Bicicleta {
    public String marca;
    public String cor;
    public double peso;
    public int quantidadeMarchas;

    int marchaAtual;

    public Bicicleta(String marca, String cor, double peso, int quantidadeMarchas) {
        this.marca = marca;
        this.cor = cor;
        this.peso = peso;
        this.quantidadeMarchas = quantidadeMarchas;
        this.marchaAtual = 1; 
    }

    public void pedalar() {
        System.out.println("A bicicleta " + marca + " está pedalando.");
    }

    public void trocarMarcha(int marcha) {
        if (marcha >= 1 && marcha <= this.quantidadeMarchas) {
            this.marchaAtual = marcha;
            System.out.println("Marcha trocada para: " + this.marchaAtual);
        } else {
            System.out.println("Marcha inválida! Esta bicicleta possui " + this.quantidadeMarchas + " marchas.");
        }
    }

}