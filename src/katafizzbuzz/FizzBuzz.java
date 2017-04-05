/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz;

/**
 *
 * @author dam129
 */
public class FizzBuzz{
    public int n;

    public String getFizzBuzz(int n) {
        String s=String.valueOf(n);
        
        return s;
        
    }
    
    public String getFB(String f){
             
        if (n%3==0 && n%5==0){
            f="FizzBuzz";
        }
        return f;
    }
    
    
    
}
