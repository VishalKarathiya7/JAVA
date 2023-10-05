package producerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Queue<Object> queue;
    Semaphore p;
    Semaphore c;

    Consumer(Queue queue, Semaphore p, Semaphore c){
        this.queue = queue;
        this.p = p;
        this.c = c;
    }

    @Override
    public void run() {
        while(true){
            try {
                c.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(queue.size() > 0){
                System.out.println("removing queue size: " + queue.size());
                queue.remove();
            }
            p.release();
        }
    }
}
