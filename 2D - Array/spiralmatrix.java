// ask as google and adobe and microsoft and apple

import java.io.StreamCorruptedException;

public class spiralmatrix {
    public static void spiralmatrix(int matrix[][]){
        int strRow = 0;
        int strCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix.length -1;
        while (strRow<=endRow && strCol<= endCol ) {
            // top
            for(int j = strCol;j<=endCol;j++ ){
                System.out.print(matrix[strRow][j] + " ");
            }
            // right
            for(int i =  strRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for(int i = endCol-1;i>=strCol;i--){
                if(strRow == endRow){
                  break;
                }
                System.out.print(matrix[endRow][i]+ " ");

            }
            // left
            for(int j = endRow-1;j>=strRow+1;j--){
                if(strCol == endCol){
                    break;
                }
                System.out.print(matrix[j][strCol]+ " ");
            }
            // updation
            strRow++;
            strCol++;
            endRow--;
            endCol--;
            
          
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}

                        };
                        spiralmatrix(matrix);
    }
}
