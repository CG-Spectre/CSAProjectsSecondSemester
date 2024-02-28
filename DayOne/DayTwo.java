
/**
 * This DayTwo class represents . . .
 *
 * @author  (your name)ArrayList<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.remove(2);
list.add(3);
System.out.println(list);
 * @version (todays date)
 */
import java.util.ArrayList;
public class DayTwo
{
    public static void main(String[] args){
        int myInt; // declare int
        myInt = 12345; // initialize int
        System.out.println(myInt); // print int
        System.out.println((myInt/1000)%10);
        
        int[] myIntArr = new int[5]; // declare and initialize int array of length 5
        
        for(int i = 0; i < myIntArr.length; i++){
            int tenToPow = 1; // this and 4 below lines are used so I dont have to use the Math.pow method
            for(int t = 0; t < myIntArr.length - i - 1; t++){ // iterate forward
                tenToPow*=10;
            }
            myIntArr[i] = ((int)(myInt/(tenToPow)))%10; // extract int from the larger integer and add it to the array at i
            System.out.print(myIntArr[i] + " "); // print item
        }
        
        System.out.print("\n"); // new line
        
        int[] myIntArrRev = new int[5]; // declare and initialize int array of length 5
        for(int i = myIntArr.length - 1; i >= 0; i--){ // iterate backward
            int tenToPow = 1;// this and 4 below lines are used so I dont have to use the Math.pow method
            for(int t = 0; t < myIntArr.length - i - 1; t++){
                tenToPow*=10;
            }
            myIntArrRev[i] = ((int)(myInt/(tenToPow)))%10;// extract int from the larger integer and add it to the array at i
            System.out.print(myIntArrRev[i] + " "); // print item
        }
        
        ArrayList<Integer> myIntList = new ArrayList<Integer>(); // declare new array list of integer type
        System.out.print("\n"); // new line
        for(int i = 0; i < myIntArr.length; i++){ // iterate forward
            int tenToPow = 1;// this and 4 below lines are used so I dont have to use the Math.pow method
            for(int t = 0; t < myIntArr.length - i - 1; t++){
                tenToPow*=10;
            }
            myIntList.add(((int)(myInt/(tenToPow)))%10); // extract int from larger int and append it to the list
            System.out.print(myIntList.get(i) + " "); // print item
        }
        
        System.out.print("\n"); // new line
        for(int i = myIntArr.length - 1; i >= 0; i--){ // iterate backward
            int tenToPow = 1;// this and 4 below lines are used so I dont have to use the Math.pow method
            for(int t = 0; t < myIntArr.length - i - 1; t++){
                tenToPow*=10;
            }
            myIntList.add(((int)(myInt/(tenToPow)))%10);// extract int from larger int and append it to the list
            System.out.print(myIntList.get(i) + " ");// print item
        }
    }
}
