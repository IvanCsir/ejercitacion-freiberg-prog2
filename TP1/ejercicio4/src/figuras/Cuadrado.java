package figuras;
import interfaces.FiguraGeometrica;
public class Cuadrado implements FiguraGeometrica  {
    private int lado;

    public Cuadrado(int lado){
        super();
        this.lado = lado;
    }
    @Override
    public int calcularPerimetro(){
        int perimetro = lado*4;
        return perimetro;
    }

    @Override
    public int calcularSuperficie() {
        int superficie = lado*2;
        return superficie;
    }
    @Override
    public String toString(){
        return "El perímetro del cuadrado es: "+ this.calcularPerimetro() + "\n" +
        "La superficie del cuadrado es: " + this.calcularSuperficie();
    }
}
