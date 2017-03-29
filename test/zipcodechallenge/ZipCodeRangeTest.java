/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zipcodechallenge;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Veeran Jagarlamudi
 * @version 1.0
 * @since 03/28/2017
 */

public class ZipCodeRangeTest {
   
    /**
     * Test of clear method, of class ZipCodeRange.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        ZipCodeRange instance = new ZipCodeRange(21000, 23000);
        int expResult = 0;
        instance.clear();
        assertEquals(expResult,instance.getLowerLimit());
        assertEquals(expResult,instance.getUpperLimit());
    }

    /**
     * Test of numberInRange method, of class ZipCodeRange.
     */
    
    @Test
    public void testNumberInRange() {
        System.out.println("numberInRange");
        int number = 22000;
        ZipCodeRange instance = new ZipCodeRange(21000, 23000);
        boolean expResult = true;
        boolean result = instance.numberInRange(number);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class ZipCodeRange.
     */
    
    @Test
    public void testToString() {
        System.out.println("toString");
        ZipCodeRange instance = new ZipCodeRange(21000, 23000);
        String expResult = "ZipCodeRange [lowerLimit=21000, upperLimit=23000]";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
