public class Furniture {
    private int id;
    private String name;
    private int quantity;

    public Furniture() {
    }

    public Furniture(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name.toUpperCase();
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    @Override
    public String toString() {
        return String.format("%d, %s, %d", id, name, quantity);
    }
}

