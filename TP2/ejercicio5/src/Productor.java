import java.util.concurrent.Callable;

public class Productor implements Callable<String> {
    private Almacenamiento almacenamiento;

    public Productor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String call() {
        int cantnumeros= 10;
        for (int i = 0; i < cantnumeros; i++) {
            almacenamiento.agregar((int) (Math.random() * (15 - 3 + 1) + 3));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "El hilo productor ha terminado y almacenó "+cantnumeros + "números";
    }
}
