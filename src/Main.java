import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listOfNumbers = Arrays.asList(5, 56, 8, 91, 7);
        squareAndPrintTheNumbers(listOfNumbers);
    }

    public static void squareAndPrintTheNumbers(List<Integer> numbers) throws ExecutionException, InterruptedException {
        List<Integer> numbersSquared = new ArrayList<>();
        List<CompletableFuture<Integer>> completableFutureList = new ArrayList<>();

        for (int el : numbers) {
            CompletableFuture<Integer> numbersCompletableFuture = CompletableFuture.supplyAsync(() -> (int) Math.pow(el, 2));
            completableFutureList.add(numbersCompletableFuture);

        }
        for (CompletableFuture<Integer> future : completableFutureList) {
            numbersSquared.add(future.get());

        }
        System.out.println("Numbers squared : " + numbersSquared);
    }
}