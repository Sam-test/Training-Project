package selflearning;

import java.util.Scanner;

public class TestResults {

    public static void main(String args[]){

        //Get test score
        System.out.println("Enter Test Score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        // Determine letter grade
        String grade;

        if (score < 60){
            grade = "F";
        }
        else if (score <70){
            grade = "D";
        }
        else if (score < 80){
            grade = "B";
        } else if (score < 90) {
            grade = "A";

        }
        else {
            grade = "A+";
        }
        System.out.println("Your Grade is " + grade);

    }
}
