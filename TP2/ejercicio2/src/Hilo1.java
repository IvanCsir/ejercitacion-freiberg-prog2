import java.util.List;

public class Hilo1 extends Thread{
    private List<Integer> listanros;

    public Hilo1(List<Integer> listanros) {
        this.listanros = listanros;
    }

    @Override
    public void run(){

        String name = Thread.currentThread().getName();
        while (!listanros.isEmpty()) {
            int nro = listanros.remove(0);
            long resultado = factorial(nro);
            System.out.println("Hilo " + name + " procesando la lista. Valor a calcular: " + nro + ". Resultado: " + resultado + ". Quedan " + listanros.size() + " elementos en la lista por procesar.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

