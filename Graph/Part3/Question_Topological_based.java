/* IMPOTANT
Topological based question of leetcode 210 and name is courses Schedule ii
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. 
You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you 
must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return the ordering of courses you should take to finish all courses. 
If there are many valid answers, return any of them. If it is impossible to finish all courses,
return an empty array.

Example 1:
Input: numCourses = 2, prerequisites = [[1,0]]
Output: [0,1]
Explanation: There are a total of 2 courses to take. To take course 1 you should have 
finished course 0. So the correct course order is [0,1].

Example 2:
Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
Output: [0,2,1,3]
Explanation: There are a total of 4 courses to take. To take course 3 you should have 
finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].

Example 3:
Input: numCourses = 1, prerequisites = []
Output: [0]

 */
import java.util.*;
public class Question_Topological_based {
    public static int[] topoSort(int numCourses, int prerequisites[][])
    {
        //form Adjecancy list
        ArrayList<ArrayList<Integer>> abj = new ArrayList<>();
        for(int i=0; i<numCourses; i++)
        {
            abj.add(new ArrayList<>());
        }

        for(int i=0; i<prerequisites.length; i++)
        {
            abj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int inDegree[] = new int[numCourses];
        for(int i=0; i<numCourses; i++)
        {
            for (int it : abj.get(i)) {
                inDegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++)
        {
            if(inDegree[i] == 0)
            {
                q.add(i);
            }
        }

        int topo[] = new int[numCourses];
        int idx = 0;
        while(!q.isEmpty())
        {
            int curr = q.remove();
            topo[idx++] = curr;

            for (int it : abj.get(curr)) {
                inDegree[it]--;
                if(inDegree[it] == 0)
                {
                    q.add(it);
                }
            }
        }

        if(idx == numCourses)
        {
            return topo;
        }else{
            return new int[0];
        }
    }
    public static void main(String[] args)
    {
        int prerequisites[][] = {
                                    {1,0},
                                    {2,1},
                                    {3,1},
                                    {3,2},
                                };
        
        int numCourses = 4;
        int result[] = topoSort(numCourses,prerequisites);
        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
