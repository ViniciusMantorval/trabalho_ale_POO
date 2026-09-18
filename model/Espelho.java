package model;
public class Espelho{
	public String tamanho;
	public String formato;
	public String materialMoldura;
	public String corMoldura;
	
	public Espelho(String tamanho, String formato, String materialMoldura, String corMoldura){
		this.tamanho = tamanho;
		this.formato = formato;
		this.materialMoldura = materialMoldura;
		this.corMoldura = corMoldura;
	}

	public void Refletir(){
		System.out.println("O espelho " + this.tamanho + " e " + this.formato +" que possui moldura " + this.corMoldura + " de " + this.materialMoldura + " reflete seu rosto!");
	}
	public void Limpar(){
		System.out.println("O espelho " + this.tamanho + " e " + this.formato +" que possui moldura " + this.corMoldura + " de " + this.materialMoldura + " agora está limpo :)");
	}
}