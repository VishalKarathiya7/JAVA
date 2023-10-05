package printNumbers;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        Number printer using 100 different threads.
//        for(int i=0;i<100;i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread t1 = new Thread(numberPrinter);
//            t1.start();
//        }
//        Using Executor to perform number printing task
//        Executor executor = Executors.newFixedThreadPool(5);
//        for(int i=0;i<100;i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            executor.execute(numberPrinter);
//        }
//        Using Executor service
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0;i<100;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }
        executorService.shutdown();

    }
}
