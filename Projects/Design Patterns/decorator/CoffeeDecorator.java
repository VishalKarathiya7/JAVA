package decorator;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratorCoffee = coffee;
    }


    @Override
    public double cost() {
        return decoratorCoffee.cost();
    }

    @Override
    public String description() {
        return decoratorCoffee.description();
    }
}
