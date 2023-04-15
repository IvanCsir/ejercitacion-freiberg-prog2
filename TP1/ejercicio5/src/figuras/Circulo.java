package figuras;
import excepciones.MiExcepcion;
import interfaces.FiguraGeometrica;

import java.sql.SQLOutput;

public class Circulo implements FiguraGeometrica {
    private int radio;
    private int ejeX;
    private int ejeY;

    public Circulo(int radio, int ejeX, int ejeY) throws MiExcepcion {
        super();
        System.out.println("Círculo:");
        if(radio < 0){
            throw new MiExcepcion("El valor del radio no puede ser negativo");
        }
        this.radio = radio;
        if(ejeX < 0){
            throw new MiExcepcion("El valor del eje x no puede ser negativo");
        }
        this.ejeX = ejeX;
        if(ejeY < 0){
            throw new MiExcepcion("El valor del eje x no puede ser negativo");
        }
        this.ejeY = ejeY;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) throws MiExcepcion {
        if(radio < 0){
            throw new MiExcepcion("El valor del radio no puede ser negativo");
        }
        this.radio = radio;
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
        return
                "El perímetro del circulo es: "+ this.calcularPerimetro() + "\n" +
                "La superficie del circulo es: " + this.calcularSuperficie();
    }
}
