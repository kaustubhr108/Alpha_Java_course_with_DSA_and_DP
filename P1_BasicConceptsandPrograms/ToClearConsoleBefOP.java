
//METHOD 1 is easier than METHOD 2
import java.util.*;
import java.io.*; //invoked for M2

public class ToClearConsoleBefOP {
    public static void main(String[] args) throws IOException, InterruptedException{ // Compulsary and can only be used with IO Package invoked above (M2)

        method1();
        method2();
        
    }

    public static void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No:");
        int n = sc.nextInt();
        System.out.print("\033[H\033[2J"); // These Lines are used
        System.out.flush();                 // This Too
        System.out.println("The Number ---->>" + n);
        sc.close();
    }

    public static void method2() throws IOException, InterruptedException { // Compulsary and can only be used with IO Package invoked above (M2)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No:");
        int n = sc.nextInt();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // This Line is used
        System.out.println("The Number ---->>" + n);
        sc.close();
    }
}