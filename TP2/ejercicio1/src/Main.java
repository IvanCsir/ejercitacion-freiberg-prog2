public class Main {
    public static void main(String[] args) {
        Hilo1 h1 = new Hilo1("Hilo Thread 1");
        h1.start();

        Hilo1 h2 = new Hilo1("Hilo Thread 2");
        h2.start();

        Hilo1 h3 = new Hilo1("Hilo Thread 3");
        h3.start();

        Hilo1 h4 = new Hilo1("Hilo Thread 4");
        h4.start();

        Hilo2 h1_implements = new Hilo2("Hilo runnable",14,200);
        Thread h1_r = new Thread(h1_implements);
        h1_r.start();

        Hilo2 h2_implements = new Hilo2("Hilo runnable 1",10,300);
        Thread h2_r = new Thread(h2_implements);
        h2_r.start();

        Hilo2 h3_implements = new Hilo2("Hilo runnable 2",10,50);
        Thread h3_r = new Thread(h3_implements);
        h3_r.start();

        Hilo2 h4_implements = new Hilo2("Hilo runnable 3",20,600);
        Thread h4_r = new Thread(h4_implements);
        h4_r.start();

    }}