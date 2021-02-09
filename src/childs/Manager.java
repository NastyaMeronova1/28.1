package childs;

import parent.Employee;

public class Manager extends Employee {
    private boolean hasStocks;

    public Manager(String fullName, int age, double salary, boolean hasStocks) {
        super(fullName, age, salary);
        this.hasStocks = hasStocks;
    }

    public Manager() {
    }

    public void print() {
        super.print();
        System.out.println("Managers has stock " + this.isHasStocks());

    }

    @Override
    public void goToDayOff() {
        System.out.println("Manager / CEO says 'I have a lot staff to do that's why i need to take day off'");
    }

    public void writeProcedures() {
        System.out.println("Managers are developing  new procedures for new project");
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
}
