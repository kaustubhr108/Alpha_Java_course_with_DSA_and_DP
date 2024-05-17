//Quick Sort using RECURSION

import java.util.Arrays;

public class K3 {
    public static void main(String[] args) {
        int a[]={6,3,9,5,2,9,8};
        quickSort(a, 0, a.length-1);
        printArr(a);
    }
    public static void quickSort(int a[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //last element
        int pIdx=partition(a,si,ei);
        quickSort(a,si,pIdx-1);//left
        quickSort(a,pIdx+1,ei);//right
    }

    public static int partition(int a[],int si,int ei){
        int pivot=a[ei];
        int i=si-1;//to make place for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if(a[j]<=pivot){
                i++;
                //swap
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        a[ei]=a[i];
        a[i]=temp;
        return i;
    }

    public static void printArr(int a[]) {
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();
        System.out.println(Arrays.toString(a));
    }
}