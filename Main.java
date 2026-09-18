import model.*;
public class Main{

	public static void main(String[] args){
		TesteCaneta();	
		System.out.println();	
		TesteLivro();
		System.out.println();	
		TesteTelevisao();
		System.out.println();	
		TesteFogao();
		System.out.println();	
		TesteGeladeira();
		System.out.println();	
		TesteVentilador();
	}

	public static void TesteCaneta(){

		Caneta caneta1 = new Caneta("vermelho","BIC","plastico",10);
		caneta1.Escrever("Frase com mais de 10 letras");
		System.out.println(caneta1.quantidadeTinta);	

		Caneta caneta2 = new Caneta("preto","BIC","plastico",20);
		caneta2.Escrever("Frase com mais de 20 letras com certeza");
		System.out.println(caneta2.quantidadeTinta);	
	}
	public static void TesteLivro(){
		Livro livro1 =new Livro("Memórias postumas de Bras Cubas","Romance","Machado de Assis","06/07/1980");
		livro1.Ler();	
		livro1.Abrir();	
		livro1.Ler();	
		System.out.println(livro1.genero);	

			Livro livro2 =new Livro("Harry Potter e o Calice da Morte","fantasia","J.K. Rolling","12/09/1999");
		livro2.Ler();	
		livro2.Abrir();	
		livro2.Ler();	
		System.out.println(livro1.genero);	
	}
	public static void TesteTelevisao(){
		Televisao televisao1 = new Televisao("Sansung","20x60",true,2);
		televisao1.Sintonizar(420);
		televisao1.Ligar();
		televisao1.Sintonizar(420);
		System.out.println(televisao1.quantidadePortasHDMI);	

		Televisao televisao2 = new Televisao("Sansung","20x60",true,2);
		televisao2.Sintonizar(67);
		televisao2.Ligar();
		televisao2.Sintonizar(67);
		System.out.println(televisao2.quantidadePortasHDMI);	
	}
	public static void TesteFogao(){
		Fogao fogao1 = new Fogao("Eletrolux","100x100x100",5,"indução");
		fogao1.Ligar();
		fogao1.Desligar();
		System.out.println(fogao1.tipo);

		Fogao fogao2 = new Fogao("Braztemp","100x100x100",4,"à gas");
		fogao2.Ligar();
		fogao2.Desligar();
		System.out.println(fogao2.tipo);
	}
	public static void TesteGeladeira(){
		Geladeira geladeira1 = new Geladeira("Eletrolux",1);
		geladeira1.Abrir();
		geladeira1.Abrir();
		geladeira1.Fechar();
		geladeira1.Fechar();

		Geladeira geladeira2 = new Geladeira("Braztemp",2);
		geladeira2.Abrir();
		geladeira2.Abrir();
		geladeira2.Fechar();
		geladeira2.Fechar();
	}
	
	public static void TesteVentilador(){
		Ventilador ventilador1 = new Ventilador("Eletrolux","20x60",4,"preto");	
		ventilador1.VentilarFixo();
		ventilador1.VentilarMexendo();
		System.out.println(ventilador1.cor);	
	}
}
