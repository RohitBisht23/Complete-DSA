//Problem 13
/*
Friends pairing problem:
given n friends, each can be remain single or can be paired up with each other
friend. Each friend can be paired up onle once.
Find out the number of ways in which friend can be remain single or can be 
paired up?
 */
public class Friends_pairing_problem {
    public static int FriendsPairing(int n)
    {
        //Base case
        if(n == 1 || n == 2)
        {
            return n;
        }
        //work
        //choice 1:to be single
        int single = FriendsPairing(n - 1);
        //choice 2:to be paired up
        int paired = (n-1) * FriendsPairing(n - 2);

        int totalWays = single + paired;
        return totalWays;
    }
    public static void main(String args[])
    {
        System.err.println(FriendsPairing(3));
    }
}
