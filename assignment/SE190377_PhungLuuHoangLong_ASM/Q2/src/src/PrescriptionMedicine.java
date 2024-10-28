public class PrescriptionMedicine extends Medicine{
    private String doctorName;

    public PrescriptionMedicine() {
    }

    public PrescriptionMedicine(String name, String indication, int expirationYear, String doctorName) {
        super(name, indication, expirationYear);
        this.doctorName = doctorName;
    }
    

    public String getDoctorName() {
        StringBuilder str = new StringBuilder();
        
        str.append(Character.toUpperCase(doctorName.charAt(0)))
           .append(doctorName.substring(1).toLowerCase());
        
        return str.toString().trim();
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String isExpired(int currentYear) {
        return (currentYear > getExpirationYear()) ? "Expried" : "Valid";
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), getDoctorName());
    }
    
    

    
    
    
}
