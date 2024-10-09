import java.util.HashMap;
import java.util.Map;

public class Fila{
    private Map<Integer, Cliente> fila;
    private FilaArray f;
    private Integer cont;
    
    public Fila(){
        fila = new HashMap<>();
        f = new FilaArray();
        cont = 0;
    }

    public Integer add(Cliente cli1){
        cont++;
        fila.put(cont, cli1);
        return cont;
    }

    public FilaArray Att(){
        for (Integer i: fila.keySet())
        if (fila.get(i).getGravidez() == true){f.enqueue(i);}
        for (Integer i: fila.keySet())
        if (fila.get(i).getIdade() >= 65 && fila.get(i).getGravidez() == false){f.enqueue(i);}
        for (Integer i: fila.keySet())
        if (fila.get(i).getIdade() < 65 && fila.get(i).getGravidez() == false){f.enqueue(i);}
        return f;
    }

}