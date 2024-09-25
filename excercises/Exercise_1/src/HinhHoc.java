public class HinhHoc {
    // Attributes
    protected float chuVi;
    protected float dienTich;

    // Getters and Setters
    public float getChuVi() {
        return chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return String.format("Chu vi: %f\nDien tich: %f", chuVi, dienTich);
    }
}
