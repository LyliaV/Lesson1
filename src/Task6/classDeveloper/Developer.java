package Task6.classDeveloper;

import Task6.classEmployee.Employee;

public class Developer extends Employee {

    public String programmingLanguage;

    public void getDetails(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;

        System.out.println("Язык программирования: " + this.programmingLanguage);
    }
}
