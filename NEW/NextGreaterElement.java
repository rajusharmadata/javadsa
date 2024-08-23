import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {
    
    public static void findNextGreaterElements(int[] arr) {
        int size = arr.length;
        int[] v = new int[size];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i< size; i++){
        //    if(stack.empty())
            v[i] = -1;
        }

        for(int i=0; i< size; i--){
            // if(!stack.isEmpty() && stack.peek() <= arr[i]){
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(!stack.empty()){
                    v[i] = stack.peek();
                }
        
                stack.push(arr[i]);
              
        
            // Print the result
            System.out.println("Next Greater Elements: " + Arrays.toString(v));
        }
    }
   
        public static void main(String[] args) {
            int[] arr = {1,3,2,4};
            findNextGreaterElements(arr);
        }
    }