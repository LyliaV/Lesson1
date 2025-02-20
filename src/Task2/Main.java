// Интерфейс 1
interface PrintText {
    void print();
};

// Интерфейс 2
interface FillData {
    void fillData();
};

// Класс 1
class Person implements PrintText, FillData {

    String name;

    @Override
    public void fillData() {
        name = "Гарри Поттер";
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}

class Person2 implements PrintText, FillData {

    String name;

    @Override
    public void fillData() {
        name = "Гарри Поттер";
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}

// Класс 2
class Magic extends Person {
    String magic;

    public void printAll() {
        fillData();
        int i = 5;
        Integer a = i;
        print();
        magic = "Маг";
        System.out.println( getName() + "-" + magic );
    }
};

class Main {
    public static void main(String[] args) {
        Magic Magic = new Magic();
        Magic.printAll();
    }
}