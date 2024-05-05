import java.util.Scanner;

public class RevANo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. to Reverse:");
        int n = sc.nextInt();
        method1(n);
        method2(n);
        sc.close();
    }

    public static void method1(int n) {
        System.out.println("-----METHOD 1-----");
        while (n > 0) {
            int k = (n % 10);
            System.out.print(k);
            n = n / 10;
        }
        System.out.println();
    }

    public static void method2(int n) {
        int rev = 0;
        System.out.println("-----METHOD 2-----");        
        while (n > 0) {

            int k = (n % 10);
            rev = (rev * 10) + k;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
