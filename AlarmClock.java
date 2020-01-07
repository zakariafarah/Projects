
/**
 * Part 3
 *
 * @author Zakaria Farah
 * 
 * @version 2019 . 01.25
 */
public class AlarmClock
{
    
    private ClockDisplay12 time;
    
    private Alarm alarm;

     /**
     * Constructor for objects of class AlarmClock
     * 
     */
    public AlarmClock()
    {
        time = new ClockDisplay12();
        
        alarm = new Alarm();
    }
    /**
     * Set the clock time.
     * 
     * @param hour 
     * 
     * @param minute
     * 
     * @param AMPM
     */
    public void setTime (int hour, int minute, String AMPM)
    {
        time.setTime(hour, minute, AMPM);
    }
    /**
     * Set the alarm time.
     * 
     * @param hour 
     * 
     * @param minute
     * 
     * @param AMPM
     */
    public void setAlarmTime(int hour, int minute, String AMPM)
    {
        alarm.setTime(hour, minute, AMPM);
    }
    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     * If the alarm is on it will ring.
     */
    public void ClockTick()
    {
        time.timeTick();
        
        if(time.getTime().equals(alarm.getTime())){
            
            System.out.println ("Ring Ring Ring");
            alarm.TurnOff();
        }
    }
    
    /**
     * Sets the  alarm on
     *
     */
    public void setAlarm()
    {
        alarm.TurnOn();
    }
    
    /**
     * this sets the alarm off
     *
     */
    public void unsetAlarm()
    {
        alarm.TurnOff();
    }
    /**
     * 
     * This method returns the current time.
     * 
     * 
     */
    public String getTime()
    {
        return time.getTime();
    }
    /**
     * 
     * This method returns the current alarm time.
     * 
     * 
     */
    public String getAlarmTime()
    {
        return alarm.getTime();
    }
    /**
     *  This method will return true if alarm is set.
     * 
     * 
     */
    public Boolean isAlarmSet()
    {
      return alarm.isSet();
    }
}
