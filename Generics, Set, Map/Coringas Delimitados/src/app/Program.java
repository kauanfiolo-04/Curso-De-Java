package app;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);

        List<Shape> myShapes = new ArrayList<>();

        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();

        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + String.format("%.2f", totalArea(myCircles)));
    }

    public static double totalArea(List<? extends  Shape> list) {
        double sum = 0.0;

        for (Shape s: list) {
            sum += s.area();
        }

        return sum;
    }
}
