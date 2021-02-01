package EmailApp;
import java.util.Scanner;
import java.util.Random;


/**
 * Write a description of class Emailapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Emailapp
{
    
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String alternateEmail;
    private int inboxcapacity = 500;
    private String companyname = "Ciena";
    private int length = 15;
    private String fullEmail;
    
    

    /**
     * Constructor for objects of class Emailapp
     */
    public Emailapp(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
       
        department = getDepartment();
        password = generatePassword(length);
        inboxcapacity = setinbox_capacity(inboxcapacity);
        System.out.println(changePassword(password));
       //System.out.println(displayInfo());
    }

    private String getDepartment(){
        System.out.print ("enter department number");
        Scanner in = new Scanner (System.in);
        int deptChoice = in.nextInt();
    
        if (deptChoice ==1) {return "sales";}
        else if (deptChoice == 2) {return "Human Resources";}
        else if (deptChoice == 3) {return "IT";}
        else if (deptChoice == 4) {return "Finance";}
        return " ";
    }
    
    private String generatePassword(int length){
    
     String password = "abcdefghi123456789";
     StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

     

    for(int i = 0; i < length; i++) {

      // generate random index number
      int index = random.nextInt(password.length());

      // get character specified by index
      // from the string
      char randomChar = password.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }

    String randomString = sb.toString();
    System.out.println("Random String is: " + randomString);
    return randomString;

  }

private int setinbox_capacity(int inboxcapacity){
    System.out.println("inbox capacity = " + inboxcapacity + " MB");
    return inboxcapacity;
    
}

public String changePassword(String password){       

   return password;
} 

public String setAlternateEmail(String alternateEmail){
 
    return alternateEmail;
    
}

public String displayInfo(){
  return "Info: " + firstname + "." + lastname + "@ " +  "" 
    + department + "." + companyname + ".com";
    
 
}
 
}
   
    
    
