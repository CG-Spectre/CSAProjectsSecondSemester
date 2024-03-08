
/**
 * This ArrayPractice2 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class ArrayPractice2
{
    public static void main(String[] args){
        int[][] arr = new int[5][5];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if((i+1) % 2 == 0){
                    arr[i][j] = (int)(Math.random()*89) + 10;
                }else{
                    arr[i][j] = (int)(Math.random()*89) + 11;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        String[][] arr2 = new String[7][7];
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                if((i+1) % 2 == 0){
                    arr2[i][j] = "+";
                }else{
                    arr2[i][j] = "-";
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }
        String[][] arr3 = new String[9][9];
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                if(i == j || i == arr3.length - j - 1){
                    arr3[i][j] = "%";
                }else{
                    arr3[i][j] = "-";
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.print("\n");
        }
        String[][] arr4 = new String[11][11];
        for(int i = 0; i < arr4.length; i++){
            for(int j = 0; j < arr4[i].length; j++){
                if(i == arr4.length/2 || j == arr4[0].length/2){
                    arr4[i][j] = "*";
                }else{
                    arr4[i][j] = "-";
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
