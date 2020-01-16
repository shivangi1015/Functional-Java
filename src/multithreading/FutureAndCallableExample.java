package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallableExample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> "Hello from callable";
        Future<String> submit = executorService.submit(callable);
//        submit.cancel();
        executorService.shutdown();
    }
}
