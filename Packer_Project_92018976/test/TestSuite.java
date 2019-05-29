/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import packer.AddressTest;
import packer.BoxTest;
import packer.CoordinatesTest;
import packer.CustomerTest;
import packer.DepotTest;
import packer.ManifestTest;
import packer.PackerTest;
import packer.ProductTest;
import packer.ProductWeightComparatorTest;

/**
 *
 * @author Victoria
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CoordinatesTest.class,
    AddressTest.class,
    DepotTest.class,
    ProductTest.class,
    CustomerTest.class,
    BoxTest.class,
    ManifestTest.class,
    PackerTest.class,
    ProductWeightComparatorTest.class
})

public class TestSuite {
    // No code required here.
}
