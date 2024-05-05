public class BonusLive {
    public static void NumberPyramid(int n) {
        /*
         * Number Pyramid
         *     1
         *    2 2
         *   3 3 3
         *  4 4 4 4
         * 5 5 5 5 5
         */
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void PalindromicPattWithNos(int n) {
        /*
        Palindromic Pattern
                1
               212
              32123
             4321234
            543212345
        */ 
        for (int i = 1; i <= n; i++) {
            // For Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // For Descending Loop
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("---Number Pyramid---");
        System.out.println("--------------------");
        NumberPyramid(5);
        System.out.println("X---------------------X");
        System.out.println("-----------XX----------");
        System.out.println("---Palindromic Pattern---");
        System.out.println("-------------------------");
        PalindromicPattWithNos(5);
    }
}
