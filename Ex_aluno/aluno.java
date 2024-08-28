import java.time.LocalDate;

public class aluno{
private int Matricula;
private String Nome;
private LocalDate dataValidade;

public aluno(int Matricula, String Nome, LocalDate dataValidade){
this.Matricula = Matricula;
this.Nome=Nome;
this.dataValidade=dataValidade;
}

public int getMatricula(){return Matricula;}
public String getNome(){return Nome;}
public LocalDate getData(){return dataValidade;}

public void setMatricula(int Matricula){this.Matricula=Matricula;}
public void setNome(String Nome){this.Nome=Nome;}
public void setData(LocalDate dataValidade){this.dataValidade=dataValidade;}

@Override
public String toString(){return Nome+ ", "+Matricula+ ", "+dataValidade;}

}