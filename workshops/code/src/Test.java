import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        for (int  i = 1; i <= 10; i++) {
            char letter = (char) ('a' + i);
            arr.add(String.valueOf(letter));
        }

        arr.remove("a2");

        System.out.println(arr);

    }
}
