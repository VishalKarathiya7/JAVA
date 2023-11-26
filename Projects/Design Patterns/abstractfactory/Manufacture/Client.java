package abstractfactory.Manufacture;

public class Client {
    public static void main(String[] args) {
        VehicleFactory myVehicle = VehicleFactoryFactory.getAllVehicle(Company.TATA);
        myVehicle.makeBike().make();
        myVehicle.makeCar().make();
        myVehicle.makeCycle().make();
    }
}
