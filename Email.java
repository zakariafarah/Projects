package EmailApp;
import java.util.Scanner;

/**
 * Write a description of class Email here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Email
{
    // instance variables - replace the example below with your own
   
    public static void main(String[] args){
       Emailapp em1 = new Emailapp("Zakaria", "Farah");
       System.out.println(em1.setAlternateEmail("zakaria_farah@gmail.com"));
        
      System.out.println(em1.displayInfo());
      System.out.println(em1.changePassword("Dallo-2020"));
      
    }
    
    

   
    /**
     * Constructor for objects of class Email
     */
    public Email()
    {
        // initialise instance variables
     
    }

    
}
