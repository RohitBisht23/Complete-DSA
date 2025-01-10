public class Medain_sorted_array {
    public static void median(int nums1[],int nums2[])
    {
        int temp[] = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i != nums1.length && j != nums2.length)
        {
            if(nums1[i]>nums2[j])
            {
                temp[k] = nums2[j];
                j++;
            }else{
                temp[k] = nums1[i];
                i++;
            }
            k++;
        }
        while(i != nums1.length)
        {
            temp[k++] = nums1[i++];
        }
        while(j != nums2.length)
        {
            temp[k++] = nums2[j++];
        }
        for(int o=0;o<temp.length;o++)
        {
            System.err.print(temp[o]+" ");
        }
        System.err.println();
        double median;
        int mid;
        int len = temp.length;
        System.out.println(len);
        if(len % 2 == 0)
        {
            mid = (len-1)/2;
            median = (temp[mid]+temp[mid+1])/2.0;
            System.out.println("mid is:"+mid);
        }else{
            mid = len /2;
            median = temp[mid];
            System.out.println("mid is:"+mid);

        }
        System.out.println(median);
    }
    public static void main(String[] args)
    {
        int arr1[] = {1,2};
        int arr2[] = {3,4};
        median(arr1, arr2);
        
    }
}
