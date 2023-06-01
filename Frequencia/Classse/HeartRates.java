package Frequencia.Classse;
import javax.swing.JOptionPane;
public class HeartRates {
 
    private String Nome;
    private String SobreNome;
    private String DataDeNascimento;
    private int Idade;
    private int Maxima;
    
    
    public HeartRates(String nome, String sobreNome, int dia, int mes, int ano){
        this.Nome = nome;
        this.SobreNome = sobreNome;
        this.DataDeNascimento = dia+"/"+mes+"/"+ano;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public void setSobreNome(String SobreNome) {
        this.SobreNome = SobreNome;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }
    
    public void setIdade(int ano){
        this.Idade = 2023-ano;
    }
    
    public int getIdade(){
        return this.Idade;
    }
    
    public void setMaxima(){
    this.Maxima = 220 - this.Idade;
    }
    
    public int getMaxima(){
        return this.Maxima;
    }
    public Double setCardiacaAlvo(){
       Double media = this.Maxima*0.65;
        return media;
    }
    
    
    public String HeartRates(){
       JOptionPane.showMessageDialog(null, "Nome : "+getNome()+"\nSobre Nome : "+getSobreNome()+
               "\nData de Nascimento : "+getDataDeNascimento()+"\nIdade : "+getIdade()+"\nFrequência Máxima : "+getMaxima()+
               "\nIntervalo Frequência Alvo : "+setCardiacaAlvo());
       return null;
    }
    
}
