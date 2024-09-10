public abstract class Cliente implements Mensuravel{
    private String Nome;

    public Cliente(String Nome)
    {this.Nome=Nome;}

    public String getNome(){return Nome;}

    public abstract double getMensalidade();
    
    @Override
    public String toString(){return Nome;}

    
}