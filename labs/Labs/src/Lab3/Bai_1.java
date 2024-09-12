package Lab3;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter n: ");
            n = sc.nextInt();
        } while (n > 100);

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) sum += i;
        }

        System.out.print(sum);
    }
}
