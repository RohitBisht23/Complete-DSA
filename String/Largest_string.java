//Print larset string (lexicograohic order) 
//compare words first latter and chech who is greated
//Function using comoareTo()
public class Largest_string {
   
    public static void main(String args[])
    {
        String fruit[] = {"apple","mango","banana"};

        String largest = fruit[0]; //consider apple is largest
        for(int i=0; i<fruit.length; i++)
        {
            if(largest.compareTo(fruit[i]) < 0)//if(apple is smaller than rest)so
            {
                largest = fruit[i]; //assign largest fruit to largest variable
            }
        }
        System.out.println(largest);
    }
}
