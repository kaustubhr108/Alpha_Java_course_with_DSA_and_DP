//Printing X^n(OPTIMIZED) using RECURSION
/*
 * case 1: in X^n when n=even we can write it as X^(n/2) * X^(n/2)
 * case 2: in X^n when n=odd we can write it as X * X^(n/2) * X^(n/2)
 * {Power reduces by HALF at each step-->O(logN)}
*/
public class K12 {
    public static void main(String[] args) {
        int x=2,n=10;
        System.out.println("Answer:-"+powered(x,n));
    }
    public static int powered(int x,int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        /* int halfPowerSq=powered(x, n/2)*powered(x, n/2); ---> due to this line complexity is still O(n)
            to reduce this we will calculate powered(x,n/2) and store it in a variable and later square it when needed, this reduces a
            fn call and HENCE the complexity falls to---> O(logN)
        */
        int halfPower=powered(x, n/2);
        int halfPowerSq=halfPower*halfPower;


        //now if n is odd
        if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
        //else n is even
        return halfPowerSq;
    }
}
