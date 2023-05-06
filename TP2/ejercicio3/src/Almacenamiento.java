import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Almacenamiento {
    private List<Integer> lista;
    private int capacidad;

    public Almacenamiento(){
        lista = new ArrayList<>();
        capacidad = 40;
    }

    public synchronized void agregar(int valor) {
        while (lista.size() == capacidad) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lista.add(valor);
        System.out.println("Productor agrega " + valor + " en la cola.");
        notifyAll();
    }

    public synchronized int retirar() {
        while (lista.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int valor = lista.remove(0);
        System.out.println("Consumidor retira " + valor + " de la cola y quedan "+ lista.size());
        notifyAll();
        return valor;
    }
}


