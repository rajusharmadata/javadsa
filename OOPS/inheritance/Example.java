// Example of inhertence 

public class Example {
    
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.eat();

        bird pupe = new bird();
        pupe.eat();
        pupe.breading();
        pupe.fly();
    }
}
/*
 * 
 * 1. Single level inhertance 
 * 
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

 */


 // 2. multlevel inhertance 

 /*
  class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }

 }

 class mameal extends Animal{
    int leg;
    void legs(int leg){
        this.leg = leg;
    }
 }

 class Dog extends mameal{
    void breads(){
        System.out.println("Dogs is breads........ ");
    }
 }
  */


  // Hierarchial Inheritence

  class Animal{
    String Animal_name;

    void eat(){
        System.out.println("eats");
    }

    void breading(){
        System.out.println("breathing");
    }
  }

  // second class
   class mameal extends Animal{
    void walk(){
        System.out.println("walks...");
    }

   }
   class bird extends Animal{
    void fly(){
        System.out.println("fly...");
    }
   }

