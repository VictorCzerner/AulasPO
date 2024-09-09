import java.util.ArrayList;

public class cofrinho {
    private ArrayList<moeda> cofre;
    private int cont;

    public cofrinho(){
        cofre = new ArrayList<moeda>();
        cont++;
    }

    public void adicionarMoeda(moeda m){
        cofre.add(m);
        cont++;
    }

    public double calcularTotal(){
        for(int i = 0, i<cont, i++){}
    }
}