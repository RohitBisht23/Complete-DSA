/*
Job sequencing problem:
We ahve an array of jobs where every job has a deadline and associated profit, if the job is finished
before the deadline. It is also given that every job takes a single unit of time, so the minimum
possible deadline for any job is 1. Maximixe the total profit if only one job can be scheduled at
a time.
ex:
JOB id      DeadLine     Profit
a             2            100
b             1            19
c             2            27
d             1            25
e             3            15
output:a,c,e
 */

import java.util.*;

public class Question3{
    static class Job{
        char Job_id;
        int Deadline;
        int Profit;

        Job(char jobId,int deadline, int profile)
        {
            this.Job_id = jobId;
            this.Deadline = deadline;
            this.Profit = profile;
        }
    }

    static void PrintJobScheduling(ArrayList<Job> arr)
    {
        int n = arr.size();
                //sort job based on deadline in ascending order
                // Collections.sort(arr,(a,b)->{
                //     return a.Deadline - b.Deadline;
                // }); 
                ////sort job based on deadline in ascending order
        Collections.sort(arr,Comparator.comparingInt(task->task.Deadline));
        
        ArrayList<Job>result = new ArrayList<>();
        
        //ordered the job based on profit in descending order
        PriorityQueue<Job>maxHeap = new PriorityQueue<>((a,b)->{return b.Profit - a.Profit;});
        
       
        for(int i= n-1; i>= 0; i--)
        {
            int slotAvailable;
            if( i==0)
            {
                slotAvailable = arr.get(i).Deadline;
            }else{
                slotAvailable = arr.get(i).Deadline - arr.get(i-1).Deadline;
            }

            maxHeap.add(arr.get(i));
            while(slotAvailable >0 && maxHeap.size() >0)
            {
                Job job = maxHeap.remove();
                slotAvailable--;
                result.add(job);
            }
        }

        //Sort the result list based on deadline
        // Collections.sort(result,Comparator.comparingInt(task->task.Deadline));
        Collections.sort(result,(a,b)->{
            return a.Deadline - b.Deadline;
        });

        for(Job job:result)
        {
            System.out.print(job.Job_id+" ");
        }System.out.println();
    }

    public static void main(String[] args)
    {
        ArrayList<Job> arr = new ArrayList<Job>();

        arr.add(new Job('A', 4, 40));
        arr.add(new Job('B', 1, 10));
        arr.add(new Job('C', 1, 20));
        arr.add(new Job('D', 3, 30));
        // arr.add(new Job('e', 3, 15));
        PrintJobScheduling(arr);
        // System.out.println("Following is maximum profit sequence of jobs:"+PrintJobScheduling(arr));
    }
}