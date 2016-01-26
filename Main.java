package p3;
//JohnAngeloOliver Co 01/21/2016 CSC 164
//Menu Program

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  -------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  =====================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ||             Johnway             ||");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ==            Eat Fresh!           ==");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ||             Johnway             ||");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  =====================================");
        System.out.println(("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t") + ("  -------------------------------------"));

        Scanner selection = new Scanner(System.in);
        Scanner quantity = new Scanner(System.in);
        char option;
        double price = 0;
        String sandwich = "";
        int i = 0;
        double totalPrice = 0;

        String data[] = new String[6];

        do
        {
            System.out.print("\n\n"
                    + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tChoose from the following" + "\n\n"
                    + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(H)am" + "\n"
                    + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(R)oast Beef" + "\n"
                    + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(S)alami" + "\n"
                    + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(T)una" + "\n"
                    + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(D)one"
                    + "\n\n"
                    + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter Choice: ");

            // Gets user input and converts it to uppcase
            String choice = selection.next();
            choice = choice.toUpperCase();

            //Gets the first character of the user input
            option = choice.charAt(0);

            switch (option)
            {
                //Ham , prompts for quantity
                case 'H':
                    System.out.println("How many sandwiches would you like?\n" + "Enter Quantity: ");
                    int x = quantity.nextInt();
                    price = x*5.50;
                    totalPrice += price;
                    sandwich = "Ham";
                    data[i] = x + " " + sandwich + " Sandwich Price Total*quantity: " + "$" + price;
                    i++;
                    break;

                //Roast Beef , prompts for quantity
                case 'R':
                    System.out.println("How many sandwiches would you like?\n" + "Enter Quantity: ");
                    x = quantity.nextInt();
                    price = x*6.00;
                    totalPrice += price;
                    sandwich = "Roast Beef";
                    data[i] = x + " " + sandwich + " Sandwich Price Total*quantity: " + "$" + price;
                    i++;
                    break;

                //Salami , prompts for quantity
                case 'S':
                    System.out.println("How many sandwiches would you like?\n" + "Enter Quantity: ");
                    x = quantity.nextInt();
                    price = x*5.25;
                    totalPrice += price;
                    sandwich = "Salami";
                    data[i] = x + " " + sandwich + " Sandwich Price Total*quantity: " + "$" + price;
                    i++;
                    break;

                //Tuna , prompts for quantity
                case 'T':
                    System.out.println("How many sandwiches would you like?\n" + "Enter Quantity: ");
                    x = quantity.nextInt();
                    price = x*5.00;
                    totalPrice += price;
                    sandwich = "Tuna";
                    data[i] = x + " " + sandwich + " Sandwich Price Total*quantity: " + "$" + price;
                    i++;
                    break;

                //Done Ordering
                case 'D':
                    price += 0;
                    totalPrice += price;
                    break;

                default:
                    price += 0;
                    totalPrice += price;
                    System.out.println("Option " + option + " is invalid.");

            }

            // Prints the user order information
            if (price != 0)
            {
                System.out.printf("%s Sandwich Price: $%.2f\n", sandwich,price);
            }


        } while (option != 'D');

        System.out.println("\n\n\n");

        for (int counter = 0; counter < i; counter++)
        {
            System.out.println(data[counter] + "0");
        }
        System.out.println("The total price is: " + totalPrice);
    }

}
