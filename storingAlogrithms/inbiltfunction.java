// using inbilint  sort function in java 
import java.util.Arrays;
public class inbiltfunction {
    // print printarr is a functio to print the array 

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr,0,3);
        printArr(arr);
      

    }
}
