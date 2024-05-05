//To SET the 'i-th' bit of a number's binary representation
public class K3 {
    public static void setIBit(int n, int i) {
        int bitmask = 1 << i;// no with which we will perform operation with 'n'
        System.out.println("Answer:- " + (n | bitmask));
    }

    public static void main(String[] args) {
        int a = 10;// no to SET the 'i-th' bit of
        int i = 2; // 'i-th' place to SET the bit
        setIBit(a, i);
    }
}