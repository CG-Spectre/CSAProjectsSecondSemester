
/**
 * This StringArray class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class StringArray
{
    public static int numInArray(String[] a, String s){
        int count = 0;
        for(String i : a){
            if(i.equals(s)){
                count++;
            }
        }
        return count;
    }
    public static String listAllNums(String[] a, String[] b){
        String found = "`";
        String str = "";
        for(String i : a){
            if(found.indexOf("`"+i+"`") == -1){
                str += i + ": " + numInArray(b, i) + "\n";
            }
        }
        return str;
    }
}
