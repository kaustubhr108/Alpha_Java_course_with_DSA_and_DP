//To CLEAR the RANGE of given BITS (i to j) of number 
public class K7 {

    public static void clearRangeIJBits(int n, int i, int j) {
        int a = (-1 << (j + 1)); // or (~0<<(j+1))
        int b = ((1 << i) - 1);
        int bitmask = a | b;
        System.out.println("Answer:- " + (n & bitmask));
    }

    public static void main(String[] args) {
        clearRangeIJBits(10, 2, 4);
    }
}
