
/**
 * This Practice3 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import java.util.ArrayList;
public class Practice3
{
    public static void main(String[] args){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 20; i++){
            arr.add((double)(Math.random()*121));
            System.out.print(arr.get(i) + " ");
        }
        int sum = 0;
        for(double i : arr){
            sum += i;
        }
        System.out.println("\nAverage: " + ((double)sum/arr.size()));
        for(int i = arr.size() - 1; i >= 0; i--){
            if(arr.get(i) < 50 || arr.get(i) > 100){
                arr.remove(i);
            }else{
                System.out.print(arr.get(i) + " ");
            }
        }
        int currentRun = 0;
        int longestRun = 0;
        for(double i : arr){
            if(i >= 60){
                currentRun++;
                if(currentRun > longestRun){
                    longestRun = currentRun;
                }
            }else{
                currentRun = 0;
            }
        }
        System.out.println("\nLongest run: "+ longestRun);
    }
}
