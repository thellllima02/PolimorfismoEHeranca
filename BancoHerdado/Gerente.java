package BancoHerdado;

public class Gerente extends FuncionarioAutenticavel {
    
    
    
    public double getBonificacao(){
        System.out.println("Chamando o metodo de bonificação do Gerente");
        return super.getSalario();
    }
    
    
}
