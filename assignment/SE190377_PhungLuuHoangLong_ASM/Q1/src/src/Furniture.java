public class Furniture {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Furniture() {
    }

    public Furniture(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public double getSubTotal() {
        double subTotal = price * (int) quantity;
        
        if (50 <= subTotal && subTotal < 100) {
            subTotal -= 0.1 * subTotal;
        } else if (100 <= subTotal && subTotal <= 500) {
            subTotal -= 0.2 * subTotal;
        }
        
        return subTotal;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f, %d, %.2f", id, name, price, quantity, getSubTotal());
    }
}

