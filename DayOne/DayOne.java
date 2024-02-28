
/**
 * This NewDay class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import java.util.ArrayList;
public class DayOne
{
    
    public static void main(String[] args){
        // declare and initialize array
        String[] namesArray = new String[5];
        namesArray[0] = "Grumpy";
        namesArray[1] = "Sleepy";
        namesArray[2] = "Happy";
        namesArray[3] = "Sadness";
        namesArray[4] = "Joy";
        
        //print all nams
        for(String i : namesArray){
            System.out.print(i + " ");
        }
        
        // new line
        System.out.print("\n");
        
        // declare and initialize array list and assign values
        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Femur");
        namesList.add("Elbow");
        namesList.add("Knee");
        namesList.add("Heel");
        namesList.add("Skull");
        
        //print all values
        for(int i = 0; i < namesList.size(); i++){
            System.out.print(namesList.get(i) + " ");
        }
        
        // new line
        System.out.print("\n");
        String[] tmpNames = new String[4];
        int counter = 0;
        int index = 0;
        
        // loop through all anmes
        for(String i : namesArray){
            // exclude index 2
            if(counter != 2){
                tmpNames[index] = i;
                index++;
            }
            counter++;
        }
        
        namesArray = tmpNames;
        // print new array
        for(String i : namesArray){
            System.out.print(i + " ");
        }
        
        System.out.print("\n");
        //remove second element
        
        namesList.remove(2);
        // print elements
        
        for(int i = 0; i < namesList.size(); i++){
            System.out.print(namesList.get(i) + " ");
        }
        
        System.out.print("\n");
    }
}
