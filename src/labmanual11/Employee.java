package labmanual11;

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void displayInfo(){
        System.out.println("Name: "+name+"Salary: "+salary);
    }

    double calculateBonus(double bonus){
        return salary * bonus;
    }
}
