import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Fila{
    private Map<Integer, Cliente> fila;
    private Queue<Integer> f;
    private Integer cont;
    
    public Fila(){
        fila = new HashMap<>();
        f = new LinkedList<Integer>();
        cont = 0;
    }

    public Integer add(Cliente cli1){
        cont++;
        fila.put(cont, cli1);
        return cont;
    }

    public Queue Att(){
        for (Integer i: fila.keySet())
        if (fila.get(i).getGravidez() == true){f.add(i);}
        for (Integer i: fila.keySet())
        if (fila.get(i).getIdade() >= 65 && fila.get(i).getGravidez() == false){f.add(i);}
        for (Integer i: fila.keySet())
        if (fila.get(i).getIdade() < 65 && fila.get(i).getGravidez() == false){f.add(i);}
        return f;
    }

}