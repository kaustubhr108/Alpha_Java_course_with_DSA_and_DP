//Program that prints all possible Pairs
public class K6 {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        int tp = 0;
        int first = 0;
        while (first < a.length - 1) {
            for (int i = first + 1; i < a.length; i++) {
                System.out.print("(" + a[first] + "," + a[i] + ") ");
                tp++;
            }
            first++;
            System.out.println();
        }
        System.out.println("No. of Pairs=" + tp);
    }
}