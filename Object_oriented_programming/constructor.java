//Constructor
public class constructor{
    public static void main(String args[])
    {
        // Student s1 = new Student("Rohit");
        Student s1 = new Student();

        // System.out.println(s1.name);
    }
}
//Class
class Student
{
    String name;
    int rollNo;
    //Constructor
    // Student(String name)
    // {
    //     this.name = name;
    // }
    Student()
    {
        System.out.println("Constructor is called...");
    }

}