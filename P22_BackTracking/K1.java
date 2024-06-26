//This Program creates an array that gets initialized with values from 1->5,
// however while returning these values are reduced by 2 at each return resuting in following result generation
// [1,2,3,4,5] ---> [-1,0,1,2,3]

public class K1{
    public static void main(String[] args) {
        int a[]=new int[5];
        changeArr(a,0,1);
        printArr(a);
    }
    public static void printArr(int a[]) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }        
    }
    public static void changeArr(int a[],int i,int val) {
        //base case
        if(i>=a.length){
            printArr(a);
            return;
        }
        //recursion
        a[i]=val;
        changeArr(a,i+1,val+1);
        a[i]=a[i]-2;
    }
}