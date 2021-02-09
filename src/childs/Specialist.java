package childs;

import parent.Employee;

public class Specialist extends Employee {
    private int levels;

    public Specialist(String name, int age, double salary, int levels) {
        super(name, age, salary);
        this.levels = levels;
    }

    public Specialist() {

    }

    public void print() {
        super.print();

        System.out.println("The specialist level is " + this.getLevels());
    }

    @Override
    public void goToDayOff() {
        System.out.println("Specialist says 'I need day off, because I have to go to my village'");
    }

    public void workWithClients() {
        System.out.println("He is developing new product.");
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }
}
