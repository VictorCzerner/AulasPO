
import java.util.ArrayList;

public class EstatisticaDeDados{
    private ArrayList<Mensuravel> dados;

    public EstatisticaDeDados(){
        dados = new ArrayList<>();
    }

    public void adicionar(Mensuravel num){
        dados.add(num);
    }

    public double getMedia(){
        double soma = 0;
        if (!dados.isEmpty()){
            for (int i = 0; i < dados.size(); i++) {
                soma = soma + dados.get(i).getValor();
                soma = soma/dados.size();
            }
        }
        else {return -1;}

        return soma;
    }

    public double getMaior(){
        double maior=0;
        if (!dados.isEmpty()){
            for (int i = 0; i < dados.size(); i++) {
                if(dados.get(i).getValor()>maior){ maior = dados.get(i).getValor();}
            }
        }
        else {return -1;}
        return maior;
    }

    public double getMenor(){
        double menor=dados.get(0).getValor();
        if (!dados.isEmpty()){
            for (int i = 1; i < dados.size(); i++) {
                if(dados.get(i).getValor()<menor){ menor = dados.get(i).getValor();}
            }
        }
        else {return -1;}
        return menor;
    }
}