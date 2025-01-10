//Priority queue for objects
import java.util.*;

public class PQ_for_Objects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank)
        {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args)
    {
        PriorityQueue<Student>pq = new PriorityQueue<>();

        pq.add(new Student("A", 2));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 6));
        pq.add(new Student("D", 3));
        pq.add(new Student("E", 9));
        pq.add(new Student("f", 0));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
