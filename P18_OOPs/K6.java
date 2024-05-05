//Inheritance
class K6 {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.breathe();
        shark.fins=4;
        System.out.println("Fins:"+shark.fins);
        
    }
}

class Animal{ //Base class
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{ //Derived Class
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
