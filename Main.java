import model.Caneta;
import model.Onibus;
import model.Lampada;
import model.Espelho;
import model.GuardaChuva;
import model.Sapato;
public class Main{

	public static void main(String[] args){
		TesteCaneta();
		Onibus();
		Lampada();
		Espelho();
		GuardaChuva();
		Sapato();
	}
	public static void TesteCaneta(){

		Caneta caneta1 = new Caneta("vermelho","BIC","plastico",10);
		caneta1.Escrever("Frase com mais de 10 letras");
		System.out.println(caneta1.quantidadeTinta);	

		Caneta caneta2 = new Caneta("preto","BIC","plastico",20);
		caneta2.Escrever("Frase com mais de 20 letras com certeza");
		System.out.println(caneta2.quantidadeTinta);	
	}

	public static void Onibus(){

		Onibus onibus1 = new Onibus("Marcopolo", "amarelo", 30, 2);
		onibus1.Acelerar();
		onibus1.AbrirPortas();

		Onibus onibus2 = new Onibus("Caio", "verde", 42, 3);
		onibus2.Acelerar();
		onibus2.AbrirPortas();
	}

	public static void Lampada(){

	Lampada lampada1 = new Lampada(40, "amarela", 220, "incandescente");
	lampada1.Acender();
	lampada1.Apagar();

	Lampada lampada2 = new Lampada(7, "branca", 110, "LED");
	lampada2.Acender();
	lampada2.Apagar();
	}

	public static void Espelho(){

	Espelho espelho1 = new Espelho("grande", "redondo", "madeira", "preta");
	espelho1.Refletir();
	espelho1.Limpar();

	Espelho espelho2 = new Espelho("pequeno", "retangular", "plástico", "roxa");
	espelho2.Refletir();
	espelho2.Limpar();
	}

	public static void GuardaChuva(){

	GuardaChuva guardachuva1 = new GuardaChuva("poliéster", "azul", "grande", "não retrátil");
	guardachuva1.Abrir();
	guardachuva1.Fechar();

	GuardaChuva guardachuva2 = new GuardaChuva("nylon", "roxo", "pequeno", "retrátil");
	guardachuva2.Abrir();
	guardachuva2.Fechar();
	}

	public static void Sapato(){

	Sapato sapato1 = new Sapato("Adidas", "preto", 39, "couro");
	sapato1.Calcar();
	sapato1.Tirar();

	Sapato sapato2 = new Sapato("Melissa", "rosa", 37, "PVA");
	sapato2.Calcar();
	sapato2.Tirar();
	}
}
