//Printing X^n using RECURSION {Power reduces by 1 at each step-->O(N))}
public class K11 {
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
        return x*powered(x, n-1);       
    }
}
