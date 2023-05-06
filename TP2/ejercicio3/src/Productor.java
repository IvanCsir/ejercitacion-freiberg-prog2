public class Productor implements Runnable{
    private Almacenamiento almacenamiento;

    public Productor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void run() {
        for (int i = 0; i < 40; i++) {
            almacenamiento.agregar((int) (Math.random() * (15 - 3 + 1) + 3));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

