package Task6;

import Task6.classDeveloper.Developer;
import Task6.classManager.Manager;

public class Main {

    static void main() {

        Manager Manager = new Manager();
        Manager.getDetails("Игорь Николаев", 587544.45);

        Manager.getDetails(12 );

        Developer Developer = new Developer();
        Developer.getDetails("ABAP");

    }
}
