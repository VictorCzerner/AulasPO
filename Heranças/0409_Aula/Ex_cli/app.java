import java.util.Scanner;


public class app{
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CadastroClientes cC = new CadastroClientes();
        int EscolhaMenu1;
        do{
        System.out.println("Digite Uma opção");
        System.out.println("Digite [1] - Adicionar um Cliente fisico");
        System.out.println("Digite [2] - Adicionar um Cliente juridico");
        System.out.println("Digite [3] - Ver a lista de clientes");
         System.out.println("Digite [0] - Sair");
         EscolhaMenu1 = teclado.nextInt();
        switch (EscolhaMenu1) {
            case 1:{
                System.out.println("Digite o nome:");
                String Nome = teclado.next();
                System.out.println("Digite a idade:");
                int Idade = teclado.nextInt();
                System.out.println("Digite o salario");
                double Salario = teclado.nextDouble();
                ClienteFisico Cli1= new ClienteFisico(Nome, Idade, Salario);
                cC.Cadastro(Cli1);
                System.out.println("Cliente cadastrado!!!");

                break;}
            case 2:{
                System.out.println("Digite o nome");
                String Nome = teclado.next();
                System.out.println("Digite o valor da mensalidade");
                double Mensalidade = teclado.nextInt();
                ClienteJuridico Cli1 = new ClienteJuridico(Nome, Mensalidade);
                cC.Cadastro(Cli1);
                System.out.println("Cliente Cadastrado!!!");
                break;
            }
            case 3:{
                cC.Lista();
                break;
            }

            case 0:{break;}

            default:
                throw new AssertionError();
        }
        } while(EscolhaMenu1 != 0);
}
}