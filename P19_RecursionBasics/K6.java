//Print sum of first N Natural Nos using RECURSION
public class K6 {
    public static void main(String[] args) {
        System.out.println("Sum:"+calcSum(5));;
    }

    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
//      int snm1=calcSum(n-1);
        int sn=n+calcSum(n-1);
        return sn;
    }
}
