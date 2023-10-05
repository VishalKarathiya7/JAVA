package producerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Object> queue;
    Semaphore p;
    Semaphore c;

    Producer(Queue queue, Semaphore p, Semaphore c){
        this.queue = queue;
        this.p = p;
        this.c = c;
    }

    @Override
    public void run() {
        while(true){
            try {
                p.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("adding queue size: " + queue.size());
            queue.add(new Object());

            c.release();
        }
    }
}
