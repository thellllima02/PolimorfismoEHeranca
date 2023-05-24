package Aula1_POO.Bicicleta;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        
        Bike b1 = new Bike();
        //objeto = B1 e Metodo = mudaCor
        b1.setCor("Amarelo");
        b1.setMarca("Oggi");
        b1.setAno(12);
        b1.setVelocidade(8);
        b1.setReducao();
       
        JOptionPane.showMessageDialog(null, "A cor é "+b1.getCor()+"\n"+"A marca é "+b1.getMarca()+"\n"+"O ano é "
                +b1.getAno()+ "\nSua velocidade era "+b1.getVelocidade()+"\n Velocidade atual "+b1.getReducao());

    }
    


}
