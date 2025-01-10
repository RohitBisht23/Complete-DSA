import java.util.Scanner;

//Creating array

public class Creating_Array {
    public static void update(int markSheet[])
    {
        for(int i=0;i<markSheet.length;i++)
        {
            markSheet[i]+=1;
        }
    }
public static void main(Creation_string args[])
{
    // int arr[]=new int[10]; //new keyword find the free space in memory and assign it
    // //String fruite[]={"mango","apple","banana"};

    // //tsking input in array
    int marks[]=new int[10];
    // Scanner sc = new Scanner(System.in);
    // marks[0] = sc.nextInt();//phy
    // marks[1]=sc.nextInt();//maths
    // marks[2]=sc.nextInt();//chem

    // System.err.println("phy:"+marks[0]);
    // System.err.println("maths:"+marks[1]);
    // System.err.println("chem:"+marks[2]);

    // // //updating 
    // // marks[2]=100;
    // // System.err.println("chem:"+marks[2]);

    // // //finding percentage
    // // int percentage = (marks[0]+marks[1]+marks[2])/3;
    // // System.err.println("percentage:"+percentage);

    // //finding the length
    // System.err.println("Length of array:"+marks.length);

    // //array as an argument
    //array as an by reference argument can be passed
    int markSheet[]={97,98,99};
    update(markSheet);
    for(int i=0;i<markSheet.length;i++)
    {
        System.err.println(markSheet[i]);
    }

     

}
    
}
