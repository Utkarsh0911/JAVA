import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework3 {

    static void main() {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2));
        for (int i = 0; i < 5; i++) {

            int taskId = i;

            threadPoolExecutor.execute(() -> {


                try {
                    Thread.sleep(10000);
                    System.out.println("Task " + taskId + " has been executed by thread: " + Thread.currentThread().getName());

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            });

        }


    }
}
