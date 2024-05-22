
/**
 * This Trip class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import java.util.ArrayList;
public class Trip
{
    private ArrayList<Flight> flights;
    private String trip;
    
    public Trip(String s, ArrayList<Flight> f){
        flights = f;
        trip = s;
    }
    
    public int getDuration(){
        if(flights.size() == 0){
            return 0;
        }
        return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size() -  1).getArrivalTime());
    }
    
    public int getShortestLayover(){
        if(flights.size() < 2){
            return -1;
        }
        int shortest = Integer.MAX_VALUE;
        for(int i = 1; i < flights.size(); i++){
            int time = flights.get(i - 1).getArrivalTime().minutesUntil(flights.get(i).getDepartureTime());
            if(time < shortest){
                shortest = time;
            }
        }
        return shortest;
    }
    
    public String toString() 
    { 
        String t = "The " + trip + " trip itinerary is as follows:\n\n"; 
        for (int i = 0; i < flights.size(); i++) 
        { 
        t += flights.get(i); 
        if (i < flights.size() - 1) 
        { 
         t += "\nThe layover between flights is "; 
         t += flights.get(i).getArrivalTime().minutesUntil 
                   (flights.get(i + 1).getDepartureTime()); 
         t += " minutes\n\n"; 
        } 
        } 
        t += "\nThe duration of the entire trip is " + getDuration() + " minutes\n"; 
        t += "The shortest layover is " + getShortestLayover() + " minutes"; 
        return t; 
    }
}
