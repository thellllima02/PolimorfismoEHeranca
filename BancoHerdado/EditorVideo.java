package BancoHerdado;

public class EditorVideo extends Funcionario{

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificação do Editor de Video");
        return 100; 
    }
 }