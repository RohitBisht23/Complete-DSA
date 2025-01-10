//Pairs in array
public class Pairs_in_array {
    public static void printPair(int arr[])
    {   int total = 0;
        for(int i=0;i<arr.length;i++)
        {
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+curr+","+arr[j]+")");
                total++;
            }
            System.err.println();
        }
        System.err.println("Total numbers of pairs:"+total);

    }
    public static void main(Creation_string args[])
    {
        int arr[]={2,4,6,8,10};
        printPair(arr);
    }
}
