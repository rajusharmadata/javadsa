public class AssimentQ2 {
    public static void sortArray(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static int findIndexPostion(int arr[] ,int target){
         int staInd = 0;
         int lasInd = arr.length-1;
         while(staInd<=lasInd){
             int mid = (staInd+lasInd)/2;
             if(arr[mid] == target){
                return mid;
             }
             if(arr[mid]<target){
                staInd = mid+1;
             }else{
                lasInd = mid -1;
             }
         }
         return -1;
    }
    public static void main(String[]args){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        sortArray(arr);
        int target = 0;
        System.out.println("index = " + findIndexPostion(arr, target));
    }
}