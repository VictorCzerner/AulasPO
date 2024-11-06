public class funcB extends funcionario {
    public funcB(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double SalarioReal() {
        return getSalario()+(getSalario()/10);
    }

    
}
