import java.util.ArrayList;
/**
 * This class represents a list of the climbs by the members
 * of a climbing club.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
     * Guaranteed not to be null. Contains only non-null references. 
     */
    private ArrayList<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object. */
    public ClimbingClub()
    { 
        climbList = new ArrayList<ClimbInfo>(); 
    }

    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimb(String peakName, int climbTime)
    { 
      //climbList.add(new ClimbInfo(peakName, climbTime));
      //ArrayList<ClimbInfo> temp = new ArrayList<ClimbInfo>();
      int index = 0;
      boolean keepGoing = true;
      while(keepGoing && index < climbList.size()){
          if(peakName.compareTo(climbList.get(index).getName()) > 0){
              index++;
          }else{
              keepGoing = false;
          }
          
          }
      climbList.add(index, new ClimbInfo(peakName, climbTime));
    }

    /** @return the number of distinct names in the list of climbs */ 
    public int distinctPeakNames()
    { /* given an alphabetical list, determine the number of unique peak names */
        int count = 0;
        ArrayList<String> names = new ArrayList<String>();
        for(int i = 0; i < climbList.size(); i++){
            if(!names.contains(climbList.get(i).getName())){
                names.add(climbList.get(i).getName());
                count++;
            }
        }
        return count;
    }
}