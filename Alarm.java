
/**
* 
* Part 2
* 
 * @author Zakaria Farah
 * @version  2019 . 01.25
 * 
 */

public class Alarm
{
   
    private ClockDisplay12 Alarm;
    
    private static Boolean Alarmsetter;
    
    private static Boolean Alarmofforon;

    /**
     * This method starts the clock dsplay at 12:00 a.m
     */
    public Alarm()
    {
        Alarm = new ClockDisplay12();
        
        Alarm.setTime(12,00, "a.m.");
        
        Alarmsetter = false;
    }

    
    /**
     * This is a constructor for objects of class Alarm
     */
    public Alarm (int hour, int minute, String day, Boolean offoron)
    
     {
      Alarm = new ClockDisplay12();
      
      Alarm.setTime(hour, minute, day);
      
      Alarmsetter = true;
      
      if(offoron == false){
          
          Alarmofforon = false;
        }
        
        else{
            
            Alarmofforon = true;
     
         
        }
    }
    
    /**
     * This sets the alarm for the time specified by the user
     * 
     */
    public void setTime(int hour, int minute, String day)
    {
        Alarm.setTime(hour, minute, day);
        
        Alarmsetter = true;
    }
    /**
     * This method turns the alarm on
     */
    public void TurnOn()
    {
        Alarmofforon = true;
    }
    /**
     
     * This method turns the alarm off
     */
        
    public void TurnOff()
        {
            Alarmofforon = false;
        
        
    }
    
    /**
    *This returns the time that the alarm is set to
    */
   
   public String getTime()
    {
        return Alarm.getTime(); 
    }
    
    /**
     * 
     * This method checks to see if the alarm is set or not
     */
    
    public boolean isSet()
    {
        if(Alarmsetter == true){
            
            return true;
        
        }
        else{
            
            return false;
            
            }
    
    
}

}