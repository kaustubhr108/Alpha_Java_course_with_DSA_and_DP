//Interfaces
public class K10 {
   public static void main(String[] args) {
    Queen q=new Queen();
    q.moves();
   } 
}


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal (All Directions!)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal (By 1 Step)");
    }
}