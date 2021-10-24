
import java.util.logging.Logger;
import za.ac.mycput.sicktestproject.person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class testperson {

    public static void main(String[] args) {
        person P3 = new person(23,"G"); 
           
           person P1 = new person(22,"John");
           person P2 = new person(24,"Farha");
           
             if(P1.equals(P2)){
               System.out.println("Same person");
                }else if(!P1.equals(P2)){
               System.err.println("*******Different person*******");
    }
    
    }
}
