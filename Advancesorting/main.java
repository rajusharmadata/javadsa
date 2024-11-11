public class main { // Class declaration

    // This function prints the elements of an array
    public static void printArr(int arr[]) {
        // Loop through the array and print each element followed by a space
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after the array is printed
    }

    // This function implements the Quick Sort algorithm
    public static void quicksort(int arr[], int si, int ei) {
        // Base case: If the start index is greater than or equal to the end index, return (array is already sorted)
        if (si >= ei) {
            return;
        }

        // Partition the array and get the partition index
        int partindx = partition(arr, si, ei);

        // Recursively sort the left part (elements before the pivot)
        quicksort(arr, si, partindx - 1);

        // Recursively sort the right part (elements after the pivot)
        quicksort(arr, partindx + 1, ei);
    }

    // This function performs the partition step of Quick Sort
    public static int partition(int[] arr, int si, int ei) {
        int i = si - 1; // Pointer for elements smaller than the pivot
        int pivot = arr[ei]; // Choose the last element as the pivot

        // Traverse the array from start index to end index - 1
        for (int j = si; j < ei; j++) {
            // If the current element is less than or equal to the pivot, swap it with a smaller element
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Move the pivot to its correct position (i+1)
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;

        // Return the partition index
        return i;
    }

    // Main function
    public static void main(String[] args) {
        // Initialize an array
        int arr[] = {6, 3, 9, 5, 2, 8};

        // Call the Quick Sort function on the entire array
        quicksort(arr, 0, arr.length - 1);

        // Print the sorted array
        printArr(arr);
    }
}
