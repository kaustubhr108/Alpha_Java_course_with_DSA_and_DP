//Chech if the Array is Sorted or Not using RECURSION
public class K8 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={4,5,1,2,3};
        System.out.println("For Array a: "+check(a,0));
        System.out.println("For Array b: "+check(b,0));
    }
    public static boolean check(int a[],int i) {
        if(a.length-1==i){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return check(a, i+1);
    }
}
