import java.util.Random;

public class Hilo1 extends Thread{
    protected String nombre;


    public Hilo1() {
    }

    public Hilo1(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random random = new Random();

        int nroRandom = random.nextInt(31)+10;

        int demora = random.nextInt(51)+999;
        for(int i= 0; i<nroRandom; i++) {
            System.out.println("Este es el Hilo "+this.nombre + " y es la iteracion: " + i );
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

