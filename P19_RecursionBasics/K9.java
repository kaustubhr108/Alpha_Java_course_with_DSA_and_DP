//Find First Occurance of Element in an Array using RECURSION
public class K9 {
    public static void main(String[] args) {
        int a[]={8,4,12,4,8,6,5,5,4,13,10};
        int key=5;
        System.out.println("First Occurance of Key value is:"+firstOcc(a,key,0));
    }
    public static int firstOcc(int a[],int key,int i){
        if(a.length==i){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstOcc(a,key,i+1);
       
    }
}
