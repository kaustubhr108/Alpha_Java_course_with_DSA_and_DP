// To CLEAR the LAST 'i-bits' of number (1111 for i=2 ---> 1100)
public class K6 {

    public static void clearAllIBits(int n, int i) {
        int bitmask = -1 << i; // (~0<<i)
        System.out.println("Answer:- " + (n & bitmask));
    }

    public static void main(String[] args) {
        clearAllIBits(15, 2);
    }
}
