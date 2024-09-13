package Lab3;

import java.util.Collections;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, min, max;

        x = sc.nextInt();
        y = sc.nextInt();

        min = Math.min(x, y);
        max = Math.max(x, y);


        int count = 0, sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                count ++;
                sum += i;
            }
        }

        System.out.printf("Number of odds: %d\nSUM = %d", count, sum);
    }
}
