import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "long    phung-long  -long";
        String[] names = str.split("\\s+");

        for (String name : names) {
            System.out.println(name);
        }

        str.trim();

    }
}

