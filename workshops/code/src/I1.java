public class I1 {
    public static void main(String[] args) {
        String str = "ABCCDEBABFFBACBEBDFAAAABCDEEDCCBFEBFCAE";
        int length = str.length();

        int a = 0, b = 0, c= 0, d= 0, e= 0;

        for (char i : str.toCharArray()) {
            switch (i){
                case 'A':
                    a++;
                    break;
                case 'B':
                    b++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'E':
                    e++;
                    break;
            }
        }

        System.out.println(length);
        System.out.printf("%d %d %d %d %d", a, b, c, d, e);

    }
}