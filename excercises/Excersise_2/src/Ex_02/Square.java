package Ex_02;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("Square[Rectangle[Shape[color=%s,filled=%b],width=%f,height=%f]]", getColor(), isFilled(), getWidth(), getLength());
    }
}
