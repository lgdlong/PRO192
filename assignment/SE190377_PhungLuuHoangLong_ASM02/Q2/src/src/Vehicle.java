public class Vehicle {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Vehicle() {
        this.id = "";
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    public Vehicle(String id, String name, double price, int quantity) {
        this.id = isIdValid(id) ? id.toUpperCase() : "V000000";
        this.name = isNameValid(name) ? formatName(name) : "new vehicle";
        this.price = isPriceValid(price) ? price : 1;
        this.quantity = isQuantityValid(quantity) ? quantity : 1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = isIdValid(id) ? id : "V000000";
    }

    public String getName() {
        return formatName(name);
    }

    public void setName(String name) {
        this.name = isNameValid(name) ? name : "new vehicle";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = isPriceValid(price) ? price : 1;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = isQuantityValid(quantity) ? quantity : 1;
    }
    
    public boolean isIdValid(String id) {
        return (!id.isEmpty() && id.toUpperCase().matches("V[0-9]{6}"));
    }
    
    public boolean isNameValid(String name) {
        if (!name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
            return true;
        }
        return false;
    }
    
    public boolean isPriceValid(double price) {
        return (price >= 1 && price <= 1000000);
    }
    
    public boolean isQuantityValid(int quantity) {
        return (quantity >= 1 && quantity <= 1000);
    }
    
    public String formatName(String name) {
        String[] words = name.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(Character.toTitleCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" ");
        }
        
        return result.toString().trim();
    }
    
    public double getSubTotal() {
        return price * quantity;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%.2f,%d,%.2f", id, name, price, quantity, getSubTotal());
    }
}
