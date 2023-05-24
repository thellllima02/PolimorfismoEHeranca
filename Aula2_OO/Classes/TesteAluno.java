package Aula2_OO.Classes;
import javax.swing.JOptionPane;
public class TesteAluno {
    public static void main(String[] args) {
        
        Aluno Cadu = new Aluno();
        Turma Pri = new Turma();
        
        Pri.setAno(2023);
        Cadu.setMatricula("sem matricula");
        Cadu.setSituacao("legal");
        
        Cadu.setMatricular(Cadu.getSituacao(), Cadu.getMatricula());
        
        Cadu.getMatricular();
        Cadu.setFormado("Não concluio");
        Cadu.setEvadir("saiu");
       
        Pri.setSituacao("legal");
        Pri.setAbrirTurma(Pri.getAno());
    
    }
}
