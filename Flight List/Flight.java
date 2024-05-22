
/**
 * This FLight class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Flight
{
    private String number;
    private Time departure;
    private Time arrival;
    
    public Flight(String f, Time d, Time a){
        number = f;
        departure = d;
        arrival = a;
    }
    
    public void setFlight(String f, Time d, Time a){
        number = f;
        departure = d;
        arrival = a;
    }
    
    public Time getDepartureTime(){
        return departure;
    }
    public Time getArrivalTime(){
        return arrival;
    }
    
    public String toString(){
        return number + "-" + departure + "-" + arrival + "-" + departure.minutesUntil(arrival);
    }
}
