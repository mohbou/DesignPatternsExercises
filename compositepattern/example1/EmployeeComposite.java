package main.compositepattern.example1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposite extends EmployeeComponent {

    private List<EmployeeComponent> employees;

    public EmployeeComposite(String name) {
        super(name);
        employees = new ArrayList<>();
    }

    public void addEmployee(EmployeeComponent employee) {
        employees.add(employee);
    }
    public void removeEmployee(EmployeeComponent employee) {
        employees.remove(employee);
    }

    @Override
    public void printSupervisor(int spacing) {
       super.printSupervisor(spacing);
        for(EmployeeComponent employee:employees)
            employee.printSupervisor(spacing+1);

    }
}
