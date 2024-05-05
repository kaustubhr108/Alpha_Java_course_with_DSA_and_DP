//To find Shortest Path from origin to observed point
public class K3 {
    public static void main(String[] args) {
        String LongPath = "WNEENESENNN";// Given Path
        int a[] = { 0, 0 };// origin
        double ShortPath;
        for (int i = 0; i < LongPath.length(); i++) {
            if (LongPath.charAt(i) == 'W')
                a[0]--;
            else if (LongPath.charAt(i) == 'E')
                a[0]++;
            else if (LongPath.charAt(i) == 'N')
                a[1]++;
            else
                a[1]--;
        }
        ShortPath = Math.sqrt(Math.pow((a[0] - 0), 2) + Math.pow((a[1] - 0), 2));
        System.out.println("Ans:" + ShortPath);
    }
}
