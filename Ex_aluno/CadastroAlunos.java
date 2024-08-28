import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAlunos{
private ArrayList<aluno> alunos;
private int contAlu;
private static final String fName = "alunos.txt";

public int getTamanho(){return alunos.size();}

public CadastroAlunos(){
        alunos = new ArrayList<>();
        contAlu=0;
}

public void adicionaAluno(aluno alu1){
        alunos.add(alu1);
        contAlu++;
}

public void removeAluno(int num){
 for (int i = 0; i < alunos.size(); i++) {
        aluno a = alunos.get(i);
     if (num == a.getMatricula()){
        alunos.remove(i);
        contAlu--;
     }
 }
}

public void ListaAlunos(){
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).toString() +"\n");
        }
}

public void escreveAlunos(int num){
        String currDir = Paths.get("").toAbsolutePath().toString();
        Path path = Paths.get(currDir, fName);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
                for (int i = 0; i < alunos.size(); i++) {
                    writer.print(alunos.get(i).toString() + "\n");
                    
                }
                writer.close();
        }catch (IOException x){
          System.err.format("Erro de E/S: %s%n", x);
      }
}
    public void leAlunos() throws IOException{
        String currDir = Paths.get("").toAbsolutePath().toString();
        Path path = Paths.get(currDir, fName);
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
        while(sc.hasNext()){
               String linha = sc.nextLine();
               String dados[] = linha.split(", ");
               int Matricula = Integer.parseInt(dados[1]);
               String nome = dados[0];
               String dataC = dados[2];
               String dataN[] = dataC.split("-");
               LocalDate data = LocalDate.of(Integer.parseInt(dataN[0]), Integer.parseInt(dataN[1]), Integer.parseInt(dataN[2]));
               aluno alu2 = new aluno(Matricula, nome, data);
               alunos.add(alu2);
               contAlu++;
        }
    }
}


}

