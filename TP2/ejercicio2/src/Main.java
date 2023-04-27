import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            lista.add((int) (Math.random() * (15 - 3 + 1) + 3));
        }

        Hilo1 h1 = new Hilo1(lista);
        h1.setName("Hilo 1");
        h1.start();

        Hilo1 thread2 = new Hilo1(lista);
        thread2.setName("Hilo 2");
        thread2.start();

        Hilo1 h3 = new Hilo1(lista);
        h3.setName("Hilo 3");
        h3.start();
    }
}