package BancoHerdado;

public class Designer extends Funcionario{

    @Override
    public double getBonificacao() {
        
        System.out.println("Chamando o metodo de bonificação do Designer");
        return 100; 
    }    
}

