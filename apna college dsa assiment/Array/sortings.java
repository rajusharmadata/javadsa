// Question - using following sorting algorithms to sort in array in Decending order 
// [3,6,2,1,8,7,4,5,3,1]


class sortings {
    public static void PrintArray(int arr[]){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
// 1.Bubble sort ;
public static void Bubblesort(int arr[]){
    for (int i = 0;i<arr.length-1;i++){
        for(int j = 0;j<arr.length;j++){
            if(arr[j+1]>arr[j]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

// 2.selection sort
public static void selection_sort(int arr[]){
    for(int i = 0;i<arr.length-1;i++){
        int max = i;
        for(int j = i+1;j<arr.length;j++){
            if(arr[j]>arr[max]){
                max = j;
            }
        }
        //  swap
      
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;

        
    }
}

// 3.insertion sort
public static void inseartion_sort(int arr[]){
  for(int i = 1;i<arr.length;i++){
    int curr = arr[i];
    int prev = i-1;

    while(prev>=0 && arr[prev] < curr){
        arr[prev + 1] = arr[prev];
        prev--;
    }
    arr[prev] = curr;
  }


              /*
             *  Dry run 
             * 
             * First iteration (i = 1):
curr = arr[1] = 6
prev = 0
While loop: arr[0] = 3 < curr = 6 (Condition true)
Shift: arr[1] = arr[0] = 3, array becomes: [3, 3, 2, 1, 8, 7, 4, 5, 3, 1]
prev = -1 → Exit loop
Set arr[0] = 6
Array after 1st iteration:
[6, 3, 2, 1, 8, 7, 4, 5, 3, 1]

Second iteration (i = 2):
curr = arr[2] = 2
prev = 1
While loop: arr[1] = 3 > curr = 2 (Condition false)
Exit loop.
No shift is required, array remains the same.
Array after 2nd iteration:
[6, 3, 2, 1, 8, 7, 4, 5, 3, 1]

 so own'
             */
}
public static void main(String[] args) {
    int arr[] = {3,6,2,1,8,7,4,5,3,1};
    System.out.println("After sorting.......... ");
    System.out.println();
    PrintArray(arr);
    System.out.println();
    System.out.println("before sorting ................... ");
    inseartion_sort(arr);
    PrintArray(arr);
}

    
}