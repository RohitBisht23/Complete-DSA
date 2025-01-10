/*
Restuarant management
 */

import java.util.*;

public class Restuarant_managemenet {
    public static class Restuarant{
        public static void Menu()
        {
            System.out.println("Menu will shown");
        }

        public static void Order()
        {
            System.out.println("Order will be shown");
        }

        public static void Payment()
        {
            System.err.println("Only g-pay allowed");
        }

        public static void Others()
        {
            System.out.println("Other option will be shown shortly");
        }

        public static void close()
        {
            System.out.println("Thank you !!");
            
        }
    }
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("Welcome to the Restaurant Management System!");
            System.out.println("Select an option:");
            System.out.println("1. Show Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Make Payment");
            System.out.println("4. Other Options");
            System.out.println("5.close the program");
            Restuarant r = new Restuarant();
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch(option)
            {
                case 1:r.Menu();
                    break;
            
                case 2:r.Order();
                    break;

                case 3:r.Payment();
                    break;

                case 4:r.Others();
                    break;
            
                
                case 5:r.close();
                    break;

                    
                default:System.out.println("No restuarant are here available");
                    break;
            }

            }
       

    }
}
