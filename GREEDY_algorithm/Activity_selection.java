/*
Activity selection problem
You are givin n activities with their start and end times.Select the maximum number of activities
that can be performed by a sindle person, assuming that a person can only work on a single activity
at a time.Activities are sorted according to end time
start=[10,12,20]
end=[20,25,30]

ans=2[A0 & A2]
 */
import java.util.ArrayList;
public class Activity_selection {
    
    public static void main(String[] args)
    {
        int n = 3;
        int start[] = {1,3,0,5,8,5};
        int end[] =   {2,4,6,7,9,9};//Sorted according to end time
        
        int MaxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //first activity
        MaxActivity = 1;
        ans.add(0);

        int LastEnd = end[0];
        for(int i=1; i<start.length; i++)
        {
            
            if(start[i] >= LastEnd)
            {   
                //activity select
                MaxActivity++;
                ans.add(i);
                LastEnd = end[i];
            }
            
        }
        System.out.println("Maximum activities are:"+MaxActivity);
        for(int i=0; i<ans.size(); i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
