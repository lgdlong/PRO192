public class test {
    public static void main(String[] args) {
        String str = "b1 ads23 hg1j2 g1i2u  31i123 12i3 1i23iu4l5j 43 l5l43";
        System.out.println(avgOfEvenDigits(str));
    }
    public static double avgOfEvenDigits(String str) {
        int count = 0;
        int sum = 0;
        char[] ch = str.toCharArray();
        for (char i : ch) {
            if (Character.isDigit(i) && Integer.parseInt(String.valueOf(i)) % 2 == 0) {
                count++;
                sum += i;
            }
        }
        return (double) sum / count;
    }
}
// return the avg value of even digits in the string