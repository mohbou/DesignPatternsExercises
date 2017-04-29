package main.compositepattern.example1;

public class Main {
    public static void main(String[] args) {
        EmployeeComposite mark = new EmployeeComposite("Mark");
        EmployeeLeaf catherine = new EmployeeLeaf("Catherine");
        EmployeeLeaf david = new EmployeeLeaf("David");

        EmployeeComposite kathy = new EmployeeComposite("Kathy");
        EmployeeComposite mike = new EmployeeComposite("Mike");
        EmployeeLeaf gage = new EmployeeLeaf("Gage");
        EmployeeLeaf reg = new EmployeeLeaf("Reggie");

        EmployeeComposite lori = new EmployeeComposite("Lori");

        lori.addEmployee(mark);
        lori.addEmployee(kathy);

        mark.addEmployee(catherine);
        mark.addEmployee(david);

        kathy.addEmployee(mike);

        mike.addEmployee(reg);
        mike.addEmployee(gage);

        lori.printSupervisor(0);

    }
}
