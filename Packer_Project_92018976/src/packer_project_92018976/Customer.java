package packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victoria
 */
public class Customer {
    
    private String name;
    private List<Address> addresses;

    public Customer(String name, Address address) {
        addresses = new ArrayList<>();
        this.name = name;
        this.addresses.add(address);
    }
    
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
    
    public String getName() {
        return name;
    }
    /**
     * return best address, param 'd' closest address
     */   
    public Address getClosestAddressTo(Depot d) {
        double bestDistance = Double.MAX_VALUE;
        Address bestAddress = null;
        for (Address a : addresses) {
            double distance = a.getCoordinates().companyDistanceTo(d.getCoordinates());
            if (distance < bestDistance) {
                bestDistance = distance;
                bestAddress = a;
            }
        }
        return bestAddress;
    }

    public String toString() {
        return this.getName();
    }
}
