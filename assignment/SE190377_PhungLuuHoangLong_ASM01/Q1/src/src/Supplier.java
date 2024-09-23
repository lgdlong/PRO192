public class Supplier {
    // Attributes
    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    // Constructors
    public Supplier() {
        this.id = 0;
        this.name = "No Name";
        this.address = "";
        this.phone = "000.000.0000";
        this.status = false;
    }

    public Supplier(int id, String name, String address, String phone) {
        this.id = id;
        
        if (isValidName(name)) {
            this.name = titleCaseString(name);
            this.status = true;
        } else {
            this.name = "No Name";
            this.status = false;
        }

        this.address = titleCaseString(address);
        this.phone = isValidPhone(phone) ? phone : "000.000.0000";
    }


    // Check Valid
    public boolean isValidName(String name) {
        return !name.isEmpty() && name.length() >= 5 && name.length() <= 50;
    }

    
    public boolean isValidPhone(String phone) {
        return !phone.isEmpty() && 
                phone.matches("0[0-9]{8,9}");
    }
    
    public String titleCaseString(String name) {
        String[] words = name.split("\\s+"); // Chuyen chuoi thanh tung word dua vao array
        StringBuilder titleCase = new StringBuilder();
        
        for (String word : words) {
            if (!word.isBlank()) {
                titleCase.append(Character.toUpperCase(word.charAt(0))) // Viet hoa chu dau
                         .append(word.substring(1).toLowerCase()) // Viet thuong chuoi con lai
                         .append(" ");
            }
        }
        
        return titleCase.toString().trim(); // Xoa khoang trang con du
    }
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = !isValidName(name) ? "No Name" : titleCaseString(name);
        this.status = isValidName(name);
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
        this.phone = isValidPhone(phone) ? phone : "000.000.0000";
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