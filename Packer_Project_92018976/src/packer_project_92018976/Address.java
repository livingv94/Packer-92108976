package packer;

/**
 *
 * @author Victoria
 */
public class Address {
    private final String street;
    private final String suburb;
    private final String city;
    private final String postcode;
    private final Coordinates coordinates;

    public Address(String street, String suburb, String city, String postcode, Coordinates coordinates) {
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postcode = postcode;
        this.coordinates = coordinates;
    }

    /**
     *
     * @return the address
     */
    @Override
    public String toString() {
        return 
                street + "\n" +
                suburb + "\n" +
                city + "\n" +
                postcode;
    }
    /**
     * @return the coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    
}
