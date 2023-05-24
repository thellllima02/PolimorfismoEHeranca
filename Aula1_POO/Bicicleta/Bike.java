package Aula1_POO.Bicicleta;

public class Bike {
    

    //Atributos da Classe 
    private String cor;
    private String marca;
    private int ano;
    private int velocidade;
    private int reducao;
    
    //Metodos da Classe (é o comportamento da classe).
    //Get saida e Set pra entrar
    //void naão retorna nada para a memoria.

    public String getCor() {
        return cor;
    }
    
   
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        
    }

    public int getReducao() {
        return reducao;
    }
    
    public void setReducao (){
        if (this.velocidade>10){
            this.reducao = this.velocidade -20;
            
        }
    }
    
   



}

