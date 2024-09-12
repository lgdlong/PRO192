package Workshop2;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        int n;
        boolean check = false;
        do {
            try {
                n = input();
                if (n < 1) {
                    throw new Exception();
                }
                System.out.println("Number is " + n);
            }
            catch (Exception e) {
                System.out.println("The number is invalid!");
                check = true;
            }
        } while (check);
    }
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        return sc.nextInt();
    }

}
