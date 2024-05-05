import java.util.*;

public class FnOverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextFloat();
        fn(a, b);
        fn(a, b, c);
        sc.close();
    }
    public static void fn(int a,int b) {
        System.out.println("Res="+(a+b));
    }
    public static void fn(int a,int b,float c) {
        System.out.println("Res="+(a+b+c));
    }
}
