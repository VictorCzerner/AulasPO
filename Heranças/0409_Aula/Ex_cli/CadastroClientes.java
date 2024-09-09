import java.util.ArrayList;

public class CadastroClientes{
private ArrayList<Cliente> CadastroCli;
private int contCli;

public CadastroClientes(){
        CadastroCli = new ArrayList<>();
        contCli=0;
}

public void Cadastro(Cliente Cli1){
    CadastroCli.add(Cli1);
    contCli++;
}

public void Lista(){
        for (int i = 0; i < CadastroCli.size(); i++) {
            System.out.println(CadastroCli.get(i).toString() +"\n");
        }
}


}