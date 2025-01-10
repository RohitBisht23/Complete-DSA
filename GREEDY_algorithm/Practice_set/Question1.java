/*
Maximum Balanced String Partitions
We have balanced string str of size N with an equal number of L and R, the task is find a maximum
number X, such that a given string can partitioned into X balanced substring. A string is called
to be balanced if the number of 'L's in the string equals the number of 'R's.

Input:"LRRRRLLRLLRL";
output:3
 */
public class Question1 {
    public static int BalancedPartition(String str, int n)
    {
        if(n == 0)
        {
            return 0;
        }

        int r = 0, l = 0;
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            if(str.charAt(i) == 'R')
            {
                r++;
            }else if(str.charAt(i) == 'L')
            {
                l++;
            }

            if(l == r)
            {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String str = "LLRRRLLRRL";
        int n = str.length();
        System.out.println(BalancedPartition(str,n));
    }
}
