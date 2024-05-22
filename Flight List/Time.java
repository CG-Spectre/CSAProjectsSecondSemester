
/**
 * This Time class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Time
{
    private int hour;
    private int minute;
    
    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    public int getHours(){
        return hour;
    }
    public int getMinutes(){
        return minute;
    }
    public void setTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    public boolean isValidTime(){
        return (minute <= 59 && minute >= 0) && (hour <= 23 && hour >= 0);
    }
    public String toString(){
        return (""+hour).length() < 2 ? "0" + hour : hour + "" + ":" + ((""+minute).length() < 2 ? "0" + minute : minute + "");
    }
    public int minutesUntil(Time another){
        int hoursDifference = another.getHours() - hour;
        int minutesDifference = another.getMinutes() - minute;
        return hoursDifference*60 + minutesDifference;
    }
}
