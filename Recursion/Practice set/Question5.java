/*    TOWER OF HANOI
Rules:
1->Only one disk can be transferred at a time
2->Smaller disk always kept onto the bigger disk

 */
public class Question5 {
    public static void TowerOfHanoi(int n,String src,String helper,String dest)
    {
        //Base case
        if(n == 1)
        {
            System.out.println("Tranfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        /*transfer n-1 disk to helper tower using helper tower are destination 
        and destination tower as helper  */
        TowerOfHanoi(n-1, src, dest, helper);

        /*transfer nth disk to destination tower from source tower */
        System.out.println("Tranfer disk "+n+" from "+src+" to "+dest);

        /*transfer n-1 disk from helper tower to destination tower using helper
          tower as source and source as helper
         */
        TowerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args)
    {
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
    }
}
