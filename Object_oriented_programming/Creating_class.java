//Creating class

public class Creating_class {
   public static void main(String agrs[])
   {
       Pen p1 = new Pen();//Created a pen object called p1
    //    p1.setColor("Blue");  //or we can also write as
        p1.color = "blue";
       System.out.println(p1.color);

       p1.setTip(5);
       System.out.println(p1.tip);

       //Access specifier
       BankAccount myAcc = new BankAccount();
       myAcc.userName = "Rohit Bisht";
       //myAcc.password = "12345"; //Not accessbile
        myAcc.setPassword("1234567");

   } 
}
//Creating blue print of Pen class
class Pen{
    String color;
    int tip;

    void setColor(String newColor)
    {
        color = newColor;
    }
    void setTip(int newTip)
    {
        tip = newTip;
    }
}


//Access specifier
class BankAccount{
    public String userName;//public data memeber
    private String password;//private data member

    //creating mumber function within class so its can access the private member
    public void setPassword(String pwd)//is also can be default and private according the requirement.
    {
        password = pwd;
    }
}