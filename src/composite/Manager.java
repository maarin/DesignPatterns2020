package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;
    List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void printData() {
        System.out.println("> Manager name: " + this.getName() + " with salary: " + this.getSalary());
        for (Employee employee: this.employees) {
            employee.printData();
        }
    }
}
