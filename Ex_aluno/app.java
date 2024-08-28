
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class app{
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        CadastroAlunos cA = new CadastroAlunos();
        System.out.println("Lendo Arquivo...");
        cA.leAlunos();
        System.out.println("Alunos carregados!");
        System.out.println(cA);
        int tamInicial = cA.getTamanho();
        int EscolhaMenu1;
        do{
        System.out.println("Deseja adicionar ou remover um aluno?");
        System.out.println("Digite [1] - Adicionar");
        System.out.println("Digite [2] - Remover");
        System.out.println("Digite [3] - Ver a lista de alunos");
         System.out.println("Digite [0] - Sair");
         EscolhaMenu1 = teclado.nextInt();
        switch (EscolhaMenu1) {
            case 1:{
                System.out.println("Digite a matricula do aluno:");
                int matricula = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Digite o nome do aluno:");
                String nome = teclado.nextLine();
                System.out.println("Digite a data de nascimento do aluno:(Ex.: 11/08/2005)");
                String dataC = teclado.nextLine();
                String dataN[] = dataC.split("/");
                LocalDate data = LocalDate.of(Integer.parseInt(dataN[2]), Integer.parseInt(dataN[1]), Integer.parseInt(dataN[0]));
                aluno alu1 = new aluno(matricula, nome, data);
                cA.adicionaAluno(alu1);
                System.out.println("Aluno adicionado!!!");

                break;}
            case 2:{
                System.out.println("Digite a matricula do aluno:");
                int matricula = teclado.nextInt();
                teclado.nextLine();
                cA.removeAluno(matricula);
                System.out.println("Aluno removido!!!");
                break;
            }
            case 3:{
                cA.ListaAlunos();
                break;
            }

            case 0:{break;}

            default:
                throw new AssertionError();
        }
        } while(EscolhaMenu1 != 0);

        System.out.println("Gravando os novos alunos:");
        cA.escreveAlunos(tamInicial);
        System.out.println("Alunos Gravados!!!");
        System.out.println(cA);
    }
}

