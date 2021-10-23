/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.sicktestproject;
/**
 *
 * @author Farrel Joris Mbazaboua Izango 
                * 219195897
 */
public class person {

    
       private int age;
       private String name;
       
       public person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "person{" + "age=" + age + ", name=" + name + '}';
    }
    
       
      public static void main(String[] arg){
           
          
           person P1 = new person(22,"John");
           person P2 = new person(24,"Farha");
           
             if(P1.equals(P2)){
               System.out.println("Same person");
                }else if(!P1.equals(P2)){
               System.err.println("*******Different person*******");
           }
          
    }
           
           
       
       }
      

