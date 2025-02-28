package Task6.classManager;

import Task6.classEmployee.Employee;

public class Manager extends Employee {

    int teamSize;

    public void getDetails(int teamSize) {
        this.teamSize = teamSize;

        System.out.println("Размер команды: " + this.teamSize);
    }
}
