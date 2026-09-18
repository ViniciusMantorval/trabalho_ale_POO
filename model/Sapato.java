package model;
public class Sapato {
    public String marca;
	public String cor;
	public int tamanho;
	public String material;
	
	public Sapato(String marca, String cor, int tamanho, String material){
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
	}

	public void Calcar(){
		System.out.println("Você calçou o sapato de " + this.material + " " + this.cor + " tamanho " + this.tamanho + " da " + this.marca + "!");
	}
	public void Tirar(){
		System.out.println("Você tirou o sapato de " + this.material + " " + this.cor + " tamanho " + this.tamanho + " da " + this.marca + " :)");
	}
}