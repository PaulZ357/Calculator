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
        boolean divide = false;
        try {
            if (input3.equals("add") || input3.equals("a")) {
                answer = input1 + input2;
            } else if (input3.equals("subtract") || input3.equals("s")) {
                answer = input1 - input2;
            } else if (input3.equals("multiply") || input3.equals("m")) {
                answer = input1 * input2;
            } else if (input3.equals("divide") || input3.equals("d")) {
                divide = true;
                answer = input1 / input2;
            }
            System.out.println("answer: " + answer);
        } catch (ArithmeticException e) {
            if (divide) {
                System.out.println("Cannot divide by 0");
            } else {
                e.printStackTrace();
            }
        }
        keyboard.close();
    }
}