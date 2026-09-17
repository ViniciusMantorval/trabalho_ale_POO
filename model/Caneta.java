package model;
public class Caneta{
	public String cor;
	public String marca;
	public String material;
	public int quantidadeTinta;
	
		public Caneta(String cor, String marca, String material, int quantidadeTinta){
		this.cor =  cor;
		this.marca =marca;
		this.material = material;
		this.quantidadeTinta = quantidadeTinta;
	}

	public void Escrever(String texto){
		quantidadeTinta -= texto.length();
		System.out.println("A caneta "+ this.cor +" da " + this.marca + " escreveu: "+ texto);
		if(this.quantidadeTinta<=0){
			Acabar();
		}
	}
	void Acabar(){
		System.out.println("A caneta "+ this.cor +" da " + this.marca + " acabou");	
	}
}
