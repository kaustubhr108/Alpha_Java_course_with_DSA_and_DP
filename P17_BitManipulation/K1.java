//To find whether a number is ODD or EVEN using binary operation
public class K1 {
    public static void oddOrEven(int n) {
        int bitmask = 1;// no with which we will perform operation with 'n'
        if ((n & bitmask) == 0)// Even Condition
        {
            System.out.println("Even Number");
        } else
            System.out.println("Odd Number"); // Odd Condition
    }

    public static void main(String[] args) {
        int a = 12;
        oddOrEven(a);
    }
}