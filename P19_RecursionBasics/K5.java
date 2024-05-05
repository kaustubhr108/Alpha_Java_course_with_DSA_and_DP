//Factorial of N using RECURSION
public class K5 {
    public static void main(String[] args) {
    int a=5;
    System.out.println("Factorail : "+factorial(a));
    }

    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
//      int fnm1=factorial(n-1); finding the factorial of (n-1)
        int fn=n*factorial(n-1);
        return fn;
    }
}
