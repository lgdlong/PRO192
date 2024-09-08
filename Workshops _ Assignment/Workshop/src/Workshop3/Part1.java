package Workshop3;

class Car {
    String color;
    int enginePower;
    boolean convertible;
    boolean parkingBrake;

    // CONSTRUCTOR

    public Car() {

    }

    public Car(String color, int enginePower, boolean convertible, boolean parkingBrake) {
        this.color = color;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }


    // GETTER
    public String getColor() {
        return color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }


    //SETTER
    public void setColor(String color) {
        this.color = color;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    // OTHER LOGIC METHODS
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        System.out.println("\nColor: " + color);
        System.out.println("Engine Power: " + enginePower);
        System.out.println("Convertible: " + convertible);
        System.out.println("Parking Brake: " + parkingBrake + "\n");
    }
}

public class Part1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();

        Car c2 = new Car("red", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColor("black");
        System.out.println("Colour of c2:" + c2.getColor());
        c2.output();
    }
}
