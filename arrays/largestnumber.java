public class largestnumber {
    public static int largestnumber(int number[],int largest){
             for(int i=0;i<number.length;i++){
                if(largest<number[i]){
                    largest = number[i];
                }
             }
             return largest;
    }
    public static void main(String [] args){
        int number[]={4,8,785,56,755,852,854,45};
        int largest = Integer.MIN_VALUE;
        int value = largestnumber(number, largest);
        System.out.println("the largest value is :" + value);

    }
}
