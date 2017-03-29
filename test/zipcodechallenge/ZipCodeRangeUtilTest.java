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
public class ZipCodeRangeUtilTest {
    
     /**
     * Test of optimizeZipRange method, of class ZipCodeRangeUtil.
     */
    @Test
    public void testOptimizeZipRange() {
        System.out.println("optimizeZipRange");
        ZipCodeRange zr1 = new ZipCodeRange(94200, 94299);;
        ZipCodeRange zr2 = new ZipCodeRange(94226, 94399);
        ZipCodeRangeUtil.optimizeZipRange(zr1, zr2);
        int expResult1 = 94200;
        int expResult2 = 94399;
        assertEquals(expResult1, zr1.getLowerLimit());
        assertEquals(expResult2, zr1.getUpperLimit());
        
    }
    
}
