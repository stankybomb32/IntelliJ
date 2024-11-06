package question1;

public class BMI
{
    private String name;
    private int age;
    private double weight;
    private double height;
    private double bmi;

    BMI(String name, int age, double weight, double feet, double inches)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = feet * 12 + inches;
        this.bmi = calculateBMI();

    }

    private double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age" + age);
        System.out.println("Weight: " + weight + "pounds");
        System.out.println("Height: " + height + "inches");
        System.out.println("BMI: " + bmi);
    }
}
