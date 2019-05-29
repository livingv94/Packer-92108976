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
    /** Changed
    
       public String getName() {
       return address.toString();
       }

       to
    
       public String getName() {
       return name;
       }
     * @return the name
    */
    public String getName() {
        return name;
    }
    
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }
    
    /**
     *
     * @return the name
     */
    @Override
    public String toString() {
        return this.getName();
    }
    
}
