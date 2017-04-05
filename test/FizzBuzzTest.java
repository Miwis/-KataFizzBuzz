/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import katafizzbuzz.FizzBuzz;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam129
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }
    
    public int getFizzBuzz(int n){
        return n;
    }
    
    @Test
    public void testFizzBuzzDeDosDevuelveDos(){
      FizzBuzz fb = new FizzBuzz();
      String result = fb.getFizzBuzz(2);
      assertEquals ("2", result);
    }
    
    @Test
    public void testFBDevuelveFB(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFB("FizzBuzz");
        assertEquals ("FizzBuzz", result);
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
