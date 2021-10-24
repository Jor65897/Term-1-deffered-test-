

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import za.ac.mycput.sicktestproject.person;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Farrel Joris Mbazaboua Izango 
 *              219195897
 */

public class testperson {
    private person P1;
    private person P2;
   
    
    public testperson() {
    }

    @BeforeEach
    public void setUp() 
    {
        this.P1 = new person(18,"JP");
        this.P2 = new person(22,"John");
        
          
    }
    
   
    // Equality Test
    @Test
    public void testEquality () {
        assertEquals(P1,P2,"This is an equality test" );;
    }
     // Identity Test
    @Test
    public void testIdentity (){
          
        assertSame(P1,P2,"This is the identity test");
    }
    
     // Failing test
    @Test
    public void testFailing () {
       assertEquals(P1,P2); 
       fail(" ***This is the failing test*** ");
    }
   
    // Timeout test 
    @Timeout (5)
    @Test
    public void testTimeout () {
        for (int i=0; i<10; i++) {
         System.out.println(i);
     }

    }
 
    // Disabling test
    @Disabled
    @org.junit.jupiter.api.Test
    public void testDisabled () {  
     assertEquals(P1, P2);
    }
    
    
}
