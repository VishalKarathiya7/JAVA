package abstractfactory.Manufacture;

public class VehicleFactoryFactory {
    public static VehicleFactory getAllVehicle(Company company){
        if(company == Company.HYUNDAI){
            return new HyundaiVehicleFactory();
        }else if (company == Company.MARUTI){
            return  new MarutiVehicleFactory();
        }else if(company == Company.TATA){
            return new TataVehicleFactory();
        }
        return null;
    }
}
