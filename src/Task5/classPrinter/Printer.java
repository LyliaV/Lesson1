package Task5.classPrinter;

public class Printer {

    static void print(int i, int j) {
        System.out.println("Я вывожу int: " + i + ", " + j);
    }

    static void print(double i, double j) {
        System.out.println("Я вывожу double: " + i + ", " + j);
    }

    static void print(String i, String j) {
        System.out.println("Я вывожу String: " + i + ", " + j);
    }

    static void print(int i, double j, String k) {
        System.out.println("А я все сразу: " + i + ", " + j + ", " + k);
    }

    static void main(String[] args) {
        print(1, 2);

        print(1.568, 2.987);

        print("Счастья", "Здоровья");

        print(1, 2.659, "Спасибо");
    }
}
