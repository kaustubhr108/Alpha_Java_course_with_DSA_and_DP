import java.util.*;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (method1(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public static boolean method1(int n) {
        boolean k = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                k = false;
                System.out.println(i);
                break;
            }
        }
        return k;
    }/*Little Error Figure out Yourself*/
}
