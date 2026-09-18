package model;
public class Onibus{
	public String marca;
	public String cor;
	public int quantidadeAssentos;
	public int quantidadePortas;
	
	public Onibus(String marca, String cor, int quantidadeAssentos, int quantidadePortas){
		this.marca = marca;
		this.cor = cor;
		this.quantidadeAssentos = quantidadeAssentos;
		this.quantidadePortas = quantidadePortas;
	}

	public void Acelerar(){
		System.out.println("O ônibus "+ this.cor +" da " + this.marca + " com " + this.quantidadeAssentos + " assentos e " + this.quantidadePortas + " portas está acelerando!");
	}
	public void AbrirPortas(){
		System.out.println("O ônibus "+ this.cor +" da " + this.marca + " com " + this.quantidadeAssentos + " assentos e " + this.quantidadePortas + " portas abriu as portas para os passageiros saírem :)");
	}
}