
/**
 * This ProjectThree class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class ProjectThree

{
    public static void main(String [] args) {
        String [] heroes =  {"Green Lantern","Superman","Spiderman","Hulk","Iron Man","Wonder Woman","Black Panther"}; // declare and initialize array
        String [] temp = new String[7]; // declare and itialize second array
        String done = "|"; // initialize and declare variable for keeping track of which have already been added to the array. '|' is the delimiter
        System.out.println("Alphabetically: "); // mark this as the beginning of the words organized alphabetically
        for(int i = 0; i < temp.length; i++){ //for loop header to iterate through the 7 items of the new array
            String first = heroes[0]; // set the initial alphabetically favored variable to be the first element of the heroes array
            for(int t = 0; t < heroes.length; t++){ // iterate through the heroes
                if((heroes[t].compareTo(first) < 0 || done.indexOf(first) > 0) && (done.indexOf("|"+heroes[t]+"|") < 0)){ // check if the current element should be favored
                    first = heroes[t]; // set first variable to be current element
                }
            }
            System.out.println(first); // log the element in spot i of the new array
            temp[i] = first; // set element i of new array to be the correct value
            done += first + "|"; // update the tracker variable with delimiter
        }
        heroes = temp; // update heroes
        temp = new String[7]; // set temp to be a new array
        done = "|"; // reset the teacker variable
        System.out.println("\nBy length: "); // mark this as the beginning of the words organized by length
        for(int i = 0; i < temp.length; i++){ // for loop header for iterating through the new array
            String first = heroes[0]; // set first variable to be first valjue of the array
            for(int t = 0; t < heroes.length; t++){
                if((heroes[t].length() < first.length() || done.indexOf(first) > 0) && (done.indexOf("|"+heroes[t]+"|") < 0)){ // check if current hero should be favored by length
                    first = heroes[t]; // set first to be the current variable
                }
            }
            System.out.println(first); // log the correct element in spot i
            temp[i] = first; // set correct spot in new array to be the correct element
            done += first + "|"; // update tracker variavle with delimiter
        }
        heroes = temp; // update heroes to be te correct array
    }
}
