//Friends Pairing Problem
public class K15 {
    public static void main(String[] args) {
        System.out.println("No of Ways:-"+pairing(3));
    }
    public static int pairing(int n) {
        if(n==1 || n==2){ //base case
            return n;
        }
        //choosing to be single
        int single=pairing(n-1);
        /* choosing to make a pair
        in this case, every person has a choice to select another person out of {(n-1)--->remaining people after excluding self}
        and then 2 people (one pair is removed), so call the fn with remaining people ie, (n-2) */
        int pair=pairing(n-2)*(n-1);
        return (single+pair);
    }
}
