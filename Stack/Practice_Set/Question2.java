/*
Simplify Path
We have an absolute path for a file(Unix-style),Simplify it. Note that absolute path always begin with
'/'(root directory), a dot i path represent current directory and double dot represents parent
directory.
ex 1: Sample input:/apnacollege/
    sample output:/apnacollege

2:Sample input:/a/..
sample output:/
 */
import java.util.Stack;
public class Question2 {
    static String simplify(String str)
    {
        Stack<String>s = new Stack<String>();
        StringBuilder res= new StringBuilder("");
        // res.append();

        int n = str.length();
        for(int i=0; i<n; i++)
        {
            String dir="";
            //the ith character is /
            while(i<n && str.charAt(i) == '/')
            {
                i++;
            }
            while(i<n && str.charAt(i) != '/')
            {
                dir += str.charAt(i);
                i++;
            }
            if(dir.equals("..")==true)
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }else if(dir.equals(".") == true)
            {
                continue;
            }else{
                s.push(dir);
            }

        }
        while(!s.isEmpty())
        {
            String a = "/"+s.pop();
            
            res.insert(0,a);
        }
        if(res.length() == 0)
        {
            res.append("/");
        }
        return res.toString();
    }
    public static void main(String[] args)
    {
        String str = new String("/a/..");
        String result = simplify(str);
        System.out.println(result);
    }
}
