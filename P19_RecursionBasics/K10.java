//Find Last Occurance of Element in an Array using RECURSION
public class K10 {
    public static void main(String[] args) {
        int a[]={8,4,12,4,8,6,5,5,4,13,10};
        int key=5;
        System.out.println("First Occurance of Key value is:"+lastOcc(a,key,0));
    }
    public static int lastOcc(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        int isFound=lastOcc(a, key, i+1);
        if(isFound==-1 && a[i]==key){
            return i;
        }
        return isFound;
    }
}
