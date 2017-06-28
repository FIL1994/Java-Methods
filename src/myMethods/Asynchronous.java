/**
 * For more info:
 * http://www.baeldung.com/java-completablefuture
 */
package myMethods;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Philip
 */
public class Asynchronous {

    public Asynchronous() {
        try {
            String value;
            Future<String> future = calculateAsync();
            value = future.get();
            System.out.println(value);

            CompletableFuture<String> futureEncapsulate
                    = CompletableFuture.supplyAsync(() ->
                            "From futureEncapsulate");
            value = futureEncapsulate.get();
            System.out.println(value);
            
            Future<String> futureWithCancel = calculateAsyncWithCancellation();
            value = futureWithCancel.get();
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Exception from Asynchronous");
            System.out.println(e);
        }
    }

    public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture
                = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }

    public Future<String> calculateAsyncWithCancellation() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.cancel(false);
            return null;
        });

        return completableFuture;
    }
}
