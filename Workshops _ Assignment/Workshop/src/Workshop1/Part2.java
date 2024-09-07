package Workshop1;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, res;
        char operator;

        System.out.print("Input number 1: ");
        num1 = sc.nextDouble();
        System.out.print("Input number 2: ");
        num2 = sc.nextDouble();
        System.out.print("Input the operator (+-*/): ");
        operator = sc.next().charAt(0);

        if (operator == '+')
            res = num1 + num2;
        else if (operator == '-')
            res = num1 - num2;
        else if (operator == '*')
            res = num1 * num2;
        else if (operator == '/')
            res = num1 / num2;
        else res = 0;

        System.out.println("The result of " + num1 + operator + num2 + "=" + res);
    }
}
