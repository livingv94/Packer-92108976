package packer;

/**
 *
 * @author Victoria
 */
public class Product {

    private String name;
    private int weight;
    private boolean hazardous;
    private boolean fragile;

    public Product(String name, int weight, boolean hazardous, boolean fragile) {
        this.name = name;
        this.weight = weight;
        this.hazardous = hazardous;
        this.fragile = fragile;
    }

    /**
     * return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * return name
     */
    public String getName() {
        return name;
    }

    /**
     * return if its hazardous
     */

    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * @return if its fragile
     */
    public boolean isFragile() {
        return fragile;
    }

    /**
     *
     * return name
     */
    @Override
    public String toString() {
        return this.getName();
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product)o;
        return p.getName().equals(this.getName());
    }
    
}
