
import java.util.ArrayList;
import java.util.Collections;

public class FurnitureList extends ArrayList<Furniture>{
    public void addFurniture(Furniture f) {
        if (f != null) {
            this.add(f);
        }
    }
    
    public String getNameById(int id) {
        for (Furniture f : this) {
            if (id == f.getId()) {
                return f.getName();
            }
        }
        
        return "N/A";
    }
    
    public FurnitureList getFurnitureList() {
        Collections.sort(this, new ByQUantity());
        return this;
    }
    
    public int getTotalQuantity() {
        int sum = 0;
        
        for (Furniture f : this) {
            if (f.getQuantity() > 0) {
                sum += f.getQuantity();
            }
        }
        
        return sum;
    }
}
