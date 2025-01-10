//Swap without using third variable
//we swap using the property of XOR operator

public class Question1 {
    public static void main(String args[])
    {
        int x = 4;
        int y = 3;
        System.out.println("Befor swapping:\nx:"+x+"\ny:"+y);

        //Swap
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swapping:\nx:"+x+"\ny:"+y);

    }
}
