//Syntex and operations on ArrayList

import java.util.ArrayList;

public class Syntex_operation {
    public static void main(String args[])
    {
        //Syntex of ArrayList
        ArrayList<Integer>list = new ArrayList<>();

        //Operations
        //1->add(), take O(1) time
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //One more add() where we pass index value and new element, takes O(n) time
        list.add(2,9);
        //In this add() all value will be shift by one place from the index 2.

        System.out.println(list);

        //2->get() to get any element in ArrayList, takes O(1) time
        int element = list.get(2);
        System.out.println(element);

        //3->remove() to delete the element of particulat index,takes O(n) time
        list.remove(2);
        System.out.println(list);

        //4->to place any element at any index by removing that index previous value,takes O(n)
        list.set(0,10);
        System.out.println(list);

        //5->contains() used to check if particular element present or not gives true of false ,takes O(n)
        System.out.println(list.contains(10));

        //6->to know the size of the ArrayList
        System.out.println(list.size());

        //Iterating through Arraylist
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
