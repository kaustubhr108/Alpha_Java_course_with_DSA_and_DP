import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No. to Check:");
        int n = sc.nextInt();
        method1(n);
        method2(n);
        sc.close();
    }

    // method 1
    public static void method1(int n) {
        boolean k = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                k = false;
                System.out.println(i);
                break;
            }
        }
        System.out.println(k);

    }

    // method 2
    public static void method2(int n) {
        int c = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("Composite");
        } else
            System.out.println("PRIME");
    }
}
