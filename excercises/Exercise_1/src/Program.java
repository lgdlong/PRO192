public class Program {
    public static void main(String[] args) {
        // Test HinhChuNhat
        HinhChuNhat hcn = new HinhChuNhat(5, 3);
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        System.out.println("Thông tin hình chữ nhật:");
        System.out.println(hcn);

        // Test HinhTron
        HinhTron ht = new HinhTron(4);
        ht.tinhChuVi();
        ht.tinhDienTich();
        System.out.println("\nThông tin hình tròn:");
        System.out.println(ht);
    }
}
