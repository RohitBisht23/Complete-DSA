//Multi-dimensional ArrayList


import java.util.ArrayList;
public class Multi_dimensional_arrayList {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>(); 

        list1.add(1);
        list1.add(2);
        mainList.add(list1); 

        //Creating second list to add in mainList
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        mainList.add( list2);

        //tranvesing into mainList
        //1->first will traverse into mainList to get the list
        //second will print the ith list elements 
        for(int i=0; i<mainList.size(); i++)
        {
            ArrayList<Integer>currrentList = mainList.get(i);
            for(int j = 0; j<currrentList.size(); j++)
            {
                System.out.print(currrentList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.print(mainList);//[[1,2],[2,4,6,8]]
    }
}
