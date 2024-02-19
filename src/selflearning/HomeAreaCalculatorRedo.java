package selflearning;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    public static void main(String args[]){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea (kitchen, bathroom);

        System.out.println("The total area is :"+area);


    }

    public Rectangle getRoom(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length");
        double length = scanner.nextDouble();

        System.out.println("Enter width");
        double width = scanner.nextDouble();

        scanner.close();

        return new Rectangle(length, width);

    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }


}
