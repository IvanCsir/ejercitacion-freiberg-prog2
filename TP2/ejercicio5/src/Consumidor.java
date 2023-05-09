import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Consumidor implements Callable<String> {
    private Almacenamiento almacenamiento;

    public Consumidor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String call() {
        int cantnumeros = 10;
        for (int i = 0; i < cantnumeros; i++) {
            int nro = almacenamiento.retirar();
            long resultado = factorial(nro);
            System.out.println("Valor a calcular: " + nro + ". Resultado: " + resultado);
            if (resultado>3000000){
                System.out.println("EL VALOR ES MAS GRANDE QUE 30.000.000");
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "El hilo consumidor ha terminado y extrajo "+cantnumeros + "números";

    }
    private long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
