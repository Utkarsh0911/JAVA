import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture1 {
    static void main() throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> 10);
        System.out.println(integerCompletableFuture.get());

        CompletableFuture<Void> helloWorld = CompletableFuture.runAsync(() -> System.out.println("hello world"));

        CompletableFuture.supplyAsync(() -> 10).thenApply(result -> result * 2).thenAccept(System.out::println);

        CompletableFuture.supplyAsync(() -> 10).thenAccept(System.out::println).thenRun(() -> System.out.println("Hi"));

        CompletableFuture<Integer> c1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> c2 = CompletableFuture.supplyAsync(() -> 20);
        c1.thenCombine(c2, (a, b) -> a + b).thenAccept(System.out::println);

    }
}
