package labmanual11;

public class Demo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John", 3000);
        employees[1] = new Manager("Bob", 5000, 20);
        employees[2] = new ContentWriter("Susan", 4000, 30);

        for (int i=0; i< employees.length; i++){
            employees[i].displayInfo();
        }
    }
}
