
/**
 *
 * 
 * Part 1
 * 
 * @author Michael Kölling and David J. Barnes, modified by Zakaria Farah
 * 
 * @version 2019 . 01 .25
 */
public class ClockDisplay12
{
    
    private NumberDisplay hours;
    private NumberDisplay minutes;
    
    private String Display;
    
    public final String AM = "a.m";
    public final String PM = "p.m";
    
    private String  AMPM;
    
    /**
     * Constructor for ClockDisplay Objects. This constructor 
     * creates a new clock set at 12:00 am.
     */
    public ClockDisplay12()
    {
        hours = new NumberDisplay(12);
        
        minutes = new NumberDisplay(60);
        
        AMPM = AM;
        
        updateDisplay();
        
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay12 (int hour, int minute, String Display)
    
    {
         
        hours = new NumberDisplay(13);
        
        minutes = new NumberDisplay(60);
        
        setTime(hour, minute, Display);
    }

    /**
     * 
     */
    public void timeTick ()
    {
        minutes.increment();
        
        if(minutes.getValue() == 0) {  // Oh, yes it rolled over!
            
            hours.increment();
            
            if(hours.getValue() == 00){
                hours.setValue(13);
                if(AMPM.equals("p.m")){
                    AMPM = "a.m";
                }
                else{
                    AMPM = "p.m";
                }
                
            }
            
        }
        updateDisplay();
        
    }

    /**
     * This sets up specified hour and minute inputed by the uer
     * 
     * 
     * 
     */
    public void setTime(int hour, int minute, String display)
    {
        hours.setValue(hour);
        
        minutes.setValue(minute);
        
        if (display.equals(AM)){
            
            AMPM = AM;
        }
        
       else if (display.equals(PM)){
           
            AMPM = PM;
        }
        
        else{
            
            AMPM  = AM;
        }
        
       
      
        updateDisplay();
    }

    /**
     * This return the current time 
     */
    public String getTime()
    {
        return Display;
    }
    
    /**
     * this updates the string that displays am or pm.
     */
    private void updateDisplay()
    {
        if (hours.getValue() == 0){
            
            for (int i = 0; i < 12; i++){
          
                hours.increment();
            }
        }
        
       if ((hours.getValue() > 0) && (hours.getValue() < 10)){
        
        String timeDisplay = (hours.getDisplayValue()).substring(1); 
        
        Display = timeDisplay + ":" + minutes.getDisplayValue() + AMPM;
            
            
                            
          }
          
          else{
              
        Display = hours.getDisplayValue() + ":" +  minutes.getDisplayValue() + AMPM;
               
   }
   
    }
}
