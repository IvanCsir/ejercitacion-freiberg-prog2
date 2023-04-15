package figuras;
import excepciones.MiExcepcion;
import interfaces.FiguraGeometrica;
public class Cuadrado implements FiguraGeometrica  {
    private int lado;
    private int ejeX;
    private int ejeY;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) throws MiExcepcion {
        if(lado < 0){
            throw new MiExcepcion("El valor del lado no puede ser negativo");
        }
        this.lado = lado;
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) throws MiExcepcion{
        if(ejeX < 0){
            throw new MiExcepcion("El valor del eje x no puede ser negativo");
        }
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) throws MiExcepcion {
        if(ejeY < 0){
            throw new MiExcepcion("El valor del eje y no puede ser negativo");
        }
        this.ejeY = ejeY;
    }

    public Cuadrado(int lado, int ejeX, int ejeY) throws MiExcepcion {
        super();
        System.out.println("Cuadrado:");
        if(lado < 0){
            throw new MiExcepcion("El valor del lado no puede ser negativo");
        }
        this.lado = lado;
        if(ejeX < 0){
            throw new MiExcepcion("El valor del eje x no puede ser negativo");
        }
        this.ejeX = ejeX;
        if(ejeY < 0){
            throw new MiExcepcion("El valor del eje y no puede ser negativo");
        }
        this.ejeY = ejeY;
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
        return
                "El perímetro del cuadrado es: "+ this.calcularPerimetro() + "\n" +
        "La superficie del cuadrado es: " + this.calcularSuperficie();
    }
}
