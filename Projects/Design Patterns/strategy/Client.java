package strategy;

public class Client {
    public static void main(String[] args) {
        int[] arr = {30,20,4,1,34,5,67,8};
        SorterContext sorterContext = new SorterContext(new BubbleSort());
        sorterContext.performSort(arr);
        sorterContext.setSortingStrategy(new QuickSort());
        sorterContext.performSort(arr);
    }
}
