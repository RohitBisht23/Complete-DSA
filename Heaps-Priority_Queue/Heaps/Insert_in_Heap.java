//Insert in heap
import java.util.*;

public class Insert_in_Heap {
    static class Heap{
        ArrayList<Integer>arr = new ArrayList<>();


        //insert in heap
        public  void add(int data)//O(log n)
        {
            //add at last index
            arr.add(data);

            //child index
            int x = arr.size() -1;
            //parent index finding
            int parIDX = (x-1)/2;

            //fixing the heap
            while(arr.get(x) < arr.get(parIDX))//O(log n)
            {   //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(parIDX));
                arr.set(parIDX,temp);

                x = parIDX;
                parIDX = (x-1)/2;
            }
        }

        //peek in java
        public  int peek()
        {
            return arr.get(0);
        }

        //heapify function:tc:O(log n)
        private void heapify(int i)//index that it have to fix
        {
            int left = 2*i +1;//left index
            int right = 2*i +2;//right index

            int minIdx = i;

            //somtime the root node can we the last node that have no child
            if(left < arr.size() && arr.get(minIdx) > arr.get(left))
            {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right))
            {
                minIdx = right;
            }
            
            if(minIdx != i)
            {
                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx, temp);


                //if my other node get disturb by this fixed then for fixing them we call func
                heapify(minIdx);
            }

        }

        //delete in java(min heap->delete minimum element)
        public int remove()//O(log n)
        {
            int data = arr.get(0); //deleting data means min element
            //step 1:swap last data with first
            int temp = data;
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            

            //step 2:delete last data
            arr.remove(arr.size()-1);

            //step3: fix heap using function heapify
            heapify(0);//the new root element that we have to fix it
 
            return(data); 
        }

        //isEmpty head
        public boolean isEmpty()
        {
            return arr.size() == 0;
        }
    }
    public static void main(String args[])
    {
        Heap h = new Heap();
        h.add(3);
        h.add(2);
        h.add(1);
        h.add(5);
        h.add(4);

        while(!h.isEmpty())
        {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
