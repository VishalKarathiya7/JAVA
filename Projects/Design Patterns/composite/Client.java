package composite;

public class Client {
    public static void main(String[] args) {
        IndividualContributor I1 = new IndividualContributor("Vishal");
        IndividualContributor I2 = new IndividualContributor("Ajad");

        Manager M1 = new Manager("Arvind");
        M1.addSubordinate(I1);
        M1.addSubordinate(I2);

        Manager M2 = new Manager("Pawan");
        IndividualContributor I3 = new IndividualContributor("Bhanu");
        M2.addSubordinate(I3);

        Manager cto = new Manager("Gopi");
        cto.addSubordinate(M1);
        cto.addSubordinate(M2);

        cto.showDetail();
    }
}
