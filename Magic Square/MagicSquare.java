/**
 * This class has methods to determine if a square 2-dimensional array is a Magic Square
 * 
 * Square array ->      a 2D array where the number of rows and columns are the same
 * Rectangular array -> a 2D array where the number of rows and columns may be different,
 *                      but the number of columns is the same for each row
 *
 * @author 
 * @version 
 */
public class MagicSquare
{    
    /** Determines if a given 2D array is square */
    public boolean isSquareArray(int[][] array)
    {
        for(int i = 0; i < array.length; i++){
            if(array[i].length != array.length){
                return false;
            }
        }
        return true;
    }
    
    /** Determines if a given number appears only once in a 2D array */
    public boolean isNumberUnique(int[][] array, int number)
    {
        boolean appeared = false;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == number){
                    if(appeared){
                        return false;
                    }
                    appeared = true;
                }
            }
        }
        return appeared;   // replace this line
    }
    
    public boolean isEveryNumberUnique(int[][] array)
    {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(!isNumberUnique(array, array[i][j])){
                    return false;
                }
            }
        }
        return true;        
    }
    
    /** Returns the sum of a given column of a 2D rectangular array */    
    public int colSum(int[][] array, int col)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i][col];
        }
        return sum;       // replace this line
    }

    /** Returns the sum of a given row of a 2D rectangular array */
    public int rowSum(int[][] array, int row)
    {
        int sum = 0;
        for(int i = 0; i < array[row].length; i++){
            sum += array[row][i];
        }
        return sum; 
    }

    /** 
     *  Determines if the given square 2D array is a Semi-Magic Square.
     * 
     *  A Semi-Magic Square is where all of the rows and columns
     *  of a square 2D integer array sum to the same value.
     */
    public boolean isSemiMagicSquare(int[][] array)
    {
        if(!isEveryNumberUnique(array)){
            return false;
        }
        int firstVal = -1;
        for(int i = 0; i < array.length; i++){
            int valSum = rowSum(array, i);
            if(firstVal == -1){
                firstVal = valSum;
            }else if(firstVal != valSum){
                return false;
            }
            
        }
        for(int i = 0; i < array[0].length; i++){
            int valSum = rowSum(array, i);
            if(firstVal != valSum){
                return false;
            }
        }
        return true;   // replace this line
    }

    /** 
     *  Returns the sum of the first diagonal (upper left to lower right)
     *  of a square 2D array
     *  @Precondition: square is a square array
     */    
    public int firstDiagonalSum(int[][] square)
    {
        int sum = 0;
        for(int i = 0; i < square.length; i++){
            sum += square[i][i];
        }
        return sum;
    }

    /** 
     *  Returns the sum of the second diagonal (lower left to upper right)
     *  of a square 2D array
     *  @Precondition: square is a square array
     */    
    public int secondDiagonalSum(int[][] square)
    {
        int sum = 0;
        for(int i = 0; i < square.length; i++){
            sum += square[i][square[i].length - 1 - i];
        }
        return sum;
    }

    /** 
     *  Determines if the given square 2D array is a Magic Square.
     * 
     *  A Magic Square is a Semi-Magic Square but where both diagonals
     *  also sum to the same value as the rows and columns.
     */
    public boolean isMagicSquare(int[][] array)
    {
        
        if(!isEveryNumberUnique(array)){
            return false;
        }
        int firstVal = -1;
        for(int i = 0; i < array.length; i++){
            int valSum = rowSum(array, i);
            if(firstVal == -1){
                firstVal = valSum;
            }else if(firstVal != valSum){
                return false;
            }
            
        }
        for(int i = 0; i < array[0].length; i++){
            int valSum = rowSum(array, i);
            if(firstVal != valSum){
                return false;
            }
        }
        if(!(firstVal == secondDiagonalSum(array) && firstVal == firstDiagonalSum(array))){
            return false;
        }
        return true;   // replace this line
    }

    /** 
     *  Returns the sum of the first diagonal (upper left to lower right)
     *  with a row offset of a square 2D array (includes broken diagonals)
     *  @Precondition: square is a square array
     */    
    public int firstDiagonalSum(int[][] square, int rowOffset)
    {
        int sum = 0;
        int leftOver = square.length;
        for(int i = rowOffset; i < square.length; i++){
            sum += square[i][i-rowOffset];
            leftOver--;
        }
        for(int i = 0; i < leftOver; i++){
            sum += square[i][square.length-(leftOver-i-1)-1];
        }
        return sum;
    }

    /** 
     *  Returns the sum of the first broken diagonal (lower left to upper right)
     *  with a row offset of a square 2D array (includes broken diagonals)
     *  @Precondition: square is a square array
     */    
    public int secondDiagonalSum(int[][] square, int rowOffset)
    {
        int sum = 0;
        int count = rowOffset;
        int leftOver = square.length;
        for(int i = square.length - 1; i >= rowOffset; i--){
            sum += square[i][count];
            count++;
            leftOver--;
        }
        count = 0;
        if(rowOffset > 0){
            for(int i = rowOffset - 1; i >= 0; i--){
                sum += square[i][count];
                count++;
            }
        }
        return sum;
    }
    
    /** 
     *  Determines if the given square 2D array is a Pan Magic Square.
     * 
     *  A Pan Magic Square is Magic Square but where the 'broken' diagonals
     *  also sum to the same value as both primary diagonals and the rows 
     *  and columns. 
     */
    public boolean isPanMagicSquare(int[][] array)
    {
        if(!isEveryNumberUnique(array)){
            return false;
        }
        int firstVal = -1;
        for(int i = 0; i < array.length; i++){
            int valSum = rowSum(array, i);
            if(firstVal == -1){
                firstVal = valSum;
            }else if(firstVal != valSum){
                return false;
            }
            
        }
        for(int i = 0; i < array[0].length; i++){
            int valSum = rowSum(array, i);
            if(firstVal != valSum){
                return false;
            }
        }
        if(!(firstVal == secondDiagonalSum(array) && firstVal == firstDiagonalSum(array))){
            return false;
        }
        for(int i = 1; i < array.length - 1; i++){
            if(!(firstVal == secondDiagonalSum(array, i) && firstVal == firstDiagonalSum(array, i))){
                return false;
            }
        }
        return true;   // replace this line
    }
}
