public class aluno{
private int Matricula;
private String Nome;
private String Data;

public aluno(int Matricula, String Nome, String Data){
this.Matricula = Matricula;
this.Nome=Nome;
this.Data=Data;
}

public int getMatricula(){return Matricula;}
public String getNome(){return Nome;}
public String getData(){return Data;}

public void setMatricula(int Matricula){this.Matricula=Matricula;}
public void setNome(String Nome){this.Nome=Nome;}
public void setData(String Data){this.Data=Data;}

@Override
public String toString(){return "nome do aluno: "+Nome+ " matricula do aluno: "+Matricula+ " Data de nascimento do aluno: "+Data;}

}