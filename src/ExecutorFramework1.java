import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework1 {
    static void main() {

        ExecutorService executorService = Executors.newFixedThreadPool(2);


        for (int i = 0; i < 5; i++) {

            int taskId = i;
            executorService.execute(() -> {
                System.out.println("Task %d is executed by the thread %s".formatted(taskId, Thread.currentThread().getName()));

            });


        }

        executorService.shutdown();

    }
}
