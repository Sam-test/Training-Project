package selflearning;

import java.util.Scanner;

public class ChapTwoExercise {

    public static void main(String arg[]) {

// season of year
        System.out.println("Enter Season of year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Take whole number
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        // Enter an adjective
        System.out.println("Enter an Adjective:");
        String adj = scanner.next();
        scanner.close();

        // Print
        System.out.println("On a " +adj + season+ "day, I drink a minimum of "+ number + "cups of coffee");


    }
}
