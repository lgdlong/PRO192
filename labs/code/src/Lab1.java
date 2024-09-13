import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dai, rong, chuvi, dientich;

        System.out.print("Nhap chieu dai: ");
        dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextDouble();

        chuvi = (dai + rong) * 2;
        dientich = dai * rong;

        System.out.printf("Chu vi: %f\nDien tich : %f", chuvi, dientich);

        sc.close();
    }
}