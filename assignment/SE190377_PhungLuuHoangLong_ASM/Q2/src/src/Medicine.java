

public class Medicine {
    private String name;
    private String indication;
    private int expirationYear;

    public Medicine() {
    }

    public Medicine(String name, String indication, int expirationYear) {
        this.name = name;
        this.indication = indication;
        this.expirationYear = expirationYear;
    }

    public String getName() {
        StringBuilder str = new StringBuilder();
        
        str.append(Character.toUpperCase(name.charAt(0)))
           .append(name.substring(1).toLowerCase());
        
        return str.toString().trim();
    }

    public String getIndication() {
        StringBuilder str = new StringBuilder();
        
        str.append(Character.toUpperCase(indication.charAt(0)))
           .append(indication.substring(1).toLowerCase());
        
        return str.toString().trim();
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", getName(), getIndication(), getExpirationYear());
    }
    
    
}
