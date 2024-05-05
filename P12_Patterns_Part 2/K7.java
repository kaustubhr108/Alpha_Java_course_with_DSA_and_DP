/*Solid Rhombus
    *****
   *****
  *****
 *****
*****
*/ 
public class K7 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            // For Spaces
            for (int j = 1; j <=(5-i); j++) {
                System.out.print(" ");
            }
            // For Stars
            for (int j = 1; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
