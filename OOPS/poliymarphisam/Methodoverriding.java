public class Methodoverriding {
    public static void main(String [] args){
        deer d1 = new deer();
        d1.eat();
        Animal d2 = new Animal();
        d2.eat();
    }
}

class Animal {
    void eat(){
        System.out.println("eat any thing");
    }
   
}
class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}


