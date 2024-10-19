public class multipleoverloading {
// funtion overloading
// function overloading is type of compile time poloymarphisom ka hota hai 
    public static void main(String [] args){
        calculatar c = new calculatar();
        System.out.println(c.sum(4, 5));
        System.out.println(c.sum((float)4.3, (float)3.3));
        System.out.println(c.sum(4, 5,7));

    }
}
class calculatar{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    
    int sum(int a ,int b,int c){
        return a+b+c;
    }
}
