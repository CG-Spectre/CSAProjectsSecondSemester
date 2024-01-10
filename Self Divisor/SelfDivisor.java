
/**
 * This SelfDivisor class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class SelfDivisor
{
    public static boolean isSelfDivisor(int number){
        int digits = (number + "").length();
        for(int i = 0; i < digits; i++){
            if(Integer.parseInt((number + "").substring(i, i+1)) == 0){
                return false;
            }
            if(number%Integer.parseInt((number + "").substring(i, i+1)) != 0){
                return false;
            }
        }
        return true;
    }
    public static int[] firstNumSelfDivisors(int start, int num){
        int[] arr = new int[num];
        int i = 0;
        while(arr[num - 1] == 0){
            if(isSelfDivisor(start)){
                arr[i] = start;
                i++;
            }
            start++;
        }
        return arr;
    }
}
