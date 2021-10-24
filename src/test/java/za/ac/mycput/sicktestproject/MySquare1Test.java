/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.sicktestproject;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Elisa
 */
public class MySquare1Test {
    
    public MySquare1Test() {
    }

    /**
     * Test of area method, of class MySquare1.
     */
    @Test
    public void testArea() {
        
        MySquare1 ms = new MySquare1(2);
        double expected = 4;
        double actual = ms.area();
        assertEquals(expected,actual,0.00001);
    }

    /**
     * Test of setSideLength method, of class MySquare1.
     */
    @Test
    public void testSetSideLength() {
    }
    
}
