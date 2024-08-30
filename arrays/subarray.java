public class subarray {
   public static void subarray(int arr[]){
    int sub = 0;
    for(int i = 0;i<arr.length;i++){
        // inner loop
        
        for(int j=i;j<arr.length;j++){
            System.out.print("[");
            sub++;
            for(int k=i;k<=j;k++){
                System.out.print( " "+arr[k]+" ");
               
            }
            System.out.print("]");
        
            System.out.println();
           
        }
        
        
    }
    System.out.println("how many make a sub array " + sub);
   }
   public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    subarray(arr);
   }
}
