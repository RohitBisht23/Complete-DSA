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

public class Job_sequencing {
    static class Job {
        int deadline;
        int profit;
        char id;

        Job(char i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }

    }

    public static void main(String[] args)
    {
        int JobInfo[][] = {{4,40},{1,10},{1,20},{3,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<JobInfo.length; i++)
        {
            jobs.add(new Job((char)(i+'A'),JobInfo[i][0],JobInfo[i][1]));
        }
            
        //Sort in descending order
        Collections.sort(jobs,(obj1,obj2)-> obj2.profit - obj1.profit);
            
        int time = 0;
        ArrayList<Character> seq = new ArrayList<>();
            
        for(int i=0; i<jobs.size();i++)
        {
            Job curr = jobs.get(i);
            if(curr.deadline > time)
            {
                time++;
                seq.add(curr.id);
            }
        }

        System.out.println("Max jobs:"+seq.size());

        for(int i=0; i<seq.size(); i++)
        {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    
    }
}
