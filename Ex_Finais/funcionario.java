public abstract class funcionario{
    private String nome;
    private double salario;
    private int matricula;
    private static int sequencia = 0;

    public funcionario(String nome, double salario){
        this.salario=salario;
        this.nome = nome;
        this.matricula=sequencia++;
    }

    public double getSalario(){return this.salario;}
    public int getMatricula(){return this.matricula;}

    public abstract double SalarioReal();

    public String toString(){return "Matricula: "+matricula+"; Nome: "+ nome+"; Salario: "+salario;}
}