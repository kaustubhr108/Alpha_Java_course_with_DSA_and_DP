//Method Overloading
public class K7 {
    public static void main(String args[]) {
        Calculator c1=new Calculator();
        System.out.println("Sum 1:"+c1.sum(15, 20));
        System.out.println("Sum 1:"+c1.sum(15.27F, 20.8F));
        System.out.println("Sum 1:"+c1.sum(15, 20,25));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
