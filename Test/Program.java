import java.util.Scanner;

public class Program {
    public static int InputNumber() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        number = Integer.parseInt(sc.nextLine());

        return number;
    }
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        System.out.println("Enter integer number, press 0 to stop");
        do {
            try {
                number = InputNumber();
                sum += number;
            } catch (Exception e) {
                System.out.println("Data invalid, pls try again!");
            }
        }
        while (number != 0);

        System.out.println("SUM = " + sum);
    }
}
