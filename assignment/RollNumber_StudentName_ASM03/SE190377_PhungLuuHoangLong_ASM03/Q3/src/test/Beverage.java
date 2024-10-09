/**
 *
 * @author PhungLuuHoangLong
 */
abstract class Beverage {
    private String id;
    private String name;
    private double price;
    private int quantity;
    
    // Abstract method
    public abstract double subTotal();

    public Beverage() {
    }

    public Beverage(String id, String name, double price, int quantity) {
        this.id = isIdValid(id) ? id : "NT000";
        this.name = isNameValid(name) ? name : "New Beverage";
        this.price = isValidPrice(price) ? price : 1.0;
        this.quantity = isQuantityValid(quantity) ? quantity : 1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = isIdValid(id) ? id : "NT000";
    }

    public String getName() {
        return titleCase(name);
    }

    public void setName(String name) {
        this.name = isNameValid(name) ? name : "New Beverage";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = isValidPrice(price) ? price : 1.0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = isQuantityValid(quantity) ? quantity : 1;
    }
    
    public boolean isIdValid(String id) {
        if (id.isEmpty() || id.length() != 5) {
            return false;
        }
        return id.matches("^[A-Z]{2}\\d{3}$");
    }
    
    public boolean isNameValid(String name) {
        return (name.isEmpty() || name.length() < 5 || name.length() > 50);
    }
    
    public boolean isValidPrice(double price) {
        return (price >= 1 && price <= 5000);
    }
    
    public boolean isQuantityValid(int quantity) {
        if (quantity >= 1 && quantity <= 100) {
            return true;
        }
        return false;
    }
    
    public String titleCase(String input) {
        String[] words = input.split("\\s+");
        
        StringBuilder finalName = new StringBuilder();
        
        for (String word : words) {
            finalName.append(Character.toTitleCase(word.charAt(0)))
                     .append(word.substring(1).toLowerCase())
                     .append(" ");
        }
        return finalName.toString().trim();
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%.3f,%d, %.3f", id, name, price, quantity, subTotal());
    }
}
