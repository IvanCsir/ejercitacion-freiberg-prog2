import java.util.Random;

public class Hilo2 implements Runnable{
    protected String nombre;
    protected int iteraciones;
    protected int demora;

    public Hilo2(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.demora = demora;
    }

    @Override
    public void run() {
        for(int i= 0; i<this.iteraciones; i++) {
            System.out.println("Este es el Hilo "+this.nombre + " y es la iteracion: " + i );
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
