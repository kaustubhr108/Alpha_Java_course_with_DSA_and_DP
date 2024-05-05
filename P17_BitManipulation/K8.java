//To check if a number is POWER of 2 or NOT
public class K8 {

    public static void isPowerOfTwo(int n) {
        if ((n & n - 1) == 0) 
        {
            System.out.println(n + " is a POWER OF 2");
        } 
        else
            System.out.println(n + " is not a POWER OF 2");
    }

    public static void main(String[] args) {
        isPowerOfTwo(8);
    }
}   
