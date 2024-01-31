
/**
 * This Practice1 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Practice1
{
    
    public static void main(String[] args){
        int[] arr = new int[10]; // declare and initialize variable with 10 elements
        for(int i = 0; i < arr.length; i++){ // loop through above array
            arr[i] = (int)(Math.random()*101); //set current value to be random int 0-100
        }
        for(int i = 0; i < arr.length; i++){ // loop through array again
            System.out.println(arr[i]); // log current variable
        }
        int min = 101; // set min value to be 1 over the max
        int max = -1; //set max value to be 1 under the min
        int sum = 0; //initinalize variable for tracking sum
        for(int i = 0; i < arr.length; i++){ // loop through 10 elements again
            if(arr[i] < min){ // check if current value is lower than the current min
                min = arr[i]; // set min to be current value
            }
            if(arr[i] > max){ // check if current value is higher than the current max
                max = arr[i]; // set max to be current value
            }
            sum+=arr[i]; // update the sum
        }
        System.out.println("Average: " + (sum/10)); // calc and log average
        System.out.println("Min: " + min + "\nMax: " + max); // log the min and maxes
        sum = 0; // reset variable for the total value of the nums in the array
        for(int i = 0; i < arr.length; i++){ // loop tjrough all 10 elements again
            if(arr[i] < 50){ // check if current value si under 50
                arr[i] = 50; // set that value to be 50
            }
            sum+=arr[i]; // uupdate sum
        }
        System.out.println("Average under 50: " + (sum/10)); //calc and log average
    }
}
