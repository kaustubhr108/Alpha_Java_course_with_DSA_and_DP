//To UPDATE the 'i-th' bit of a number's binary representation
public class K5 {
    public static void updateIBitAPP1(int n, int i, int newBit) {
        // STEP 1 - Clearing the i-th bit
        int bitmask = ~(1 << i);
        n = n & bitmask;

        // STEP 2 - Making new Bitmask
        bitmask = newBit << i;

        // STEP 3 - Performing OR(|) bw 'n' and 'bitmask'
        System.out.println("Answer:- " + (n | bitmask));// Answer:- 14 --->1110
    }

    public static void main(String[] args) {
        int a = 10;// no to UPDATE the 'i-th' bit of (10--->1010)
        int i = 1; // 'i-th' place to UPDATE (CLEAR OR SET) the bit
        int newBit = 0;// we are SETTING the i-th bit (2nd bit) bit to 1
        updateIBitAPP1(a, i, newBit);
    }
}

/*
 * Approach 2:-
 * if(newBit==0)
 * {
 * return clearIBit(n,i);
 * }
 * else
 * {
 * return setIBit(n,i);
 * }
 */