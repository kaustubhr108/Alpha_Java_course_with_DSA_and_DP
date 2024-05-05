//Program 3 is skipped bec it is to find Largest in an Array (Already Known)
//BINARY SEARCH (Array must be SORTED)
public class K4 {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 10;
        System.out.println("Index of key is: " + BinSer(a, key));
    }

    public static int BinSer(int a[], int key) {
        int st = 0, end = a.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
