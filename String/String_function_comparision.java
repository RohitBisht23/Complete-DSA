//Comparision string
public class String_function_comparision {
    public static void main(String args[])
    {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2)
        {
            System.out.println("string are equal");
        }else{
            System.out.println("String are not equal");
        }

        if(s1 == s3)
        {
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }/*
        Here the s1 and s3 return not equal because the whenever any string 
        created by new keyword it point to different string but of two variable
        created by simply then they both point to same string thats why they return
        equal.
        Here we not use == operator to chech string equality this operator 
        check quality at object level so we use function ".equal" function */

        if(s1.equals(s3))
        {
            System.out.println("equal string");
        }else{
            System.out.println("not equal");
        }
        //Note: .equal function return boolean value
    }
    
}
