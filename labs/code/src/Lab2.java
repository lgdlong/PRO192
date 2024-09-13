import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pack, distance, shift, feedBack, call, electric, other;
        System.out.print("Enter package number: ");
        pack = sc.nextDouble();
        System.out.print("Enter distance number: ");
        distance = sc.nextDouble();
        System.out.print("Enter shift night number: ");
        shift = sc.nextDouble();
        System.out.print("Enter feedback grade: ");
        feedBack = sc.nextDouble();
        System.out.print("Enter the call amount: ");
        call = sc.nextDouble();
        System.out.print("Enter the electric payment: ");
        electric = sc.nextDouble();
        System.out.print("Enter the other payment: ");
        other = sc.nextDouble();

        double salary = pack * 50 + distance * 75 + shift * 50 * 0.1 + feedBack + call + electric + other;

        System.out.print("The salary is " + salary);
    }
}