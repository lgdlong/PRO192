package Lab_ClassObject;

import java.util.Scanner;

public class Medicine {
    // Attributes
    private String code;
    private String name;
    private String manufacturer;
    private double price;
    private long quantity;
    private String date;
    private String expireDate;
    private long batchNumber;

    // Constructors
    public Medicine() {
    }

    public Medicine(String code, String name, String manufacturer, double price, long quantity, String date, String expireDate, long batchNumber) {
        this.code = code.toUpperCase(); // Code will have uppercase format
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.expireDate = expireDate;
        this.batchNumber = batchNumber;
    }

    // Getter and Setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public long getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(long batchNumber) {
        this.batchNumber = batchNumber;
    }

    // Other methods
    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter medicine code: ");
        code = sc.nextLine();

        System.out.print("Enter medicine name: ");
        name = sc.nextLine();

        System.out.print("Enter manufacturer name: ");
        manufacturer = sc.nextLine();

        System.out.print("Enter price: ");
        price = Double.parseDouble(sc.nextLine());

        System.out.print("Enter quantity: ");
        quantity = Long.parseLong(sc.nextLine());

        System.out.print("Enter manufacturer date: ");
        date = sc.nextLine();

        System.out.print("Enter expireDate: ");
        expireDate = sc.nextLine();

        System.out.print("Enter batchNumber: ");
        batchNumber = Long.parseLong(sc.nextLine());
    }

    // Print all elements method
    public void print() {
        System.out.println("******* The Medicine Detail *******");
        System.out.println("Code: " + code);
        System.out.println("Medicine name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufactured date: " + date);
        System.out.println("Expiry date: " + expireDate);
        System.out.println("Batch number: " + batchNumber + "\n");
    }

    // Print code and quantity with code
    public void print(String code) {
        if (code.equalsIgnoreCase(this.code)) {
            System.out.printf("Code: %s\nQuantity: %d\n", this.code, this.quantity);
        }
        else {
            System.out.println("There is NO " + code.toUpperCase() + " code medicine.");
        }
    }

    // Print code, name, date, expireDate with code and name
    public void print(String code, String name) {
        if (code.equalsIgnoreCase(this.code) && name.equalsIgnoreCase(this.name)) {
            System.out.printf(
                    "Code: %s\nMedicine name: %s\nManufactured date: %s\nExpiry date: %s\n",
                    this.code, this.name, this.date, this.expireDate
            );
        }
        else {
            System.out.println("Medicine code or name wrong.");
        }
    }

    public void increaseQuantity(long number) {
        this.quantity += number;
    }
}

/*
* It may have the SAME CODE with difference medicine name.
*
*
*
*
*
*
* */
