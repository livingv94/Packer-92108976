package packer;

/**
 *
 * @author Victoria
 */
public class Depot {
    private String name;
    private Address address;

    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    /** 
     * returns name
    */
    public String getName() {
        return name;
    }
    
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }
    
    /**
     *
     * returns name
     */
    @Override
    public String toString() {
        return this.getName();
    }
    
}
