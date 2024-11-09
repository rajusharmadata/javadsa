// Merge sort
public class Main {
 // This is a printArr function.it use to print the array
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // merge sort function 
    public static void mergesort(int arr[],int si, int ei){
        // base case 

        if(si>=ei){
            return;
        } 


        int mid = si+ (ei - si)/2;
        mergesort(arr, si, mid);// left array  part sort 
        mergesort(arr, mid+1, ei);// right array part sort 
        merge(arr,si ,mid,ei);// merge the array 
    }

    // merge 
    public static void merge(int arr[],int si,int mid,int ei){
        int i = si;
        int j = mid+1;
        int k = 0;
        
        int temp[] = new int[ei-si+1];// temperary array 

        while (i<=mid && j<=ei) {
             if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
             }else{
                temp[k] = arr[j];
                j++;
             }

             k++;
        }

        // left part 
        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        // right part  
        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        // copy temp array to orignal array 
        for( k = 0,i = si; k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
     public static void main(String [] args){
        int arr[] ={6,3,9,5,2,8};
        printArr(arr);
       mergesort(arr, 0, arr.length-1);
        printArr(arr);
     }
}