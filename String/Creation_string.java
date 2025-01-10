//creating string 

import java.nio.file.FileStore;
import java.util.*;

public class Creation_string {
    public static void main(String args[])
    {
        // character array
        char arr[] ={'a','b','c','d'};

        //String
        String str = "abcd";

        String str2 = new String("xyz");
        //Note:String are immutable(cannot change)

        //Input string
        // Scanner sc = new Scanner(System.in);
        // String name;
        // //name = sc.next();  //.next()->for String to take only one world
        // name = sc.nextLine();// to take whole sentance
        // System.out.println(name);

        // //string length
        // String fullName = "Tony stark";
        // System.out.println(fullName.length());

        //Cancatenation
        String firstName = "Rohit";
        String secondName = "Bisht";
        String cancate = firstName +" "+ secondName;
        System.out.println(cancate);

        //String charAt method(to find the every position element)
        System.out.println(cancate.charAt(3));
        //Printing the whole string separatly
        for(int i=0;i<cancate.length();i++)
        {
            System.out.print(cancate.charAt(i)+" ");
        }
    }

}





