//Copy constructor
public class copy_constructor {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.name = "Rohit";
        s1.roll = 23;
        s1.password = "abcd";
        s1.mark[0] = 100;
        s1.mark[1] = 90;
        s1.mark[2] = 80;


        Student s2 = new Student(s1);
        s2.password = "xyz";
         
        s1.mark[1] = 100;
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.mark[i]);
        }
    }
}
class Student
{
    String name;
    int roll;
    String password;
    int mark[];

    //shallow copy constructor only references and changes reflect
    // Student(Student s1)
    // {   
    //     mark = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll; 
    //     this.mark = s1.mark;
    // }

    //Deep copy constructor :new array create cahnges dont reflect
    Student(Student  s1)
    {
        mark = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<mark.length; i++)
        {
            this.mark[i] = s1.mark[i];
        }
    }

    Student()
    {   
        mark = new int[3];
        System.out.println("Default constructor");
    }
}