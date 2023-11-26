package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name){
        this.name = name;
    }

    public void addSubordinate(Employee subordinate) {
        this.subordinates.add(subordinate);
    }

    @Override
    public void showDetail() {
        System.out.println("Manager " + this.name);
        System.out.println("Subordinate ");
        for(Employee subordinate: subordinates){
            subordinate.showDetail();
        }
    }
}
