import firstExercise.Circle;
import firstExercise.Figure;
import firstExercise.Parallelogram;
import firstExercise.Rectangle;
import secondExercise.Cat;
import thirdExercise.Manager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //zad1
        double radius = 3d;
        Figure circle = new Circle(radius);

        double baseSide = 10d;
        double side = 5d;
        double height = 8d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);

        double sideA = 15d;
        double sideB = 10;
        Figure rectangle = new Rectangle(sideA, sideB);

        List<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
        }

        //zad2
        Cat mruczek = new Cat("Mruczek");
        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();

        //zad3
        Manager manager = new Manager("Jan", "Kowalski", 1990, 2010, "PJATK", 2000, 100);
        System.out.println();
        System.out.println(manager);


    }
}
