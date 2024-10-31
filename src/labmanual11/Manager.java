package labmanual11;

public class Manager extends Employee{
    private int employeeCount;

    Manager(String name, double salary, int employeeCount){
        super(name, salary);
        this.employeeCount = employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    double calculateBonus(double bonus) {
        return super.calculateBonus(bonus) + (250*employeeCount);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Employee Count: "+employeeCount);
    }
}
