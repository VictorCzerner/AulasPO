import java.util.Scanner;

public class utils {
    
    public static double toCelcius(double f) throws FarenheitException{ 
        double c = (5*(f - 32))/9;
        if (f < -59.67){throw new FarenheitException("Valor menor que o zero absoluto");}
        return c;
    }

    public static void main(String[] args) throws FarenheitException {
        System.out.println("digite a temperatura em Farenheit:");
        Scanner teclado = new Scanner(System.in);
        double valor = teclado.nextDouble();
        System.out.println(toCelcius(valor)+"c°");
    }
}
