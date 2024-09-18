package lt.techin.shapes;

import java.util.Scanner;

public class MainProgram  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Circle c = new Circle();
        System.out.println("Circle information: ");
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.isFilled());
        System.out.println(c.toString());


        Rectangle rec = new Rectangle();
        System.out.println("Rectangle information: ");
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.getLength());
        System.out.println(rec.getWidth());
        System.out.println(rec.isFilled());
        System.out.println(rec.toString());




    }
}
