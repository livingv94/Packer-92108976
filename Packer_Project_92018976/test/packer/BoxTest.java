/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Victoria
 */
public class BoxTest {
    
    // Test data
    Product a1 = new Product("Product1", 0, true, true);
    Product a2 = new Product("Product1", 2, true, true);
    Product a3 = new Product("Product1", 3, false, true);
    Product a4 = new Product("Product1", 4, true, false);
    
    Product b1 = new Product("Product2", 0, true, true);
    Product b2 = new Product("Product2", 2, true, true);
    Product b3 = new Product("Product2", 3, false, true);
    Product b4 = new Product("Product2", 4, true, false);
        
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Product class...");
    }
    /**
     * Test addProduct method
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product p = new Product("Screws", 3, true, true);
        Manifest instance = new Manifest();
        instance.addProduct(p, 12);
    }

    /**
     * Test getLabel method
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = null;
        String expResult = "";
        String result;
        result = instance.getLabel();
        assertEquals(expResult, result);
    }

    /**
     * Test toString method
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Manifest instance = new Manifest();
        String expResult = "";
        String result;
        result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testSame() {
        assertEquals(true, a1.equals(a1));
        assertEquals(true, a2.equals(a1));
        assertEquals(true, a3.equals(a1));
        assertEquals(true, a4.equals(a1));

        assertEquals(false, b1.equals(a1));
        assertEquals(false, b2.equals(a1));
        assertEquals(false, b3.equals(a1));
        assertEquals(false, b4.equals(a1));
        
        assertEquals(false, b2.equals(a2));
        assertEquals(false, b3.equals(a3));
        assertEquals(false, b4.equals(a4)); 
    }
    
    /**
     * Test getWeight method
     */
     @Test
    public void testGetWeight() {
        assertEquals(2, a2.getWeight());
        assertEquals(3, a3.getWeight());
        assertEquals(4, a4.getWeight());
    }

    /**
     * Test canFit method
     */
    @Test
    public void testCanFitProducts() {
        System.out.println("canFitProducts");
        Product p = new Product("Screws", 41, true, true);
        Coordinates Coordinates1 = new Coordinates(1000, 2000);
        Address Address1 = new Address("1 First St", "Aplace", "Citadel City", "A111", Coordinates1);
        Customer Customer1 = new Customer("Customer1", Address1);
        Depot Depot0 = new Depot("Depot0", Address1);
        
        Box b = new Box(Customer1,Depot0);
        
        assertEquals(false, b.canFit(p));
    }

    /**
     * Test canFit method
     */
    @Test
    public void testCanFitProductsNum() {
        System.out.println("canFit");
        Product p = new Product("Screws", 5, true, true);
        Coordinates Coordinates2 = new Coordinates(30,40);
        Address Address2 = new Address("123 Count St", "Brooklyn", "Welling Town", "B222", Coordinates2);
        Customer Customer2 = new Customer("Test Customer", Address2);
        Depot Depot4 = new Depot("Depot4", Address2);
        
        Box b = new Box(Customer2,Depot4);
        
        assertEquals(true, b.canFit(p));
    }

    /**
     * Test remainingCapacity method
     */
    @Test
    public void testSpaceLeft() {
        System.out.println("spaceLeft");
        Box instance = null;
        double expResult = 0.0;
        double result;
        result = instance.remainingCapacity();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test isFragile method
     */
    @Test
    public void testIsFragile() {
        assertEquals(true,a1.isFragile());
        assertEquals(false,a4.isFragile());
    }

    /**
     * Test isHazardous method
     */
    @Test
    public void testIsHazardous() {
        assertEquals(true,a1.isHazardous());
        assertEquals(false,a3.isHazardous());
    }
    
}
