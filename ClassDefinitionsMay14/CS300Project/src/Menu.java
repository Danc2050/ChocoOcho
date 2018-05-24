import java.io.*;
import java.util.Scanner;

public class Menu extends Utility {

    /*Lets a terminal user choose between Interactive Mode and a Provider/Manager mode.*/
    public static int mainMode()
    {
        int response = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("\n\nChoose a mode.");
        System.out.println("\n[1] - Interactive/Manager Mode" + "\n[2] - Provider Mode.");

        while (response < 1 || response > 2)
        {
            System.out.println("\nEnter response: ");
            response = input.nextInt();
            input.nextLine();
        }
        return response;
    }

    /*Lets a user choose what they want to do in intMode. Note: the action (add, remove, update) is not used in this prototype*/
    public static int intMode()
    {
        //Implement a use... Example: call an add function with string "member" or "provider". Or create Member or Provider object and pass in to use Dynamic binding.
        Scanner input = new Scanner(System.in);
        int response = 0;

        System.out.println("What do you want to access?");
        System.out.println("[1] - Member." + "\n[2] - Provider." + "\n[3] - Manager.");

        while (response < 1 || response > 3)
        {
            System.out.println("\nEnter response: ");
            response = input.nextInt();
            input.nextLine();
        }

        if (response == 1)
        {
            int member_response = 0;
            //Member options.
            System.out.println("What would you like to do?");
            System.out.println("[1] - Add Member." + "\n[2] - Remove Member." + "\n[3] - Update Member");

            while (member_response < 1 || member_response > 3)
            {
                System.out.println("\nEnter response: ");
                member_response = input.nextInt();
                input.nextLine();
            }

            if (member_response == 1)
            {
                //TODO Add member
            }

            else if (member_response == 2)
            {
                //TODO Remove member
            }

            else
            {
                //TODO Update member
            }
        }

        else if (response == 2)
        {
            int provider_response = 0;
            //Provider options.
            System.out.println("What would you like to do?");
            System.out.println("[1] - Add Provider." + "\n[2] - Remove Provider." + "\n[3] - Update Provider");

            while (provider_response < 1 || provider_response > 3)
            {
                System.out.println("\nEnter response: ");
                provider_response = input.nextInt();
                input.nextLine();
            }

            if (provider_response == 1)
            {
                //TODO Add provider
            }

            else if (provider_response == 2)
            {
                //TODO Remove provider
            }

            else
            {
                //TODO Update provider
            }
        }

        else {
            //Manager options.
            int manager_response = 0;
            System.out.println("What would you like to do?");
            System.out.println("[1] - Add Manager." + "\n[2] - Remove Manager." + "\n[3] - Update Manager");

            while (manager_response < 1 || manager_response > 3)
            {
                System.out.println("\nEnter response: ");
                manager_response = input.nextInt();
                input.nextLine();
            }

            if (manager_response == 1)
            {
                //TODO Add manager
            }

            else if (manager_response == 2)
            {
                //TODO Remove manager
            }

            else
            {
                //TODO Update manager
            }
        }

        return 0;
    }

    /*The Provider Menu.*/
    public static int providerMenu()
    {
        int response = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("\n\nChoose from the options below." +
                "\n[1] - Provider Directory." + "\n[2] - Create Member Report." +
                "\n[3] - Access ChocAn Billing Services.");

        while (response < 1 || response > 3)
        {
            System.out.println("\nEnter response: ");
            response = input.nextInt();
            input.nextLine();
        }

        if (response == 1)
        {
            //TODO Write Provider Directory to file
        }

        else if (response == 2)
        {
            //TODO Create member report
        }

        else
        {
            //TODO Access ChocAn Billing Services
        }

        return 0;
    }

    /*Verifies a user is in the system (print statements and if conditionals only).*/
    public static boolean verifyW()
    {
        int id = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Slide member card into terminal (enter I.D. #).");
        id = input.nextInt();
        input.nextLine();

        if (verify(id) == 1)
        {
            System.out.println("Validated.");
            return true;
        }

        else if (verify(id) == -1)
            System.out.println("Member suspended.");

        else
            System.out.println("Invalid ID number.");

        return false;
    }
}