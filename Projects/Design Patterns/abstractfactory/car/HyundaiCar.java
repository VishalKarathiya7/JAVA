package abstractfactory.car;

public class HyundaiCar implements Car{

    @Override
    public void make() {
        System.out.println("Making Hyundai Car");
    }
}
