package abstractfactory.bike;

public class HyundaiBike implements Bike{

    @Override
    public void make() {
        System.out.println("Making Hyundai Bike");
    }
}
