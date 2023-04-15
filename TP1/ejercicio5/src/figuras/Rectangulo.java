package figuras;
import excepciones.MiExcepcion;
import interfaces.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica{
    private int base;
    private int altura;
    private int ejeX;
    private int ejeY;

    public Rectangulo(int base, int altura) throws MiExcepcion {
        super();
        System.out.println("Rectangulo:");
        if(base < 0){
            throw new MiExcepcion("El valor de la base no puede ser negativo");
        }
        this.base = base;
        if(altura < 0){
            throw new MiExcepcion("El valor de la altura no puede ser negativo");
        }
        this.altura = altura;
        if(ejeX < 0){
            throw new MiExcepcion("El valor del eje x no puede ser negativo");
        }
        this.ejeX = ejeX;
        if(ejeY < 0){
            throw new MiExcepcion("El valor del eje y no puede ser negativo");
        }
        this.ejeY = ejeY;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base)throws MiExcepcion {
        if(base < 0){
            throw new MiExcepcion("El valor de la base no puede ser negativo");
        }
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws MiExcepcion {
        if(altura < 0){
            throw new MiExcepcion("El valor de la altura no puede ser negativo");
        }
        this.altura = altura;
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) throws MiExcepcion {
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
        return
                "El perímetro del rectangulo es: "+ this.calcularPerimetro() + "\n" +
                "La superficie del rectangulo es: " + this.calcularSuperficie();
    }
}
