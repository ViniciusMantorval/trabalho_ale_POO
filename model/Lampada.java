package model;
public class Lampada{
	public int potencia;
	public String cor;
	public int voltagem;
	public String tipo;
	
	public Lampada(int potencia, String cor, int voltagem, String tipo){
		this.potencia = potencia;
		this.cor = cor;
		this.voltagem = voltagem;
		this.tipo = tipo;
	}

	public void Acender(){
		System.out.println("A lâmpada " + this.tipo + " " + this.cor +" de " + this.potencia + "W de potencia e " + this.voltagem + "V está acesa!");
	}
	public void Apagar(){
		System.out.println("A lâmpada " + this.tipo + " " + this.cor +" de " + this.potencia + "W de potencia e " + this.voltagem + "V apagou :)");
	}
}