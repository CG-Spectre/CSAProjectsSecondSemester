/**
 * This class represents a mountain climbing event
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    private String name;
    private int time;
    public ClimbInfo(String name, int time){
        this.name = name;
        this.time = time;
    }
    public String getName(){
        return name;
    }
    public int getTime(){
        return time;
    }
}
