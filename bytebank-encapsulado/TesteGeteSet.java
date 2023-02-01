package bytebank-encapsulado;

public class TesteGeteSet {
    
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        conta.setNumero(1337);
        Conta conta2 = new Conta(1337, 24227);
        Conta conta3 = new Conta(1337, 24229);
        //System.out.println(conta.getNumero());
        
        Cliente paulo = new Cliente();
       paulo.setNome("Paulo Silveira2");
        conta.setTitular(paulo);
        
        //System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissão("Programador");
        //System.out.println(titularDaConta);
       // System.out.println(paulo);
        //System.out.println(conta.getTitular());
    }

    
}
