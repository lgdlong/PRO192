public class Vendor {
    private int id;
    private String name;
    private String address;
    private String phone;
    private double sale;
    
    private final String PHONE_REGEX_START_WITH_0 = "^0\\d{8,9}$";
    private final String PHONE_REGEX_HAS_0XX = "^\\(0\\d{2}\\)\\d{8}$"; // format: (0XX)XXXXXXXX


    public Vendor() {
        this.id = 0;
        this.name = "";
        this.address = "";
        this.phone = "";
        this.sale = 0;
    }

    public Vendor(int id, String name, String address, String phone, double sale) {
        this.id = id;
        setName(name);
        setAddress(address);
        setPhone(phone);
        setSale(sale);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return titleCase(name);
    }

    public void setName(String name) {
        this.name = isStringValid(name) ? name.trim() : "No Name";
    }

    public String getAddress() {
        return titleCase(address);
    }

    public void setAddress(String address) {
        this.address = isStringValid(address) ? address.trim() : "No Address";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = isPhoneValid(phone) ? phone.trim() : "No Phone";
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = isSaleValid(sale) ? sale : 100;
    }
    
    public boolean isStringValid(String input) {
        return !input.isEmpty() && !input.isBlank();
    }
    
    public boolean isPhoneValid(String phone) {
        return phone.matches(PHONE_REGEX_START_WITH_0) || phone.matches(PHONE_REGEX_HAS_0XX);
    }
    
    public boolean isSaleValid(double sale) {
        return 100 <= sale && sale <= 5000000;
    }

    
    /**
     * Converts a string to "Title Case".
     *
     * @param value The input string to be converted.
     * @return The string converted to "Title Case". Returns an empty string if input is null or empty.
     */
    public static String titleCase(String value) {
        if (value == null || value.isEmpty()) {
            return ""; // Return an empty string if null or empty
        }

        StringBuilder titleCased = new StringBuilder();
        String[] words = value.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                titleCased.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return titleCased.toString().trim(); // Remove trailing whitespace
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%.3f", getId(), getName(), getAddress(), getPhone(), getSale());
    }
}
