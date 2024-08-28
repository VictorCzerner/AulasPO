import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CadastroAlunos{
private ArrayList<aluno> alunos;
private int contAlu;
private static final String fName = "alunos.txt";

public CadastroAlunos(){
        alunos = new ArrayList<>();
        contAlu = 0;
}

public void carregaAlunos(){
String currDir = Paths.get("").toAbsolutePath().toString();
        Path path = Paths.get(currDir, fName);
}
}


