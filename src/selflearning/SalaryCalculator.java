package selflearning;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main (String arg[]){

        // Initialize known value

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // Get value for unknown
        if (sales >= quota) {
           System.out.println("You did it!");
        }
        else {
            int salesshort = quota - sales;
            System.out.println("The Employee's pay is" + salesshort + "sales short");
        }

        }


        // Quick detour for bonus earners

        // Output
    }

