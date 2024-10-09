
public class App {
    public static void main(String[] args) {
        Fila teste = new Fila();
        Cliente cli1 = new Cliente(72, "Cleber", false);
        Cliente cli2 = new Cliente(52, "Joao", false);
        Cliente cli3 = new Cliente(24, "maria", true);
        teste.add(cli1);
        teste.add(cli2);
        teste.add(cli3);
        System.out.println(teste.Att());
             
    }
}
