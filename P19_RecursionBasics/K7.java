//Printing Fibonacci Series using RECURSION
public class K7 {
    public static void main(String[] args) {
        System.out.println("Fibonacci sum till 25:"+Fibonacci(25));
    }
    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        // int fnm1=Fibonacci(n-1);
        // int fnm2=Fibonacci(n-2);
        int fb=Fibonacci(n-1)+Fibonacci(n-2);
        return fb;
    }
}
