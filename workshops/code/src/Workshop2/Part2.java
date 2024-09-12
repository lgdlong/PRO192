package Workshop2;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        String str = inputValidString();
        System.out.println("The string is: " + str);
    }

    public static String inputValidString() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        boolean isValid;

        do {
            System.out.print("Enter string: ");

            try {
                str = sc.next();

                if (!str.matches("SE\\d{3}")) {
                    throw new IllegalArgumentException("The string is invalid!\nMust be SExxx (x is numbers)\nPls enter again!");
                }

                isValid = true;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);

        return str;
    }
}
