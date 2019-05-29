package packer;

import java.util.Comparator;

/**
 *
 * @author Victoria
 * 
 * sort by weight descending
 */
public class ProductWeightComparator implements Comparator<Product> {
    
    public int compare(Product a, Product b) {
        if (a.getWeight() < b.getWeight()) {return 1;}
        else if (a.getWeight() > b.getWeight()) {return -1;}
        else return a.getName().compareTo(b.getName());
    }
                
}
