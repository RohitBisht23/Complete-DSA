//Remove duplicates from string
public class Remove_Dplicate_from_String {
    public static void RemoveDuplicate(String str,int idx,StringBuilder newStr,boolean arr[])
    {
        //Base case
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        //work
        char currchar = str.charAt(idx);
        if(arr[currchar - 'a'] == true)
        {
            //Duplicate
            RemoveDuplicate(str, idx+1, newStr, arr);
        }else{
            arr[currchar -'a'] = true;
            RemoveDuplicate(str, idx+1, newStr.append(currchar), arr);
        }

    }
    public static void main(String[] args)
    {
        String str = "appnnacollege";
       RemoveDuplicate(str,0,new StringBuilder(""),new boolean [26]);
    }
}
