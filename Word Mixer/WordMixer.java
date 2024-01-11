/**
 * This class takes a string array (representing words in a sentence), 
 * and mixes up the inside letters of each word (the first and last letters
 * are left in place). The words themselves are left in same order in the array.
 * The effect is to produce a sentence that is still 'readable'.
 * For example: "the quick brown fox jumped over the lazy dog"
 * could become "the qicuk borwn fox jmupde oevr the lzay dog"
 * Words of three or less letters are (by definition) left as is.
 * A mixed up word must also be different than the original word.
 * The mixed up letters must be randomly ordered, meaning that 
 * generating exactly the same results each time is not allowed.
 *
 * @author  
 * @version 
 */
public class WordMixer
{
    /**
     * 
     * 
     * Removes the character in word at position index
     */
    public static String removeLetterAtIndex(String word, int index)
    {
        return word.substring(0, index) + word.substring(index + 1, word.length());    // replace this line
    }

    /**
     * Returns a mixed up word the same length as the orginal word.
     * The first and last letters remain the same.
     * For a word with more than three letters, the mixed up word
     * must be different than the original word.
     * Returns a random mixed up word each time the method is called.
     */
    public static String mixUpWord(String word)
    {
        if(word.length() < 4){
            return word;
        }
        String oldWord = word;
        String[] middle = new String[word.length() - 2];
        for(int i = 1; i < word.length() - 1; i++){
            middle[i - 1] = word.substring(i, i+1);
        }
        while(word.equals(oldWord) && word.length() != 3){
            String indexesUsed = "";
            for(int i = 0; i < middle.length; i++){
                String t = middle[i];
                int index = -1;
                while(index < 0 || indexesUsed.indexOf(index + "") > -1){
                    index = (int)(Math.random()*middle.length);
                }
                indexesUsed += index;
                word = word.substring(0, index + 1) + t + word.substring(index + 2, word.length());                
            }
        }
        return word;
    }

    /**
     * Returns an array of mixed up words.
     * The length (number of elements) in both arrays are the same.
     * The word order in both arrays remains the same.
     * Only the individual words are mixed up.
     * The method parameter words array must remain unchanged.
     */
    public static String[] mixItUp(String[] words)
    {
        String[] newArr = words.clone();
        for(int i = 0; i < words.length; i++){
            newArr[i] = mixUpWord(words[i]);
            
        }
        return newArr;    // replace this line
    }
}
