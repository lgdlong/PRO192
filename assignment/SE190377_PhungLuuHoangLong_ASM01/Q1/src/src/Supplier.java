public class Supplier {
    public static void main(String[] args) {
        Mian obj1 = new Mian(1, 2);
        String str = obj1.toString();
        int res1 = Mian.add(1, 2);
        int res2 = Mian.add(1, 2, 3);
        System.out.printf("%s - %d - %d", str, res1, res2);
    }

}

class Mian {
    private int a;
    private int b;
    
    public Mian() {

    }

    public Mian(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static  int add(int a, int b) {
        return a + b;
    }
    public static  int add(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mian[");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(']');
        return sb.toString().trim();
    }


}