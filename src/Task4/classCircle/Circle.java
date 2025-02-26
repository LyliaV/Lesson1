package Task4.classCircle;

import Task4.classShape.Shape;
import java.lang.Math;

public class Circle extends Shape {

    @Override
    public double shape(int R) {
        return Math.PI * Math.pow(R, 2);
    }
}
