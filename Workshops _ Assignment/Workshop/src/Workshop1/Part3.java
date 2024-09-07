package Workshop1;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentList = sc.nextLine();
        String result = capitalizeNames(studentList);
        System.out.println(result);
    }
    public static String capitalizeNames(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] names = input.split("\\s+"); // Split by any whitespace
        StringBuilder result = new StringBuilder(input.length());

        for (String name : names) {
            if (!name.isEmpty()) {
                // Capitalize the first character and append the rest
                result.append(Character.toUpperCase(name.charAt(0)))
                        .append(name.substring(1).toLowerCase())
                        .append(" "); // Add a space after each name
            }
        }

        // Trim the trailing space and return the result
        return result.toString().trim();
    }

}
