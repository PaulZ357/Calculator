import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first input: ");
        int input1 = keyboard.nextInt();
        System.out.print("Enter second input: ");
        int input2 = keyboard.nextInt();
        int answer = input1 + input2;
        System.out.print("answer: " + answer);
        keyboard.close();
    }
}