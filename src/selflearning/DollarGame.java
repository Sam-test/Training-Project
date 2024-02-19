package selflearning;

import java.util.Scanner;

public class DollarGame {

    public static void main(String args[]){

    // Take user input
    System.out.println("Enter how many pennies:");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

    System.out.println("Enter how many nickles:");
        int nickles = scanner.nextInt();

    System.out.println("Enter how may dimes");
        int dimes = scanner.nextInt();

    System.out.println("Enter how many quarters");
        int quarters = scanner.nextInt();
        scanner.close();

    int value;
    value = pennies + nickles + dimes + quarters;

    if (value == 100){
        System.out.println("You win!");
    }
    else if (value < 100) {
        int dollar = 100 - value;
        System.out.println("You are " +dollar +"under");
    }
    else{
        int greater = value - 100;
        System.out.println("you are " +greater + " greater than a dollar");
    }


    }
}
