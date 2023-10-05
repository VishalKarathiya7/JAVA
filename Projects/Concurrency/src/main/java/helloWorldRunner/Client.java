package helloWorldRunner;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();
        System.out.println("Hello World from Thread : " + Thread.currentThread().getName());
    }
}
