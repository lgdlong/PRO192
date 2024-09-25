public class HinhTron extends HinhHoc {
    // Attributes
    private float banKinh;

    // Constructors
    public HinhTron() {
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    // Getters and Setters
    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public void tinhChuVi() {
        this.chuVi = (float) (2 * Math.PI * banKinh);
    }
    public void tinhDienTich() {
        this.dienTich = (float) (Math.PI * banKinh * banKinh);
    }
}
