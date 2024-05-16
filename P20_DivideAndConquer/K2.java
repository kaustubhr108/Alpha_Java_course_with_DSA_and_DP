//Merge Sort using RECURSION
public class K2 {
    public static void main(String[] args) {
        int a[]={6,3,9,5,2,9,8};
        mergeSort(a, 0, a.length-1);
        printArr(a);
    }

    public static void mergeSort(int a[],int si,int ei) {
        //base case
        if(si>=ei){
            return;
        }

        int mid=si+(ei-si)/2; //this method avoids the integer overflow error (feasible when the array is very large) or use (si+ei)/2
        mergeSort(a, si, mid);//gives sorted left part
        mergeSort(a, mid+1, ei);//gives sorted right part
        merge(a,si,mid,ei);
    }

    public static void merge(int a[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp array
        while (i<=mid && j<=ei) {
            if(a[i]<a[j]){
                temp[k]=a[i];
                i++;
            }
            else{
                temp[k]=a[j];
                j++;
            }
            k++;
        }
            //after completing the right part, left part has still some values left
            while(i<=mid){
                temp[k++]=a[i++];
            }
            //after completing the left part, right part has still some values left
            while(j<=ei){
                temp[k++]=a[j++];
            }
            //copy temp to original array
            for(k=0,i=si;k<temp.length;k++,i++){
                a[i]=temp[k];
            }
        
    }
    public static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
