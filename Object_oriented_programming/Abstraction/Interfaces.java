//Interfaces

public class Interfaces {
    public static void main(String args[])
    {
        Quess q = new Quess();
        q.moves();
    }
}
interface ChessPlayers
{
    void moves();
}
class Quess implements ChessPlayers
{
    public void moves()
    {
        System.out.println("Up , Down , Left , Right , Diagonal(in all 4 directions)");
    }
}
class Rook implements ChessPlayers
{
    public void moves()
    {
        System.out.println("Up , Down , Left , Right ");
    }    
}
class King implements ChessPlayers
{
    public void moves()
    {
        System.out.println("Up , Down , Left , Right , Diagonal(by 1 steps)");
    }    
}