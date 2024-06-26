//To print all the possible permutations, "abc" ---> abc, acb, bac, bca, cab, cba
public class K3 {
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }

    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, ans + current);
        }
    }
}
