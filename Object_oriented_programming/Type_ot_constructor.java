//Type of constructor
public class Type_ot_constructor {
    public static void main(String args[])
    {
        Student s1 = new Student();

        Student s2 = new Student("Rohit");
        System.out.println(s2.name);

        Student s3 = new Student(34);
        System.out.println(s3.roll);

        Student s4 = new Student("Rohit",5);
        System.out.println(s4.name+" "+s4.roll);

    }
}
class Student
{
    String name;
    int roll;

    Student()
    {
        System.out.println("Non parameterized constructor");
    }
    Student(String name)
    {
        this.name = name;
        System.out.println("Parameterized constructor");
    }
    Student(int roll)
    {
        this.roll = roll;
    }
    Student(String name,int roll)
    {
        this.name = name;
        this.roll = roll;
    }
}
