package model;
public class Fogao{
    public String marca;
    public String dimensoes;
    public int quantidadeBocas;
    public String tipo;
    boolean ligado = false;

    public Fogao(String marca,String dimensoes, int quantidadeBocas, String tipo){
        this.marca = marca;
        this.dimensoes = dimensoes;
        this.quantidadeBocas = quantidadeBocas;
        this.tipo = tipo;
    }
    public void Ligar(){
        if(ligado){
            System.out.println("O fogão " + this.marca +" está ligado, impossivel ligar algo já ligado");
        }else{
            System.out.println("Ligando o fogão "+ this.marca +"!!");
            ligado =true;
        }
    }
    public void Desligar(){
        if(ligado){
            System.out.println("Desligando o fogão "+ this.marca +" !!!");
            ligado = false;
        }else{
            System.out.println("O fogão "+ this.marca +" já está desligado");
        }
    }
 
}