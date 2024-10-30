import java.util.Comparator;

public class ByQUantity implements Comparator<Furniture>{

    @Override
    public int compare(Furniture o1, Furniture o2) {
        if (o1.getQuantity() > o2.getQuantity()) {
            return -1;
        } else if (o1.getQuantity() == o2.getQuantity()) {
            return 0;
        } else {
            return 1;
        }
    }
    
}
