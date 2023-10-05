package mergesort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Integer> listToSort = Arrays.asList(5,2,10,1,32,4,23,56,21);
        MergeSorter mergeSorter = new MergeSorter(listToSort,executorService);

        Future<List<Integer>> sortedArray = executorService.submit(mergeSorter);
        System.out.println(sortedArray.get());
        executorService.shutdown();
    }
}
