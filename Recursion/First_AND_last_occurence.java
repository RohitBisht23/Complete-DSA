//Problem 7:Find the first occurence of the element
public class First_AND_last_occurence {
    //First occurence of the element
    public static int FirstOccurence(int arr[],int key,int idx)
    {   
        if( idx == arr.length -1)
        {
            return -1;
        }
        if(arr[idx] == key )
        {
            return idx;
        }
        return FirstOccurence(arr,key,idx+1);
    }
    //Last occurence program 
    public static int LastOccurence(int arr[],int key,int idx)
    {
        if(idx == arr.length - 1)
        {
            return -1;
        }
        int isFound = LastOccurence(arr,key,idx+1);
        if(isFound != -1)
        {
            return isFound;
        }

        //check itself
        if(arr[idx] == key )
        {
            return idx;
        }else{
            return -1;
        }
    }
    public static void main(String args[])
    {
        int arr[]={8,3,6,9,5,10,2,5,339};
        int key = 5;
        System.out.println("First occurence of the element:"+FirstOccurence(arr,key,0));
        System.out.println("Last occurence of the element:"+LastOccurence(arr,key,0));

    }
}
