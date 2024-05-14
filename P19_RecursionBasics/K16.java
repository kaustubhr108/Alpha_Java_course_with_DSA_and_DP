// Print all Binary Strings of size n without 'consecutive 1's'
public class K16 {
    public static void main(String[] args) {
        printBinString(3,0,"");
    }

    public static void printBinString(int n, int lastPlace, String str) {
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

      /*  
        if(lastPlace==0){
            //setting 0 on place 'n'
            printBinString(n-1, 0, str+"0");
            printBinString(n-1, 1, str+"1");
        }
        else{
            printBinString(n-1, 0, str+"1");
        }
        in both of these cases, 0 is to be placed at last place ALWAYS, so it can be generalized further
        */
        
        printBinString(n-1, 0, str+"0");
        if(lastPlace==0){
            printBinString(n-1, 1, str+"1");
        }
    }
}
