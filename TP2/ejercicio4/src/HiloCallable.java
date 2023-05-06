import java.util.concurrent.Callable;

public class HiloCallable implements Callable<Void> {
    protected String nombre;
    protected int iteraciones;
    protected int demora;

    public HiloCallable(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.demora = demora;
    }

    public Void call() {
        for(int i= 0; i<this.iteraciones; i++) {
            System.out.println("Este es el Hilo "+this.nombre + " y es la iteracion: " + i );
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

}