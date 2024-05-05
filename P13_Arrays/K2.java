//Linear Search
public class K2 {
    public static int Linear(int k[], int key) {
        for (int i = 0; i < k.length; i++) {
            if (key == k[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int k[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 22;

        if (Linear(k, key) == -1) {
            System.out.println("NOT FOUND");
        } else
            System.out.println(Linear(k, key));
    }
}