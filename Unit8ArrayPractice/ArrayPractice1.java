
/**
 * This ArrayPractice1 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class ArrayPractice1
{
    public static void main(String[] args){
        int[][] matrix = new int[3][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*16+10);
            }
        }
        System.out.println("corners sum " + (matrix[0][0] + matrix[0][4] + matrix[2][0] + matrix[2][4]));
        int sum = 0;
        for(int i = 0; i < matrix[0].length; i++){
            sum += matrix[0][i];
        }
        System.out.println("First row: " + sum);
        sum = 0;
        for(int i = 0; i < matrix[2].length; i++){
            sum += matrix[2][i];
        }
        System.out.println("Last row: " + sum);
        sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][0];
        }
        System.out.println("First column: " + sum);
        sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][4];
        }
        System.out.println("Last column: " + sum);
        int highestRow = -1;
        int highestRowValue = -1;
        for(int i = 0; i < matrix.length; i++){
            sum = 0;
            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
            if(sum > highestRowValue){
                highestRowValue = sum;
                highestRow = i;
            }
            System.out.println("Average of row " + (i+1) + " " + ((float)sum/matrix.length));
        }
        System.out.println("Highest average is column: " +( highestRow+1));
        int highestColumn = -1;
        int highestColumnValue = -1;
        for(int i = 0; i < matrix[0].length; i++){
            sum = 0;
            for(int j = 0; j < matrix.length; j++){
                sum += matrix[j][i];
            }
            if(sum > highestColumnValue){
                highestColumnValue = sum;
                highestColumn = i;
            }
            System.out.println("Average of column " + (i+1) + " " + ((float)sum/matrix.length));
        }
        System.out.println("Highest average is column: " + (highestColumn+1));
        int max = -1;
        int maxRow = -1;
        int maxColumn = -1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int val = matrix[i][j];
                if(val > max){
                    max = val;
                    maxRow = i+1;
                    maxColumn = j+1;
                }
            }
        }
        System.out.println("Max value " + max + " is in row " + maxRow + " column " + maxColumn);
    }

}
