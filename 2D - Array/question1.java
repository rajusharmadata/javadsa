import java.util.*;
public class question1 {
    // search a Iteam & key 
    public static boolean Search(int matrix[][],int key){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                if(matrix[i][j]==key){
                    System.out.println("index is (" + i + " " + j + " )");
                    return true;
                }
            }
        }
        System.out.println("index is not found ");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int matrix[][] = new int [3][3];
        int m = matrix.length,n = matrix[0].length;
        // input 

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int key = 7;
        Search(matrix, key);
    }
}
