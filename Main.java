import model.Caneta;
public class Main{

	public static void main(String[] args){
		TesteCaneta();	
	}
	public static void TesteCaneta(){

		Caneta caneta1 = new Caneta("vermelho","BIC","plastico",10);
		caneta1.Escrever("Frase com mais de 10 letras");
		System.out.println(caneta1.quantidadeTinta);	

		Caneta caneta2 = new Caneta("preto","BIC","plastico",20);
		caneta2.Escrever("Frase com mais de 20 letras com certeza");
		System.out.println(caneta2.quantidadeTinta);	
	}
}
