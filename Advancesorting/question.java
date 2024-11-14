/*
 
    Search in Rotated sorted Array 

    input : sorted rotated Array with distinct numbers (in ascending order it si rotated a pivot point find it is rotated a pivot point find The index of given element)
 */
 
public class question {
    public static int Search(int arr[] ,int tar,int si,int ei){
        

        // Kamm
        
        int mid = si + (ei-si)/2;

        if(arr[mid] ==tar){
            return mid;
        }
        // case 1:
        if(arr[si]<= arr[mid]){
            // case a.
            if(arr[si]<=tar && tar<= arr[mid]){
                
            }
        }

    }
    public static void main(String [] args){
        int arr[] = {4,5,6,7,0,1,2};
        int index = Search(arr, 0,0, arr.length-1);
        System.out.println(index);
    }
    
}
