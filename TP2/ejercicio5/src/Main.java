import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }

    /*public void arranque() {
        // Creamos una instancia del almacenamiento compartido
        Almacenamiento almacenamiento = new Almacenamiento();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Productor productor = new Productor(almacenamiento);
        Future<String> resultado = executorService.submit(productor);

        Consumidor consumidor = new Consumidor(almacenamiento);
        Future<String> resultado2 = executorService.submit(consumidor);
        *//*boolean continuar;
        continuar = false;*//*

        while (resultado.isDone()) {
            try {
                System.out.println("Resultado de la ejecución: "+resultado.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

        }


        System.out.println(resultado2);
        executorService.shutdown();


    }*/
    public void arranque() {
        // Creamos una instancia del almacenamiento compartido
        Almacenamiento almacenamiento = new Almacenamiento();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Productor productor = new Productor(almacenamiento);
        Future<String> resultadoProductor = executorService.submit(productor);

        Consumidor consumidor = new Consumidor(almacenamiento);
        Future<String> resultadoConsumidor = executorService.submit(consumidor);

        while (!resultadoConsumidor.isDone() && !resultadoProductor.isDone()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            System.out.println("Resultado de la ejecución: " + resultadoConsumidor.get());
            System.out.println("Resultado de la ejecución: " + resultadoProductor.get());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }


}