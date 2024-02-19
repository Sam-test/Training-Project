package selflearning;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]){

        System.out.println("Enter your grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Good job";
                break;
            case "C":
                message = "Work hard";
                break;
            case "D":
                message = "better luck next time";
                break;
            default:
                message = "Something went wrong";
                break;
        }
        System.out.println(message);
    }
}
