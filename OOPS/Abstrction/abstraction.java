
public class abstraction {
    public static void main(String[] args) {
        Horese h = new Horese();
        h.eat();
        h.walk();
        
        cheake c = new cheake();
        c.eat();;
        c.walk();
    }
}

 abstract class Animal{
    void eat(){
        System.out.println("eats ");
    }

    abstract void walk();
}

class Horese extends Animal{
    void walk(){
        System.out.println("Hore walk 4 leags");
    }
}

class cheake extends Animal{
    void walk(){
        System.out.println("chicken walk  2 legs");
    }
}
