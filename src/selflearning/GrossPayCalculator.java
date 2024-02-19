package selflearning;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[] ) {

        // Take number of hours worked
        System.out.println("Enter number of hours worked :");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get Hourly Rate
        System.out.println("Enter hourly rate");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiple Hours and Rate
        double grossPay = hours * rate;
        System.out.println("Monthly pay is : $" + grossPay );

    }
}
