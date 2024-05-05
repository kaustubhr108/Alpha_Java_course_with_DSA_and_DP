//BASIC SORTING ALGORITHMS
import java.util.Arrays;// For Inbuilt Sort
import java.util.Collections;
public class K1{
    
    //Bubble Sort
    public static void BubbleSort(int a[]) {
        /* This is BETTER Bubble Sort Algo,in which the time is saved if the given 
           array is already sorted by breaking the loop after 1st iteration */
        int n=a.length;
        boolean chk;
        for (int i = 0; i <n-1; i++) {
            chk=false;
            for (int j = 0; j < n-i-1; j++) {
                if(a[j]>a[j+1])// Reverse this Condition to find an descending order result
                {
                    int swap=a[j];
                    a[j]=a[j+1];
                    a[j+1]=swap;
                    chk=true;
                }
            }
            if(chk==false)
                break;
        }
        System.out.print("Bubble Sort:-");
        for (int j = 0; j < n; j++) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
    }

    //Selection Sort
    public static void SelectionSort(int a[]) {
        for (int i = 0; i <a.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[minPos]>a[j])// Reverse this Condition to find an descending order result
                {
                    minPos=j;
                }
            }
            int swap=a[i];
            a[i]=a[minPos];
            a[minPos]=swap;
        }
        System.out.print("Selection Sort:-");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    //Insertion Sort
    public static void InsertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>curr) //To find out correct position to insert the element
            {
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr; //inserting the element
        }
        System.out.print("Insertion Sort:-");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();        
    }

    //Counting Sort
    public static void CountingSort(int a[]) {
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            largest=Math.max(largest, a[i]);
        }
        //Counting and Storing Freq in Count Array
        int count[]=new int[largest+1];// as indexing starts from 0
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++; 
        }
        //Sorting Part
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                a[j]=i;
                j++;count[i]--;
            }
        }
        System.out.print("Counting Sort:-");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //(DOUBTFUL!!!)we are creating multiple test arrays bec they are passed by reference so any sort will affect the original array too
        int a[]={5,4,1,3,2};
        int b[]={5,4,1,3,2};
        int c[]={5,4,1,3,2};
        int f[]={1,4,1,3,2,4,3,7};
        BubbleSort(a);
        SelectionSort(b);
        InsertionSort(c);
        CountingSort(f);

        //INBUILT SORT using "util.Arrays" package         
        int d[]={5,4,1,3,2};
        System.out.print("Inbuilt Sort:-");// Sorts only in ASCENDING ORDER
        Arrays.sort(d,0,3);// sorts only from index 0 to 2 (3 is excluded)
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]+" ");
        }
        System.out.println();
        
        //INBUILT SORT using "util.Collections" package
        Integer e[]={5,4,1,3,2};//Collections works only on Objects so we are using Integer
        System.out.print("Inbuilt Sort:-");// Sorts only in DESCENDING ORDER
        Arrays.sort(e,0,3,Collections.reverseOrder());// sorts only from index 0 to 2 (3 is excluded)
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]+" ");
        }
    }
}