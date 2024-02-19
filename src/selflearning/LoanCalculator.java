package selflearning;

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String args[]){

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("What is your salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How long have you working in this company?");
        int tenure = scanner.nextInt();
        scanner.close();

        if (salary >= requiredSalary){
            if (tenure >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for loan");
            }
            else {
                System.out.println("Sorry! you must have worked atleast 2 years");
            }
        }
        else {
            System.out.println("You must earn atleast "+ requiredSalary);
        }
    }
}
