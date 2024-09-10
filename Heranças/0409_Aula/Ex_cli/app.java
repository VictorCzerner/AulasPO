import java.util.Scanner;


public class app{


    
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CadastroClientes cC = new CadastroClientes();

        ClienteFisico Cli2= new ClienteFisico("Victor", 19, 3021);
        cC.Cadastro(Cli2);
        ClienteFisico Cli3= new ClienteFisico("Marcelo", 19, 1504);
        cC.Cadastro(Cli3);
        ClienteFisico Cli4= new ClienteFisico("Raphael", 72, 1214);
        cC.Cadastro(Cli4);

        int EscolhaMenu1;
        do{
        System.out.println("Digite Uma opção");
        System.out.println("Digite [1] - Adicionar um Cliente fisico");
        System.out.println("Digite [2] - Adicionar um Cliente juridico");
        System.out.println("Digite [3] - Ver a lista de clientes");
        System.out.println("Digite [4] - Ver a média das mensalidades por cliente");
        System.out.println("Digite [5] - Ver a maior das mensalidades");
        System.out.println("Digite [6] - Ver a menor das mensalidades");
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

            case 4:{
                EstatisticaDeDados copia = new EstatisticaDeDados();
                for (int i = 0; i < cC.size(); i++) {
                    copia.adicionar(cC.get(i));
                }
                System.out.println("Média de mensalidade por Cliente: "+ copia.getMedia());
                break;
            }
            
            case 5:{
                EstatisticaDeDados copia = new EstatisticaDeDados();
                for (int i = 0; i < cC.size(); i++) {
                    copia.adicionar(cC.get(i));
                }
                System.out.println("Maior mensalidade: "+ copia.getMaior());
                break;
            }
            
            case 6:{
                EstatisticaDeDados copia = new EstatisticaDeDados();
                for (int i = 0; i < cC.size(); i++) {
                    copia.adicionar(cC.get(i));
                }
                System.out.println("Menor mensalidade: "+ copia.getMenor());
                break;
            }

            case 0:{break;}

            default:
                throw new AssertionError();
        }
        } while(EscolhaMenu1 != 0);
}

}