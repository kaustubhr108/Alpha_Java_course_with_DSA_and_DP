//To GET the 'i-th' bit of a number's binary representation
public class K2 {
    public static void getIBit(int n, int i) {
        int bitmask = 1 << i;// no with which we will perform operation with 'n'
        if ((n & bitmask) == 0) {
            System.out.printf("%d 'i-th' bit of %d is 0", i, n);
        } else
            System.out.printf("%d 'i-th' bit of %d is 1", i, n);
    }

    public static void main(String[] args) {
        int a = 15;// no to GET the 'i-th' bit of
        int i = 2; // 'i-th' place to GET the bit
        getIBit(a, i);
    }
}