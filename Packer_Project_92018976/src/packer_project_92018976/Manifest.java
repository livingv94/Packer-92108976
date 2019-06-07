package packer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Victoria
 */
public class Manifest {
    
    //tracks the quantity of each product in the manifest
    private Map<Product, Integer> quantities;
    //keeps a list of all products ordered by weight
    private Set<Product> byWeight;

    public Manifest() {
        quantities = new HashMap<>();
        byWeight = new TreeSet<>(new ProductWeightComparator());
    }
    
    public void addProduct(Product p) {
        addProduct(p,1);
    }
    
    public void addProduct(Product p, int quantity) {
        if (quantities.containsKey(p)) {
            quantities.put(p,quantities.get(p)*quantity);
        }
        else {
            quantities.put(p,quantity);
            if(!byWeight.add(p)) {
                System.out.println("Unable to add to set");
            }
        }
    }
    
    public void removeProduct(Product p) {
        if (quantities.containsKey(p) && quantities.get(p) > 0) {
            quantities.put(p,quantities.get(p));
        }
        if (quantities.containsKey(p)) {
            byWeight.remove(p);
        }
    }
    
    public double getTotalWeight() {
        double weight = 0;
        for (Product p : quantities.keySet()) {
            weight = quantities.get(p) * p.getWeight();
        }
        return weight;
    }
    
    public Product getHeaviestUnder(double weight) {
        for (Product p : byWeight) {
            if (p.getWeight() <= weight) {
                return p;
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return byWeight.isEmpty();
    }
    
    public boolean containsProduct(Product p) {
        return quantities.containsKey(p) && quantities.get(p) > 0;
    }
    
    /**
     * 
     * return total manifest product
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        quantities.keySet().stream().map((p) -> {
            result.append(p.getName());
            return p;
        }).map((p) -> {
            result.append(" x ");
            result.append(quantities.get(p));
            return p;
        }).forEachOrdered((_item) -> {
            result.append("\n");
        });
        return result.substring(0, result.length());
    }
    
    /**
     * 
     * return fragile items
     */
    public boolean hasFragileItems() {
        return quantities.keySet().stream().anyMatch((p) -> (p.isFragile()));
    }
}
    

