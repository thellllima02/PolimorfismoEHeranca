package BancoHerdado;

public class Empregado extends Funcionario{

    @Override
    public double getBonificacao() {
        
        System.out.println("Chamando o metodo de bonificação do Empregado");
        return 150; 
    }
}

