//Static keyword
public class Static_keyword {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.schoolName = "mv";
        s1.name = "Rohit";
        System.out.println(s1.name);
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);


    }
}
class Student
{
    String name;
    int rollNO;

    static String schoolName;
    void setName(String name)
    {
        this.name = name;
    }
    String  getName()
    {
        return this.name;
    }
}

