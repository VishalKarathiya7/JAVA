package printNumbers;

public class NumberPrinter implements Runnable{
    private int num;
    public NumberPrinter(int n){
        this.num = n;
    }
    @Override
    public void run(){
        System.out.println("Num = " + num + " Printing from: " + Thread.currentThread().getName());
    }
}
