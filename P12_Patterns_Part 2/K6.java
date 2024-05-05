/*ButterFly Pattern*/ 
public class K6 {
    public static void main(String[] args) {
        // First Half
        for (int i = 1; i <=5; i++) {
            // For Stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // For Spaces
            for (int j = 1; j <=2*(4-i); j++) {
                System.out.print(" ");
            }
            // For Stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Second Half
        for (int i = 4; i>=1; i--) {
            // For Stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // For Spaces
            for (int j = 1; j <=2*(4-i); j++) {
                System.out.print(" ");
            }
            // For Stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
