import model.*;
public class Main{

	public static void main(String[] args){
		TesteCaneta();	
		System.out.println();	
		TesteLivro();
		System.out.println();	
		TesteTelevisao();
		System.out.println();	
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
		int[] dimensoes = {20,60};
		Televisao televisao1 = new Televisao("Sansung",dimensoes,true,2);
		televisao1.Sintonizar(420);
		televisao1.Ligar();
		televisao1.Sintonizar(420);
		System.out.println(televisao1.quantidadePortasHDMI);	

		Televisao televisao2 = new Televisao("Sansung",dimensoes,true,2);
		televisao2.Sintonizar(67);
		televisao2.Ligar();
		televisao2.Sintonizar(67);
		System.out.println(televisao2.quantidadePortasHDMI);	
	}
}
