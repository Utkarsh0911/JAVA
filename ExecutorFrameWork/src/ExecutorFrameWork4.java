import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameWork4 {

    static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.schedule(() -> {

            System.out.println("Scheduled Thread Pool Executor");
            System.out.println("-----Ended-----");

        }, 3, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(() -> {


            System.out.println("Scheduled Thread Pool Executor at Fixed Rate");

        }, 0, 3, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
            scheduledExecutorService.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
