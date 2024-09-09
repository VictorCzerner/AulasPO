public class ClienteJuridico extends Cliente{
    private double Mensalidade;

    public ClienteJuridico(String Nome, double Mensalidade) {
        super(Nome);
        this.Mensalidade=Mensalidade;
    }

    @Override
    public double getMensalidade() { return Mensalidade;}

    public void SetMensalidade(double Mensalidade){this.Mensalidade=Mensalidade;}
   
   @Override
    public String toString(){return super.toString()+ ", R$"+ getMensalidade();}
}