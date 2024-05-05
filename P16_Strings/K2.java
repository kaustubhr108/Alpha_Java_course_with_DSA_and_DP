//To check PALINDROME
import java.util.*;
public class K2 {
    public static void main(String[] args) {
        System.out.println("Enter a Word to Check:-->");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        int n=str.length();
        while(i<n/2){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
            else i++;
        }
        System.out.println("A Palindrome");
        sc.close();
    }    
}
