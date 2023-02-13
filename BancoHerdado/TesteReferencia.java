package BancoHerdado;

public class TesteReferencia {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        g1.setSalario(2000);
        
        Empregado w = new Empregado();
        w.setSalario(2000);
        
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500);
        
        Designer d = new Designer();
        d.setSalario(2000);
        
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(w);
        controle.registra(ev);
        controle.registra(d);


        System.out.println(controle.getSoma());
    }
}
