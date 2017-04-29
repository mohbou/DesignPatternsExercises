package main.compositepattern.example1;

public abstract class EmployeeComponent {

    private String name;

    public EmployeeComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void printSupervisor(int spacing) {

        for (int i = 0; i < spacing; i++) {

            System.out.print(" ");
        }
        System.out.println(getName());
    }
}
