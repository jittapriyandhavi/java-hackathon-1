import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: - Calculator.java:7");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, , *, /): - Calculator.java:10");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: - Calculator.java:13");
        double b = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Result = - Calculator.java:18" + (a + b));
                break;

            case '-':
                System.out.println("Result = - Calculator.java:22" + (a - b));
                break;

            case '*':
                System.out.println("Result = - Calculator.java:26" + (a * b));
                break;

            case '/':
                System.out.println("Result = - Calculator.java:30" + (a / b));
                break;

            default:
                System.out.println("Invalid operator - Calculator.java:34");
        }
    }
}