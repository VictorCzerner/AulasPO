public class Cliente {
    private int idade;
    private String nome;
    private boolean gravidez;

    public Cliente(int idade, String nome, boolean gravidez){
        this.idade=idade;
        this.nome=nome;
        this.gravidez=gravidez;
    }

    public int getIdade(){return idade;}
    public String getNome(){return nome;}
    public boolean getGravidez(){return gravidez;}
}
