/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zipcodechallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Veeran Jagarlamudi
 * @version 1.0
 * @since 03/28/2017
 */

public class ZipCodeRangeUtil {

    /**
     * This is the main method which makes use of optimizeZipRange Method.
     * @param args the command line arguments
     * @return 
     */
    
    public static void main(String[] args) {
        
        List<ZipCodeRange> zipCodeRangeList = new ArrayList<ZipCodeRange>();
        
        ZipCodeRange zr1 = new ZipCodeRange(94133, 94133);
        ZipCodeRange zr2 = new ZipCodeRange(94200, 94299);
	ZipCodeRange zr3 = new ZipCodeRange(94226, 94399);
        
        // Adding ZipCodeRange objects to List zipCodeRangeList
        zipCodeRangeList.add(zr1);
        zipCodeRangeList.add(zr2);
        zipCodeRangeList.add(zr3);
        
        optimizeZipRange(zr1, zr2);
	optimizeZipRange(zr1, zr3);
        optimizeZipRange(zr2, zr3);
        
        
        for (int i=0; i < zipCodeRangeList.size()- 1;i++ ){
              
            System.out.println(zipCodeRangeList.get(i));
  
        }
  }
    
    /*
      This method which handles the zipCodes restrictions
    */
    public static void optimizeZipRange(ZipCodeRange zr1, ZipCodeRange zr2) {
	if(zr1.numberInRange(zr2.getLowerLimit()) || zr2.getLowerLimit()- zr1.getUpperLimit() == 1){
		zr1.setUpperLimit(zr2.getUpperLimit());
		zr2.clear();
		} 
	} 
   
}
    
    

