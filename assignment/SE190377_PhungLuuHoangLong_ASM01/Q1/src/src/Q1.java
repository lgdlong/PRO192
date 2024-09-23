final class Supplier {
    // Attributes
    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    // Check Valid
    public boolean isValidName(String name) {
        if (!name.isEmpty() && 5 <= name.length() && name.length() <= 50) {
            this.status = true;
            return true;
        }
        this.status = false;
        return false;
    }
    
    public boolean isValidPhone(String phone) {
        if (!phone.isEmpty() && 
            phone.charAt(0) == '0' && 
            9 <= phone.length() && phone.length() <= 10) {
            return true;
        }
        return false;
    }
    
    public String titleCaseString(String name) {
        String[] nameArray = name.split("\\s+"); // Chuyen chuoi thanh tung word dua vao array
        StringBuilder titleCase = new StringBuilder();
        
        for (String word : nameArray) {
            if (!word.isBlank()) {
                titleCase
                .append(Character.toUpperCase(word.charAt(0))) // Viet hoa chu dau
                .append(word.substring(1).toLowerCase()) // Viet thuong chuoi con lai
                .append(" ");
            }
        }
        
        return titleCase.toString().trim(); // Xoa khoang trang con du
    }
    
    public Supplier() {
        
    }

    public Supplier(int id, String name, String address, String phone) {
        this.id = id;
        this.name = !isValidName(name) ? "No Name" : titleCaseString(name);
        this.address = titleCaseString(address);
        this.phone = !isValidPhone(phone) ? "000.000.0000" : phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = !isValidName(name) ? "No Name" : titleCaseString(name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = titleCaseString(address);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = !isValidPhone(phone) ? "000.000.0000" : phone;
    }

    public boolean getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%s", 
            id, name, address, phone, status ? "Available" : "Unavailable");
    }
 
}

public class Q1 {
    public static void main(String[] args) {
        
    }
    
}


