//To CLEAR the 'i-th' bit of a number's binary representation
public class K4 {
    public static void clearIBit(int n, int i) {
        int bitmask = ~(1 << i);// no with which we will perform operation with 'n'
        System.out.println("Answer:- " + (n & bitmask));
    }

    public static void main(String[] args) {
        int a = 10;// no to CLEAR the 'i-th' bit of
        int i = 1; // 'i-th' place to CLEAR the bit
        clearIBit(a, i);
    }
}