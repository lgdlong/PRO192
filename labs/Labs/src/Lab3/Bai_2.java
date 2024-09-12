package Lab3;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayNumber;

        do {
            System.out.print("Enter day in number: ");
            dayNumber = sc.nextInt();
        }
        while (1 > dayNumber || dayNumber > 7);

        String day = switch (dayNumber) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "";
        };
        System.out.print(day);
    }
}
