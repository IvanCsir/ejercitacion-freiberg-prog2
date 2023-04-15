import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Rectangulo;
import interfaces.FiguraGeometrica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List listaFiguras = new ArrayList();

        Circulo cirulo1 = new Circulo(3);
        Cuadrado cuadrado1 = new Cuadrado(5);
        Rectangulo rectangulo1 = new Rectangulo(3,6);

        listaFiguras.add(cirulo1);
        listaFiguras.add(cuadrado1);
        listaFiguras.add(rectangulo1);

        for(int i = 0;i < listaFiguras.size(); i++){
            System.out.println(listaFiguras.get(i).toString());
        }

    }
}