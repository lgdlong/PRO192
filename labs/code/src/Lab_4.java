import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program");

        double first, second, result = 0;
        String operator = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        first = sc.nextDouble();
        System.out.print("Enter the second number: ");
        second = sc.nextDouble();

        System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div\n5. exit");

        System.out.print("Enter your choice: ");

        int choice;

        do {
            System.out.println("Enter your choice again (1 -> 5)");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 5);




        switch (choice) {
            case 1:
                result = first + second;
                operator = "+";
                break;
            case 2:
                result = first - second;
                operator = "-";
                break;
            case 3:
                result = first * second;
                operator = "*";
                break;
            case 4:
                result = first / second;
                operator = "/";
                break;
            case 5:
                break;
        }

        System.out.printf("%f %s %f = %f", first, operator, second, result);

    }
}
