//Program that prints Max Subarray Sum (BRUTE FORCE)
public class K8 {
    public static void Brute(int a[]) {
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                int Currsum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(a[k] + " ");
                    Currsum += a[k];
                }

                System.out.println(" sum-" + Currsum);
                if (Currsum > MaxSum) {
                    MaxSum = Currsum;
                }

            }
            System.out.println();
        }
        System.out.println("MAX Sum=" + MaxSum);
    }

    // Program that prints Max Subarray Sum (PREFIX SUM)
    public static void PrefixSum(int a[]) {
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[a.length];

        prefix[0] = a[0];// because pehle wale term ka sum same hi rhega
        // calculating prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        // use of formula Prefix[end]-prefix[start-1] is here--->
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                int currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max Subarray Sum=" + maxsum);
    }

    // Program that prints Max Subarray Sum (KADANE Algo)
    public static void Kadane(int b[]) {
        int currsum = 0, maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < b.length; i++) {
            currsum += b[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Max Subarray Sum=" + maxsum);
    }

    public static void main(String[] args) {
        int a[] = { 1, -2, 6, -1, 3 };
        int b[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Brute(a);
        PrefixSum(a);
        Kadane(b);
    }
}