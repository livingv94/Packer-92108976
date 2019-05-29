package packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victoria
 */
public class Packer {

    /** 
     * Switched (d,c) to (c,d) as box is required to have box before depot 
     * @param c This object holds the customers name and address
     * @param d This object holds the depot's name and address
     * @param m This object holds information on products, quantities, and weight
     * @return summary of packed boxes
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
        /** Re factored by removing the second duplicate call to method:
            //packedBoxes.add(b);
                */
        if (b != null) {
            packedBoxes.add(b);
        }
        return packedBoxes;
    }
    
}
