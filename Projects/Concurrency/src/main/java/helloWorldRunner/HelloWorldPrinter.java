package helloWorldRunner;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World printing from : " + Thread.currentThread().getName());
    }
}
