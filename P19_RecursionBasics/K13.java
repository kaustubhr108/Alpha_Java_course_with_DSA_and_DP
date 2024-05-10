//Tiling Problem-->works for both 2Xn floor with 2X1 tile && 4Xn floor with 4X1
public class K13 {
    public static void main(String[] args) {
        System.out.println("No of Ways:-"+tilingProblem(3));
    }
    public static int tilingProblem(int n) { //2 X n (floor size)
        //base cases
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int verticalTiles=tilingProblem(n-1); //f(n-1)
        //horizontal choice
        int horizontalTiles=tilingProblem(n-2); //f(n-2)
        return (verticalTiles+horizontalTiles);//total ways
    }
}
