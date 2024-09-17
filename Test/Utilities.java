import java.util.Scanner;

public class Utilities {
    public static int getIntegerNumber() throws Exception {
        int number = 0;
        String s;
        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();

        if (!s.matches("\\d{1,10}")) {
            throw new Exception("Data Invalid!");
        }
        else {
            number = Integer.parseInt(s);
        }


        return number;
    }
}
