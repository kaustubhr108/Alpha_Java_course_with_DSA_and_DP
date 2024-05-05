//Abstract Class
public class K9 {
    public static void main(String args[]){
        // Hierarchy: Animal -> Horse -> Mustang
        Mustang myHorse=new Mustang();

        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.skinColor);

        Chicken c=new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.skinColor);
    }
}

abstract class Animal{
    String skinColor;
    Animal(){
        System.out.println("Animal CTor");
        skinColor="Generic";
    }
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();// idea given but no implementation
} 

class Horse extends Animal{
    Horse(){
        System.out.println("Horse CTor");
    }
    void walk(){//Horse provides implementation according to himself
        System.out.println("Walks on 4 Legs");
    }
    void changeColor(){
        skinColor="White";
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Ctor");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken CTor");
    }
    void walk(){//Chicken provides implementation according to himself
        System.out.println("Walks on 2 legs");
    }
    void changeColor(){
        skinColor="Yellow";
    }
}