/* PATTERN 1
 * A
 * BC
 * DEF
 * GHIJ
 * 
*/

import java.util.Scanner;

public class K4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of Line to print:");
        int n=sc.nextInt();
        char ch='A';
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();            
        }
        sc.close();
    }
}
