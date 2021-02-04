import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
/**
 * Write a description of class OnlineExam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineExam extends JFrame 
{
     // Declaration of object of JRadioButton class. 
    JRadioButton jRadioButton1; 
  
    // Declaration of object of JRadioButton class. 
    JRadioButton jRadioButton2; 
    
   JRadioButton jRadioButton3; 
    // Declaration of object of JButton class. 
    JButton jButton; 
  
    // Declaration of object of ButtonGroup class. 
    ButtonGroup G1; 
  
    // Declaration of object of  JLabel  class. 
    JLabel L1; 
  
    // Constructor of Demo class. 
    public OnlineExam() 
    { 
  
        // Setting layout as null of JFrame. 
        this.setLayout(null);
  
        // Initialization of object of "JRadioButton" class. 
        jRadioButton1 = new JRadioButton(); 
  
        // Initialization of object of "JRadioButton" class. 
        jRadioButton2 = new JRadioButton(); 
        jRadioButton3 = new JRadioButton();
         // Initialization of object of "JButton" class. 
        jButton = new JButton("Next"); 
  
        // Initialization of object of "ButtonGroup" class. 
        G1 = new ButtonGroup(); 
  
        // Initialization of object of " JLabel" class. 
        L1 = new JLabel("What is the captial city of Canada?"); 
  
        // setText(...) function is used to set text of radio button. 
        // Setting text of "jRadioButton2". 
        jRadioButton1.setText("Ottawa"); 
  
        // Setting text of "jRadioButton4". 
        jRadioButton2.setText("Toronto"); 
  
        jRadioButton3.setText("Montreal"); 
  
        // Setting Bounds of "jRadioButton2". 
        jRadioButton1.setBounds(220, 30, 120, 50); 
  
        // Setting Bounds of "jRadioButton4". 
        jRadioButton2.setBounds(350, 30, 80, 50); 
  
        jRadioButton3.setBounds(480, 30, 80, 50); 
        
        // Setting Bounds of "jButton". 
        jButton.setBounds(125, 90, 80, 30); 
  
        // Setting Bounds of JLabel "L2". 
        L1.setBounds(20, 30, 550, 50); 
  
        // "this" keyword in java refers to current object. 
        // Adding "jRadioButton2" on JFrame. 
        this.add(jRadioButton1); 
  
        // Adding "jRadioButton4" on JFrame. 
        this.add(jRadioButton2);
        
        this.add(jRadioButton3);
        // Adding "jButton" on JFrame. 
        this.add(jButton); 
  
        // Adding JLabel "L2" on JFrame. 
        this.add(L1); 
  
        // Adding "jRadioButton1" and "jRadioButton3" in a Button Group "G2". 
        G1.add(jRadioButton1); 
        G1.add(jRadioButton2); 
        G1.add(jRadioButton3);
        
        
    jButton.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent e) 
     { 
                // Override Method 
  
                // Declaration of String class Objects. 
                String ans = " "; 
  
                // If condition to check if jRadioButton2 is selected. 
                if (jRadioButton1.isSelected()) { 
  
                    ans = "Answer is correct"; 
                } 
  
                else if (jRadioButton2.isSelected() || jRadioButton3.isSelected()) { 
  
                    ans = "Answer is incorrect"; 
} 
JOptionPane.showMessageDialog(OnlineExam.this, ans); 
   
}   
});
        
} 




     public static void main(String args[]) 
     { // Creating object of demo class. 
        OnlineExam f = new OnlineExam(); 
  
        // Setting Bounds of JFrame. 
        f.setBounds(500, 100, 1400, 2200); 
  
        // Setting Title of frame. 
        f.setTitle("Final Exam"); 
  
        // Setting Visible status of frame as true. 
        f.setVisible(true); 
    }
    
   

}
