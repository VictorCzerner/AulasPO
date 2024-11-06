public class funcA extends funcionario {
    public funcA(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double SalarioReal() {
        return getSalario();
    }
}
