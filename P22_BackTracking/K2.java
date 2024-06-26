//To print all possible subsets, "abc" ---> a,b,c,ab,bc,ac,abc,"\n" {2^n=8 subsets,here n=3}
public class K2 {
    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, "", 0);
    }

    public static void findSubSets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.isEmpty()) { //Managing Null
                System.out.println("NULL");
            } else
                System.out.println(ans);
            return;
        }
        // recursion-{each has 2 choices, i.e, whether to join or not ---> Y/N}
        // YES Choice
        findSubSets(str, ans + str.charAt(i), i + 1);
        // NO Choice
        findSubSets(str, ans, i + 1);
    }
}
//Gives same order as RECURSION TREE