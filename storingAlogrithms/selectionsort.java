public class selectionsort {
    public static void selectionsort(int arr[]){
         for(int i = 0;i<arr.length-2 ; i++){
            int smallest = Integer.MAX_VALUE;
          for(int j =i+1; j<arr.length-1;j++){
            if(smallest>arr[i]){
                 smallest  = arr[j] ;
            }
            smallest =  Math.min(smallest, arr[j]);
          }
         }
    }
    public static void main (String[]args){
    int arr[] = {5,4,1,3,2};
    selectionsort(arr);
    for(int i = 0; i<arr.length-1;i++){
        System.out.print(arr[i] + " ");
    }
    }
}
