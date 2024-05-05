//To COUNT number of SET Bits in a number
public class K9 {

    public static void countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) // Checking the LSB in each iteration
            {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("No of SET Bits are:- " + count);
    }

    public static void main(String[] args) {
        countSetBits(15);
    }
}
