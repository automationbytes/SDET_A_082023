package Day4;


import java.util.ArrayList;
import java.util.List;

class Employee{
    private String name;
    private String title;
    private List<Employee> reporting;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
        reporting = new ArrayList<>();
    }
    public void add(Employee e){
        reporting.add(e);
    }

    public void remove(Employee e){
        reporting.remove(e);
    }

    public List<Employee> getReporting(){
        return reporting;
    }

    public String toString(){
        return "Employee : -> Name :"+name +" title: "+title+ reporting ;
    }

}
public class CompositeDesignPattern {
    public static void main(String[] args) {

        Employee devmanager = new Employee("John","Dev Manager");
        Employee testmanager = new Employee("Kalpana","Test Manager");

        Employee developer = new Employee("Alice","Developer");
        Employee tester = new Employee("Vignesh","Tester");

        devmanager.add(developer);
        testmanager.add(tester);

        System.out.println(devmanager);


    }
}
