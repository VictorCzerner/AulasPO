public class retangulo extends FiguraBidimensional{
    private int base, altura;

    
    public retangulo(int centrox, int centroy, int base, int altura) {
        super(centrox, centroy);
        this.base=base;
        this.altura=altura;
    }

public int getbase(){return base;}
public int getaltura(){return altura;}

    @Override
    public double area() {
        return base*altura;
    }
    
}
