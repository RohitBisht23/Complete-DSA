/*Convert letter to uppercase
Question:For a given String convert each the first letter of each word to uppercase.
 */
public class Convert_letter_to_upperCase {
    public static String toUpperCase(String str)
    {
        StringBuilder sb = new StringBuilder("");
        //first 0 index letter making capital because its the starting of word
        char ch = (Character.toUpperCase(str.charAt(0)));
        sb.append(ch);

        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i<str.length() -1)
            {
                sb.append(str.charAt(i)); //appending empty space when found
                i++; //inceament to next iteration bcoz next will be starting of the word
                sb.append(Character.toUpperCase(str.charAt(i)));//inceamenting the nexxt latter
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        String str = "hi, my name is rohit";
        System.out.println(toUpperCase(str));
    }
    
}
