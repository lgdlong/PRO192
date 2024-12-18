package Workshop3;

class Guitar{
    String serialNumber;
    int price;
    String builder;
    String model;
    String backWood;
    String topWood;

    public Guitar() {
    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    // other methods
    public void createSound() {
        System.out.println(
                serialNumber + " " +
                price + " " +
                builder + " " +
                model + " " +
                backWood + " " +
                topWood
        );
    }
}
public class Part3 {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar();

        Guitar guitar2 = new Guitar("G123", 2000,"Sony","Model123","hardWood","softWood");

        guitar2.setPrice(3000);
        guitar2.createSound();

    }
}
