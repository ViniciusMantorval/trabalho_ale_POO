package model;
public class Televisao{
	public String marca;
	public String dimensoes;
	public boolean isSmart;
	public int quantidadePortasHDMI;
	boolean ligado= false;

	public Televisao(String marca,String dimensoes,boolean isSmart, int quantidadePortasHDMI){
		this.marca = marca;
		this.dimensoes = dimensoes;
		this.quantidadePortasHDMI = quantidadePortasHDMI;
	}
	public void Ligar(){
		if(ligado){
			System.out.println("A televisão "+ this.marca + "já está ligada");
		}else{
			System.out.println("A televisão "+ this.marca + "ligada");
			ligado = true;
		}
	}
	public void Sintonizar(int canal){
		if(ligado){
			System.out.println("A televisão "+ this.marca + "sintonizando no canal "+ canal);
		}else{
			System.out.println("a televisão "+ this.marca + "está desligada, impossivel sintonizar");
		}
	}
}
