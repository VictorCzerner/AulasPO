
public class quadrado extends FiguraBidimensional{ 
    private int lado;


    public quadrado(int centrox, int centroy, int lado){
        super(centrox, centroy);
        this.lado=lado;
    }

    public int getlado(){return lado;}

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    
}
