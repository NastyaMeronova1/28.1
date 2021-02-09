package parent;

public abstract class Employee {
    private String fullName;
    private int age;
    private double salary;

    public Employee(String fullName, int age, double salary) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {

    }

    public void print() {
        System.out.println("Ful name " + this.fullName + " Age " + this.age + " Salary " + this.salary);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void goToDayOff();

}
