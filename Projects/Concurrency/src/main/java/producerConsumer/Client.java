package producerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> queue = new ConcurrentLinkedDeque();

        Semaphore p = new Semaphore(6);
        Semaphore c = new Semaphore(0);


        Producer p1 = new Producer(queue,p,c);
        Producer p2 = new Producer(queue,p,c);
        Producer p3 = new Producer(queue,p,c);
        Producer p4 = new Producer(queue,p,c);
        Producer p5 = new Producer(queue,p,c);
        Producer p6 = new Producer(queue,p,c);

        Consumer c1 = new Consumer(queue,p,c);
        Consumer c2 = new Consumer(queue,p,c);
        Consumer c3 = new Consumer(queue,p,c);
        Consumer c4 = new Consumer(queue,p,c);
        Consumer c5 = new Consumer(queue,p,c);
        Consumer c6 = new Consumer(queue,p,c);

        Thread pt1 = new Thread(p1);
        Thread pt2 = new Thread(p2);
        Thread pt3 = new Thread(p3);
        Thread pt4 = new Thread(p4);
        Thread pt5 = new Thread(p5);
        Thread pt6 = new Thread(p6);

        Thread ct1 = new Thread(c1);
        Thread ct2 = new Thread(c2);
        Thread ct3 = new Thread(c3);
        Thread ct4 = new Thread(c4);
        Thread ct5 = new Thread(c5);
        Thread ct6 = new Thread(c6);

        pt1.start();
        pt2.start();
        pt3.start();
        pt4.start();
        pt5.start();
        pt6.start();

        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        ct5.start();
        ct6.start();


    }





}
