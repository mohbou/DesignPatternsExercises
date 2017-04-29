package main.compositepattern.example1;

public class EmployeeLeaf extends EmployeeComponent {


    public EmployeeLeaf(String name) {
        super(name);
    }

    @Override
    public void printSupervisor(int spacing) {
    super.printSupervisor(spacing);
    }
}
