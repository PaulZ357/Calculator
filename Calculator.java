import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first input: ");
        double input1 = keyboard.nextDouble();
        System.out.print("Enter second input: ");
        double input2 = keyboard.nextDouble();

        keyboard.nextLine(); // i think this is unnecessary, but this is the only way I can get nextLine to work

        System.out.print("Do you want to add, subtract, multiply, or divide? ");
        String input3 = keyboard.nextLine();
        double answer = 0;
        if (input3.equals("add") || input3.equals("a")) {
            // addition
            answer = input1 + input2;
            System.out.println("answer: " + answer);
        } else if (input3.equals("subtract") || input3.equals("s")) {
            // subtraction
            answer = input1 - input2;
            System.out.println("answer: " + answer);
        } else if (input3.equals("multiply") || input3.equals("m")) {
            // multiplication
            answer = input1 * input2;
            System.out.println("answer: " + answer);
        } else if (input3.equals("divide") || input3.equals("d")) {
            // division
            if (input2 == 0)
                // prints out error message
                System.out.println("Error: Divide by Zero");
            else {
                answer = input1 / input2;
                System.out.println("answer: " + answer);
            }
        }
        keyboard.close();
    }
}