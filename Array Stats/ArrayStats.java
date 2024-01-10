
/**
 * This ArrayStats class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class ArrayStats
{
    public static double findMean(int[] arr){
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum/arr.length;
    }
    public static int findMedian(int[] arr){
        return arr[arr.length/2];
    }
    public static int findMode(int[] arr){
        String numsDone = "";
        int maxFound = -1;
        int max = -1;
        for(int i : arr){
            if(numsDone.indexOf(i+"") == -1){
                int found = 0;
                for(int t : arr){
                    if(t == i){
                        found++;
                    }
                }
                if(found > maxFound){
                    maxFound = found;
                    max = i;
                }
            }
        }
        return max;
    }
}
