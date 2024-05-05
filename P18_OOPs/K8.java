//Function Overriding
public class K8 {
    public static void main(String args[]){
        Deer d1=new Deer();
        d1.eat();// calls child fn
    }
}

class Animal{
    void eat(){
        System.out.println("Eats Anything")
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}