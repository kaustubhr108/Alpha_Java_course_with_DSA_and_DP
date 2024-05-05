// Fast Exponentiation (a^n)
public class K10 {
    public static void fastExpo(int a,int n) {
        int ans=1;
        while (n>0) {
            if((n & 1) !=0 ){// Checking LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println("Answer:- "+ans);
    }
    public static void main(String[] args) {
        fastExpo(3, 524);
    }
}
