public class Ventilador {
    public String marca;
    public String tamanho;
    public int quantidadePas;
    public String cor;

    public Ventilador(String marca, String tamanho, int quantidadePas, String cor) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.quantidadePas = quantidadePas;
        this.cor = cor;
    }

    public void VentilarFixo() {
        System.out.println("O ventilador " + marca + " está ventilando de forma fixa.");
    }

    public void VentilarMexendo() {
        System.out.println("O ventilador " + marca + " está ventilando e mexendo (oscilando).");
    }

}