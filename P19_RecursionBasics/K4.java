//Printing numbers in increasing order using RECURSION
public class K4 {
    public static void main(String args[]){
        int n=10;
        increasingOrder(n);
    }

    public static void increasingOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
    }
}
