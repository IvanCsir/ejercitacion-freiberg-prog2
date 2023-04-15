package figuras;
import interfaces.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calcularPerimetro() {
        int perimetro = base*2 + altura*2;
        return perimetro;
    }

    @Override
    public int calcularSuperficie() {
        int superficie = base*altura;
        return superficie;
    }
    @Override
    public String toString(){
        return "El perímetro del rectangulo es: "+ this.calcularPerimetro() + "\n" +
                "La superficie del rectangulo es: " + this.calcularSuperficie();
    }
}
