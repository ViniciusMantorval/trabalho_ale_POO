import model.*;
public class Main{

	public static void main(String[] args){
		TesteCaneta();	
		System.out.println();	
		TesteLivro();
		System.out.println();
		TesteCadeira();
		System.out.println();
		TesteMesa();
		System.out.println();
		TesteCelular();
		System.out.println();
		TesteNotebook();
		System.out.println();
		TesteRelogio();
		System.out.println();
		TesteMochila();
		System.out.println();
		TesteGarrafa();
		System.out.println();	
		TesteTelevisao();
		System.out.println();	
		TesteFogao();
		System.out.println();	
		TesteGeladeira();
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

	public static void TesteCadeira() {
		Cadeira cadeira1 = new Cadeira("Madeira",4,1,false);
		Cadeira cadeira2 = new Cadeira("Alumínio",2,1,true);

		System.out.println(cadeira1.getQuantidadePernas());;
		cadeira1.sentar();
		cadeira1.levantar();

		System.out.println(cadeira2.getQuantidadePernas());;
		cadeira2.sentar();
		cadeira2.levantar();
	}
	public static void TesteMesa() {
		Mesa mesa1 = new Mesa("Madeira","Marrom",1,5,5);
		Mesa mesa2 = new Mesa("Plástico","Vermelha",4,2,6);

		mesa1.porObjeto();
		mesa1.retirarObjeto();
		mesa2.retirarObjeto();
		mesa2.retirarObjeto();

		System.out.println(mesa1.getObjetos());
		System.out.println(mesa2.getObjetos());

	}
	public static void TesteCelular() {
		Celular celular1 = new Celular("Preto",250,true,false);
		Celular celular2 = new Celular("Branco",500,false,true);

		System.out.println(celular1.getChip());
		System.out.println(celular2.getChip());

		celular1.ligar();
		celular1.ligar();
		celular2.desligar();
		celular2.desligar();
	}
	public static void TesteNotebook() {
		Notebook notebook1 = new Notebook("Preto","Samsung",false,false);
		Notebook notebook2 = new Notebook("Cinza","Positivo",true, false);

		System.out.println(notebook1.getAberto());
		System.out.println(notebook2.getAberto());

		notebook1.ligar();
		notebook1.abrir();
		notebook1.ligar();
		notebook2.fechar();
		notebook2.desligar();
	}
	public static void TesteRelogio() {
		Relogio relogio1 = new Relogio(23,false,"Parede","Branco");
		Relogio relogio2 = new Relogio(0,true,"Parede","Branco");

		relogio1.mostrarHora();
		relogio2.mostrarHora();
		relogio1.removerAlarme();
		relogio2.adicionarAlarme();

		relogio1.adiantar();
		relogio2.atrasar();
		relogio1.mostrarHora();
		relogio2.mostrarHora();
	}
	public static void TesteMochila() {
		Mochila mochila1 = new Mochila("Couro","Preta",5,1,2);
		Mochila mochila2 = new Mochila("Couro","Rosa",2,0,4);

		mochila1.porObjeto();
		mochila1.porObjeto();
		mochila2.porObjeto();
		mochila2.retirarObjeto();

		System.out.println(mochila1.getObjetos());
		System.out.println(mochila2.getObjetos());
	}
	public static void TesteGarrafa() {
		Garrafa garrafa1 = new Garrafa("Azul", true, 1, 0);
		Garrafa garrafa2 = new Garrafa("Roxo", false, 1, 0);
		garrafa1.encher();
		garrafa2.encher();
		garrafa2.abrir();
		garrafa2.encher();

		System.out.println(garrafa1.getEstaAberta());
		;
		System.out.println(garrafa2.getEstaAberta());
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
}
