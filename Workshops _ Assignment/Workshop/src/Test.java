import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] arr = new int[2][];

        int[]c = new int[] {1, 2, 3};
        int[]d = c.clone();

        arr[0] = new int[] {1, 2, 3, 4, 5};
        arr[1] = new int[] {6, 7, 8, 9 ,0};

        int[][] b = arr.clone();

        arr[0][2] = 100;


        System.out.println("a = " + Arrays.toString(arr[0]));
        System.out.println("b = " + Arrays.toString(b[0]));


        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(b[0]));

        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}

