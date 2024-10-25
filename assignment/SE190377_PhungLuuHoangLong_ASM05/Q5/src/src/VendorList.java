import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VendorList extends ArrayList<Vendor> {
    
    public void addVendor(Vendor v) {
        this.add(v);
    }
    
    public double getVendorSaleById(int id) {
        for (Vendor vendor : this) {
            if (id == vendor.getId()) {
                return vendor.getSale();
            }
        }
        return Math.round((double)id * 1000.0) / 1000.0;
    }
    
    public Vendor getVendorWithMaxSale() {
        // Ensure the list is not empty
        if (this.isEmpty()) {
            return null; // or handle it appropriately if needed
        }
        
        double max = Double.MIN_VALUE;
        
        // Declare default result is the first element
        Vendor result = this.get(0); 
        
        
        /**
         * Check all elements in VendorList sequence:
         * If any vendor has sale value greater default result:
         *  -> Assign that Vendor is max
         */
        for (Vendor vendor : this) {
            if (vendor.getSale() > max) {
                max = vendor.getSale();
                result = vendor;
            }
        }
        
        return result;
    }
    
    public double getTotalSaleAllVendors() {
        double sum = 0;
        
        for (Vendor vendor : this) {
            if (vendor.getSale() > 0) {
                sum += vendor.getSale();
            }
        }
        
        return sum;
    }
    
    public void printVendorList() {
        ArrayList<Vendor> arr = new ArrayList<>(this);
        
        Collections.sort(arr, new BySale());
        
        for (Vendor vendor : arr) {
            System.out.println(vendor.toString());
        }
    }
    
    public class BySale implements Comparator<Vendor>{
        
        @Override
        // Compare descending sale
        public int compare(Vendor v1, Vendor v2) {
            if (v1.getSale() == v2.getSale()) {
                return v1.getName().compareToIgnoreCase(v2.getName());
            }
            else if (v1.getSale() < v2.getSale()) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
