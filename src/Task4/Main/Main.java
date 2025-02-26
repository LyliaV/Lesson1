package Task4.Main;


import Task4.Rectangle.Rectangle;
import Task4.classCircle.Circle;

class Main {
    public static void main() {

        Circle Circle = new Circle();
        double ShapeCircle = Circle.shape( 3 );
        System.out.println("Площадь круга: " + ShapeCircle);

        Rectangle Rectangle = new Rectangle();
        double ShapeRectangle = Rectangle.shape( 2, 3 );
        System.out.println("Площадь прямоугольника: " + ShapeRectangle);

    }
}
