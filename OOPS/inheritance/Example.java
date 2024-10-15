

public class Example {
    
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
}
// base class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }

}
// Derived class / sub class
class fish extends Animal{
    int fish ;
    
     void swin(){
        System.out.println("swinms in water");
     }
    
}
