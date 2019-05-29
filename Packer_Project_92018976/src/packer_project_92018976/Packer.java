package packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victoria
 */
public class Packer {

    /** 
     * param c customers name and address
     * param d depot's name and address
     * param m products, quantities, and weight info
     * return summary of packed boxes
     */
    public static List<Box> packProducts(Customer c, Depot d, Manifest m) {
        List<Box> packedBoxes = new ArrayList<>();
        Box b = null;
        while (!m.isEmpty()) { // repeat until all items are packed
            if (b == null) {
                b = new Box(c,d);
            }
            Product prodToAdd = m.getHeaviestUnder(b.remainingCapacity());
            if (prodToAdd == null) {
                packedBoxes.add(b);
                b = null;
            }
            else {
                b.addProduct(prodToAdd);
                m.removeProduct(prodToAdd);
            }  
        }
        
        if (b != null) {
            packedBoxes.add(b);
        }
        return packedBoxes;
    }
    
}
