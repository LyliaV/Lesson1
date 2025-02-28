package Task6.classEmployee;

public class Employee {

    String name;
    double salary;

    public void getDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;

        System.out.println("Работник: " + this.name);
        System.out.println("ЗП: " + this.salary);
    }
}
