package helloWorld;

public class Client {

    public static void doSomething(){
        System.out.println("Hello World from Thread : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello World from Thread : " + Thread.currentThread().getName());
        doSomething();
    }
}
