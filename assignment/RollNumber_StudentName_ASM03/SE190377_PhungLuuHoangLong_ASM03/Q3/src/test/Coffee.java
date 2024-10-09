import java.util.Arrays;

/**
 *
 * @author PhungLuuHoangLong
 */
public class Coffee extends Beverage{
    private int expire;    
    private String type;
    
    private static final String[] VALID_TYPES = {"special", "high", "medium", "low"};

    public Coffee() {
    }

    public Coffee(String id, String name, double price, int quantity, String type, int expire) {
        super(id, name, price, quantity);
        this.type = isTypeValid(type) ? type : "medium";
        this.expire = isExpireValid(expire) ? expire : 180;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = isExpireValid(expire) ? expire : 180;
    }

    public String getType() {
        return super.titleCase(type);
    }

    public void setType(String type) {
        this.type = isTypeValid(type) ? type : "medium";
    }
    
    public boolean isExpireValid(int expire) {
        return (expire >= 1 && expire <= 180);
    }
    
    public boolean isTypeValid(String type) {
        String lowercaseType = type.toLowerCase();
        
        return Arrays.asList(VALID_TYPES).contains(lowercaseType);
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%.3f,%d,%.3f",getId(), getName(), getType(),getExpire(), getPrice(), getQuantity(), subTotal());
    }
    
    @Override
    public double subTotal() {
        double rate;
        
        if (this.type.equals("special") || super.getId().matches("^DB\\d{3}$")) {
            rate = 1.2;
        }
        
        else if (this.type.equals("high") || super.getId().matches("^HC\\d{3}$")) {
            rate = 1.1;
        }
        
        else if (this.type.equals("medium") && expire <= 30) {
            rate = 0.5;
        }
        
        else {
            rate = 1;
        }
        
        return super.getPrice() * super.getQuantity() * rate;
    }

}
