
import java.util.Arrays;
import jdk.internal.misc.VM;

public class Audi extends Vehicle{
    private int releasedYear;
    private String color;
    
    private static final String[] VALID_COLORS = {"Black", "White", "Red", "Gray"};
    private static final String NEW_COLOR = "Red";    
    private static final int NEW_RELEASEDYEAR = 2025;

    public Audi() {
    }

    public Audi(String id, String name, double price, int quantity, String color, int releasedYear) {
        super(id, name, price, quantity);
        this.color = isColorValid(color) ? getRightFormatColor(color) : "Black";
        this.releasedYear = isYearValid(releasedYear) ? releasedYear : 2022;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = isYearValid(releasedYear) ? releasedYear : 2022;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = isColorValid(color) ? getRightFormatColor(color) : "Black";
    }

    public boolean isYearValid(int releasedYear) {
        return (releasedYear >= 2022 && releasedYear <= 2025);
    }
    
    public String getRightFormatColor(String color) {
        // Color with right format: rEd -> Red (TitleCase)
        StringBuilder finalColor = new StringBuilder();
        finalColor.append(Character.toTitleCase(color.charAt(0)))
                  .append(color.substring(1).toLowerCase());
        
        return finalColor.toString().trim();
    }
    
    public boolean isColorValid(String color) {
        String finalColor = getRightFormatColor(color);
        if (Arrays.asList(VALID_COLORS).contains(finalColor)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%.2f,%d,%.2f", 
            getId(), getName(), color, releasedYear, getPrice(), getQuantity(), getSubTotal());
    }
    
    @Override
    public double getSubTotal() {
        double increment = ((color.equals(NEW_COLOR)) || releasedYear == NEW_RELEASEDYEAR) ? 1.2 : 1.0;
        
        return super.getSubTotal() * increment;
    }
    
    
}
