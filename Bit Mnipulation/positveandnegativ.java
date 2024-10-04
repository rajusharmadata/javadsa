public class positveandnegativ {
    public static int singnbit(int n){
        int bitMask = n>>31;
        if(bitMask == 0){
            return 0;
        }else{
           return 1;
        }
    }
    public static void main(String[] args) {
      int n = -100000000;
        if(singnbit(n)==0){
            System.out.println("Posativ");
        }else{
            System.out.println("negativ");
        }
    }
}
