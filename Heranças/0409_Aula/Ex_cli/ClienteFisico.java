public class ClienteFisico extends Cliente{
    private int Idade;
    private double Salario;

    public ClienteFisico(String Nome, int Idade, double Salario) {
        super(Nome);
        this.Idade=Idade;
        this.Salario=Salario;
    }
    
    public int getIdade(){return Idade;}
    public double getSalario(){return Salario;}

    public void SetIdade(int Idade){this.Idade=Idade;}
    public void setSalario(double Salario){this.Salario=Salario;} 

    @Override
    public double getMensalidade() {
        if(Idade>=60){return (Salario/100)*15;}
        else{return (Salario/100)*10;}
    }

    @Override
    public String toString(){return super.toString()+ ", R$"+ getMensalidade();}
}