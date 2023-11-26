package abstractfactory.cycle;

public class HyundaiCycle implements Cycle{
    @Override
    public void make() {
        System.out.println("Making Hyundai Cycle");
    }
}
