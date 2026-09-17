package model;
public class Livro{
	public String nome;
	public String genero;
	public String autor;
	public String dataLancamento;
	boolean aberto;

	public Livro(String nome, String genero, String autor, String dataLancamento){
		this.nome = nome;
		this.genero = genero;
		this.autor = autor;
		this.dataLancamento = dataLancamento;
	}
	public void Abrir(){
		if(this.aberto){
			System.out.println("O livro " + this.nome + " já está aberto");		
		}else{
			System.out.println("O livro " + this.nome + " foi aberto");		
			this.aberto = true;
		}
	}
	public void Ler(){
		if(aberto){
			System.out.println("O livro " + this.nome + "está sendo lido");		
		}else{
			System.out.println("O livro " + this.nome + "não está aberto");		
		}
	}
}
