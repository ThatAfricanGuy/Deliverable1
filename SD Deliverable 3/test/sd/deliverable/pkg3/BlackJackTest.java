/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.deliverable.pkg3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author henry
 */
public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing...");

    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finished testing.");
    }

    @Before
    public void setUp() {
        System.out.println("Testing method.");
    }

    @After
    public void tearDown() {
        System.out.println("Finished Testing method.");
    }

    @Test
    public void testNameGood() {
        System.out.println("checkNameGood");
        String name = "John Doe";
        boolean expResult = true;
        String nameRegex = "(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$";
        boolean result;
        if(name.matches(nameRegex)){
          result =  true; 
        }
        else{
            result = false;
        }
        
        assertEquals(expResult, result);
    }
    
     @Test
    public void testNameBad() {
        System.out.println("checkNameBad");
        String name = "Jo4n D03";
        boolean expResult = true;
        String nameRegex = "(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$";
        boolean result;
        if(!name.matches(nameRegex)){
          result =  true; 
        }
        else{
            result = false;
        }
        
        assertEquals(expResult, result);
    }
    
     @Test
    public void testNameBoundary() {
        System.out.println("checkNameBoundary");
        String name = "Kamakaleiimalamalamaiaik";
        boolean expResult = true;
        String nameRegex = "(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$";
        boolean result;
        if(name.matches(nameRegex)){
          result =  true; 
        }
        else{
            result = false;
        }
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBetGood() {
        System.out.println("checkBetGood");
        String bet = "1000";
        boolean expResult = true;
        boolean result;
        String betRegex = "\\d+";
        if(bet.matches(betRegex)){
            result = true;
        }
        else{
            result = false;
        }
        
        assertEquals(expResult, result);
    }
    
     @Test
    public void testBetBad() {
        System.out.println("checkBetBad");
        String bet = "One";
        boolean expResult = true;
        boolean result;
        String betRegex = "^[0-9]{20}$";
        if(!bet.matches(betRegex)){
            result = true;
        }
        else{
            result = false;
        }
        
        assertEquals(expResult, result);
    }
    
     @Test
    public void testBetBoundary() {
        System.out.println("checkBetBoundary");
        String bet = "25";
        boolean expResult = true;
        boolean result;
        String betRegex = "^[0-9]{1,20}$";
        if(bet.matches(betRegex)){
            result = true;
        }
        else{
            result = false;
        }
        
        assertEquals(expResult, result);
    }
    
}


