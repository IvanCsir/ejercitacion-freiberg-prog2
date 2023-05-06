import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            for(int i = 0; i < 10; i++) {
                HiloCallable hc = new HiloCallable("hilo: "+i,100,10);
                executorService.submit(hc);
            }
            executorService.shutdown();


    }
}