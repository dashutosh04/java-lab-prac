package lab_3.q2;

/*
 * Write a program in Java to create a class Rectangle having data members
length and breadth and three methods called read, calculate and display to read the values of
length and breadth, calculate the area and perimeter of the rectangle and display the result
respectively.
 */

import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextDouble();
        scanner.close();
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public void display() {
        double area = calculateArea();
        double perimeter = calculatePerimeter();

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

    }
}

public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.read();
        rectangle.display();
    }
}
