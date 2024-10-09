import java.io.IOException;
import java.util.Scanner;

public class teste{

    public static int getInt(String valor) 
    {
        
        for( int i = 0; i<valor.length(); i++){
            if (!((valor.charAt(i)>='0') && (valor.charAt(i)>='9')))
            {throw new IllegalArgumentException("o valor informado não é um inteiro!!!");}

            }
        return Integer.parseInt(valor); 
    }

    public static int getInt2(String valor) throws IOException 
    {
        
        for( int i = 0; i<valor.length(); i++){
            if (!((valor.charAt(i)>=0) && (valor.charAt(i)>=9)))
            {throw new IOException("o valor informado não é um inteiro!!!");}

            }
        return Integer.parseInt(valor); 
    }


    public static void main(String[] args) {
        System.out.println("digite um valor Inteiro:");
        Scanner teclado = new Scanner(System.in);
        String valor = teclado.next();
        try {
            System.out.println(getInt2(valor));
        } catch (IOException e) {
            System.out.println("exeção capturada");
        }
    }   
}