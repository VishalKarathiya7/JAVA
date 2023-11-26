package decorator;

public class Client {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee " + simpleCoffee.cost() + simpleCoffee.description());

        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("Simple Coffee " + coffeeWithMilk.cost() + coffeeWithMilk.description());

        Coffee coffeeWithSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println("Simple Coffee " + coffeeWithSugar.cost() + coffeeWithSugar.description());
    }
}
