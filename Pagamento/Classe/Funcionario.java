package Classe;

public class Funcionario {
    
    private String Nome;
    private Double Salario;
    private String DataDeAdmissao;
    private Boolean Sexo;
    private Double Extra;
    private Double Auxilio;
    private Double Feriado;
    private Double Normal;
    private Double Anual;
     
    //Construtor para a entrada de informações principais 
    public Funcionario(String Nome, Double Salario, String DataDeAdmissao, Boolean Sexo) {
        this.Nome = Nome;
        this.Salario = Salario;
        this.DataDeAdmissao = DataDeAdmissao;
        this.Sexo = Sexo;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public String getDataDeAdmissao() {
        return DataDeAdmissao;
    }

    public void setDataDeAdmissao(String DataDeAdmissao) {
        this.DataDeAdmissao = DataDeAdmissao;
    }

    public Boolean getSexo() {
        return Sexo;
    }

    public void setSexo(Boolean Sexo) {
        this.Sexo = Sexo;
    }
    //Valor referente a hora extra 
    public void setHoraExtra(){
        this.Extra = this.getSalario()/220;
    }
    
    public Double getHoraExtra(){
        return Extra;
    }
    //Referente ao auxilio pago somente as mulher auxilio-creche
    public void setAuxilio(){
        if(getSexo() == true){
            this.Auxilio = this.Salario*0.05;
        }
        else {
            this.Auxilio = 0.0;
        }
    }
    
    public Double getAuxilio(){
        return Auxilio;
    }
    
    //Calcular as horas extra em dias de feriado
    public void setFeriado(int n){
        this.Feriado = (getHoraExtra()*2)*n;
    }
    
    public Double getFeriado(){
        return Feriado;
    }
    
    //Calcular as horas extras em dias normais(Diferentes de domingo e feriado)
    public void setNormal(int m){
        this.Normal = (getHoraExtra()*1.5)*m;
    }
    
    public Double getNormal(){
        return Normal;
    }
    
    //Calcular o salario anual(Tanto para mulher quando para homens)
    public void setAnual(){
        if(getSexo()==true){
            this.Anual = (getAuxilio()+getFeriado()+getSalario()+getNormal())*12;
        }
        else{
            this.Anual = (getFeriado()+getNormal()+getSalario())*12;
        }
    }
    
    public Double getAnual(){
        return Anual;
    }
}
