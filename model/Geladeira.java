package model;
public class Geladeira{
    public String marca;
    public int quantidadePortas;
    int quantidadePortasAbertas = 0;

    public Geladeira(String marca, int quantidadePortas){
        this.marca = marca;
        this.quantidadePortas = quantidadePortas;
    }
    public void Abrir(){
        if(this.quantidadePortasAbertas>this.quantidadePortas){
            System.out.println("Todas as portas já estão abertas"); 
        }else{
            int portaSendoAberta = this.quantidadePortasAbertas+1;
            System.out.println("Abrindo a " + portaSendoAberta + " porta");
            quantidadePortasAbertas++;
        }
    }
    public void Fechar(){
        if(this.quantidadePortasAbertas==0){
            System.out.println("todas as portas da geladeira já estão abertas"); 
        }else{
            System.out.println("Fechando uma das portas"); 
            quantidadePortasAbertas--;
        }
    }
}