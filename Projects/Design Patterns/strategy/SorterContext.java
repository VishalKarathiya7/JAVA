package strategy;

class SorterContext {
    private SortingStrategy sortingStrategy;

    public SorterContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array){
        sortingStrategy.sort(array);
    }
}
