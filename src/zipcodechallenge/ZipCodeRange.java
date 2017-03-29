/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zipcodechallenge;

/**
 *
 * @author Veeran Jagarlamudi
 * @version 1.0
 * @since 03/28/2017
 */

public class ZipCodeRange {
    // Declaration of instance variables  
    private int lowerLimit;
    private int upperLimit;

    // parameterized constructor
    public ZipCodeRange(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    
    /*
        This is the getter method for the lowerLimit
    */
    public int getLowerLimit() {
        return lowerLimit;
    }
    
    /*
      This is the setter method for the lowerLimit
    */
    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }
    
    /*
       This is the getter method for the upperLimit
    */
    public int getUpperLimit() {
        return upperLimit;
    }
    
    /*
       This is the setter method for the upperLimit
    */
    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
   
    /*
      This method which sets the lowerlimit and upperlimit to 0;
    */
    public void clear() {
	this.lowerLimit = 0;
	this.upperLimit = 0;
    }
    
    /*
     This method which returs true when the given number greater than lowerlimit and less than upperlimit
    */
    
    public boolean numberInRange(int number){
	return number >= this.lowerLimit && number <= this.upperLimit;
    }
    
    /*
      This method displays string representation of ZipCodeRange object
    */
    @Override
    public String toString() {
        return "ZipCodeRange [" + "lowerLimit=" + lowerLimit + ", upperLimit=" + upperLimit + ']';
    }
        
}
