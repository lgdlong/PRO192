public class HinhChuNhat extends HinhHoc {
    private float chieuDai;
    private float chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void tinhChuVi() {
        this.chuVi = 2 * (chieuDai + chieuRong);
    }

    public void tinhDienTich() {
        this.dienTich = chieuDai * chieuRong;
    }
}
