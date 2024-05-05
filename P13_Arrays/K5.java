//Program that reverses the Array
public class K5 {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        int first = 0, last = a.length - 1;
        while (first < last) {
            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            first++;
            last--;
        }
        System.out.println("PRINT");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
