

import java.util.Scanner;


abstract class Shape {
    protected int dimension1;
    protected int dimension2;

   
    public abstract void printArea();
}


class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        this.dimension1 = length;
        this.dimension2 = width;
    }

       public void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Triangle extends Shape {
    public Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

        public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}


class Circle extends Shape {
    public Circle(int radius) {
        this.dimension1 = radius;
    }

   
    public void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: \n" + area);
	System.out.println("1BM23CS154 Kishore Chandra");
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter length of rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter width of rectangle: ");
        int width = scanner.nextInt();
        Shape rectangle = new Rectangle(length, width);
        rectangle.printArea();

        
        System.out.print("Enter base of triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = scanner.nextInt();
        Shape triangle = new Triangle(base, height);
        triangle.printArea();

        
        System.out.print("Enter radius of circle: ");
        int radius = scanner.nextInt();
        Shape circle = new Circle(radius);
        circle.printArea();

        scanner.close();
    }
}

