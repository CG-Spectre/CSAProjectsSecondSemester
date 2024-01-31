public class HorseBarn
{
    /** The spaces in the barn.  Each array element hold a reference to the horse
     *  that is currently occupying the space.  A null value indicates an empty space.
     */
    private Horse[] spaces;
    
    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }
    
    
    /** Returns the index of the space that contains the horse with the specified name.
     *  Precondition: No two horses in the barn have the same name.
     *  @param name the name of the horse to find
     *  @return the index of the space containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name)
    {
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] == null){
                continue;
            }
            if(spaces[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    /** Consolidates the barn by moving horses so that the horses are in adjacent spaces,
     * starting at index 0, with no empty space between any two horses.
     * Postcondition: The order of the horses is the same as before the consolidation.
     */
    public void consolidate(){
        for(int i = 0; i < spaces.length; i++){ // loop through spaces
            if(spaces[i] == null){ // check if space is empty
                // find horse after a space
                boolean moved = false; // declare and initialize variable that tells when to stop moving elements
                for(int t = i + 1; t < spaces.length; t++){ // loop through spaces after the current space in the parent loop
                    if(spaces[t] != null && !moved){ // check if theres a space there and we havent already moved a horse
                        spaces[i] = spaces[t]; // update the empty space to be the current space in the nested loop
                        spaces[t] = null; // empty the space in the nested loop to ensure horses arent duplicated
                        moved = true; // update the moved variable
                    }
                }
            }
        }
    }
}
