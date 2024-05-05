//Printing numbers in decreasing order using RECURSION
public class K2 {
    public static void main(String[] args) {
        int n=10;  
        decreasingOrder(n);
    }
  
    public static void decreasingOrder(int n){
        System.out.print(n+" ");
        while(n!=0) {
            decreasingOrder(n-1);
            return;
        }
    } 
}


    

    