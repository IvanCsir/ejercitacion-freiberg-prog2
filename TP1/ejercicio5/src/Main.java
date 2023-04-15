import excepciones.MiExcepcion;
import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Rectangulo;
import interfaces.FiguraGeometrica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MiExcepcion {
        List listaFiguras = new ArrayList();
        try {
            Circulo circulo1 = new Circulo(5,2,2);
            circulo1.setEjeX(-2);
            listaFiguras.add(circulo1);

        } catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }
        try {
            Circulo circulo2 = new Circulo(-5,6,9);
            listaFiguras.add(circulo2);
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }

        try {
            Cuadrado cuadrado1 = new Cuadrado(-2,2,3);
            listaFiguras.add(cuadrado1);

        } catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }
        try {
            Cuadrado cuadrado2 = new Cuadrado(2,3,6);
            cuadrado2.setEjeY(-5);
            listaFiguras.add(cuadrado2);
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }

        try {
            Rectangulo rectangulo1 = new Rectangulo(-4,8);
            listaFiguras.add(rectangulo1);

        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }

        try {
            Rectangulo rectangulo2= new Rectangulo(9,6);
            rectangulo2.setAltura(-5);
            listaFiguras.add(rectangulo2);

        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }

        for(int i = 0;i < listaFiguras.size(); i++){
            System.out.println(listaFiguras.get(i).toString());
        }

    }
}