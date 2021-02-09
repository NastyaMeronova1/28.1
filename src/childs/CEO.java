package childs;

public class CEO extends Manager {
    private boolean hasCompanyCar;

    public CEO(String fullName, int age, double salary, boolean hasCompanyCar) {
        super(fullName, age, salary, hasCompanyCar);
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO() {

    }

    public void print() {
        super.print();
        System.out.println("CEO has company car " + this.isHasCompanyCar());
    }

    public void goPublic() {
        System.out.println("CEO is working on IPO");
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }
}
