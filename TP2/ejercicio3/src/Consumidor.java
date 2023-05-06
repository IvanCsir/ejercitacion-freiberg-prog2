public class Consumidor implements Runnable{
    private Almacenamiento almacenamiento;

    public Consumidor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void run() {
        for (int i = 0; i < 40; i++) {
            int nro = almacenamiento.retirar();
            long resultado = factorial(nro);
            System.out.println("Valor a calcular: " + nro + ". Resultado: " + resultado);
            try {
                Thread.sleep(3000);
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
