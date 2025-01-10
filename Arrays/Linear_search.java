import java.util.Scanner;

//Linear search

public class Linear_search {
    public static int LinaerSearch(int LS[],int key)
    {
        for(int i=0;i<LS.length;i++)
        {
            if(key==LS[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(Creation_string args[])
    {   
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the size of the array:");
        int n = sc.nextInt();
        int LS[]=new int[n];
        System.err.print("Enter the element of the array:");
        for(int i=0;i<n;i++)
        {
            LS[i]=sc.nextInt();
        }
        System.err.print("Enter the finding key:");
        int key = sc.nextInt();
        //System.err.print("Element found at index:"+LinaerSearch(LS,key));
        int index = LinaerSearch(LS, key);
        if(index == -1)
        {
            System.err.println("Not found");
        }else
        {
            System.out.print("Fount at index:"+index);
        }
    }
}
