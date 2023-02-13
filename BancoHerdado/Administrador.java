package BancoHerdado;

//Administrador é um funcionario, Administrador herda da classe FuncionarioAutenticavel
public class Administrador extends FuncionarioAutenticavel{
    
    public double getBonificacao(){
        return 50;
    }
            
}
