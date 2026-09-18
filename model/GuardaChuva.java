package model;
public class GuardaChuva {
    public String material;
	public String cor;
	public String tamanho;
	public String tipoCabo;
	
	public GuardaChuva(String material, String cor, String tamanho, String tipoCabo){
		this.material = material;
		this.cor = cor;
		this.tamanho = tamanho;
		this.tipoCabo = tipoCabo;
	}

	public void Abrir(){
		System.out.println("O " + this.tamanho + " guarda-chuva " + this.cor + " " + this.tipoCabo +" de " + this.material + " está aberto!");
	}
	public void Fechar(){
		System.out.println("O " + this.tamanho + " guarda-chuva " + this.cor + " " + this.tipoCabo +" de " + this.material + " está fechado :)");
	}
}