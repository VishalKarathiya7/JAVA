package composite;

public class IndividualContributor implements Employee{
    private String name;
    public IndividualContributor(String name){
        this.name = name;
    }
    @Override
    public void showDetail() {
        System.out.println("Individual Contributor " + name);
    }
}
