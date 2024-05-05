//Printing a Substring
public class K4 {
    public static void UserDefined() {
        String str="HelloWorld";
        int si=0,ei=5;//Starting and Ending Indices
        for (int i = si; i < ei; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    } 
    public static void InBuiltSubStrFn() {
        String str="HelloWorld";
        System.out.println(str.substring(0,5));
    }
    public static void main(String[] args) {
        UserDefined();
        InBuiltSubStrFn();
    }   
}
