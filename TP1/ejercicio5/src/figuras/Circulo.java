package figuras;
import interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private int radio;

    public Circulo(int radio){
        super();
        this.radio = radio;
    }
    @Override
    public int calcularPerimetro() {
        int perimetro = (int) (Math.PI*(radio*2));
        return perimetro;
    }

    @Override
    public int calcularSuperficie() {
        int superficie = (int) (Math.PI*Math.pow(radio,2));
        return superficie;
    }
    @Override
    public String toString(){
        return "El perímetro del circulo es: "+ this.calcularPerimetro() + "\n" +
                "La superficie del circulo es: " + this.calcularSuperficie();
    }
}
