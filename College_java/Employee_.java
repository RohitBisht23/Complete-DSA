//Employee data using claass
import java.util.*;


public class Employee_ {
    static class Employee{
        String name;
        String department;
        String gender;
        int salary;
        int id;

        Employee(String n,String d,String g,int s,int i)
        {
            name = n;
            department = d;
            gender = g;
            salary = s;
            id = i;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in );
        Employee emp[] = new Employee[10];
        for(int i=0; i<10; i++)
        {
            System.out.println("Enter the details of employee:"+(i+1));
            System.out.print("Name:");
            String name = sc.nextLine();

            
            System.out.print("Department:");
            String department = sc.nextLine();

            System.out.print("Gender:");
            String gender = sc.nextLine();

            System.out.print("Id:");
            int id = sc.nextInt();

            System.out.print("Salary:");
            int salary = sc.nextInt();

            emp[i] = new Employee(name, department, gender, salary, id);
            System.out.println();
        }

        for(int i=0; i<10; i++)
        {
            Employee employee = emp[i];
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Name: " + employee.name);
            System.out.println("Department: " + employee.department);
            System.out.println("Gender: " + employee.gender);
            System.out.println("ID: " + employee.id);
            System.out.println("Salary: " + employee.salary);
            System.out.println();
        }

    }
}
