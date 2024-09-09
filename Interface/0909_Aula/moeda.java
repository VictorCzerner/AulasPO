public class moeda{
    private double Valor;
    private String Nome;

    public moeda(String Nome, double Valor){
        this.Nome=Nome;
        this.Valor=Valor;
    }

    public String getNome(){return Nome;}
    public double getValor(){return Valor;}

}