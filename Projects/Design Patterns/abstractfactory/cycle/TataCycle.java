package abstractfactory.cycle;

public class TataCycle implements Cycle{
    @Override
    public void make() {
        System.out.println("Making Tata Cycle");
    }
}
