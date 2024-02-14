import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first input: ");
        int input1 = keyboard.nextInt();
        System.out.print("Enter second input: ");
        int input2 = keyboard.nextInt();

        keyboard.nextLine(); // i think this is unnecessary, but this is the only way I can get nextLine to work

        System.out.print("Do you want to add or subtract?: ");
        String input3 = keyboard.nextLine();
        int answer = 0;
        if (input3.equals("add") || input3.equals("a")) {
            answer = input1 + input2;
        } else if (input3.equals("subtract") || input3.equals("s")) {
            answer = input1 - input2;
        }
        System.out.print("answer: " + answer);
        keyboard.close();
    }
}