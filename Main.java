package p3;
//JohnAngeloOliver Co 01/21/2016 CSC 164
//Menu Program

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  -------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  =====================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ||             Johnway             ||");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ==            Eat Fresh!           ==");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ||             Johnway             ||");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  =====================================");
        System.out.println(("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t") + ("  -------------------------------------") );

        Scanner selection = new Scanner(System.in);

        char option;

        do
        {
            System.out.print("\n\n"
                                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tChoose from the following" + "\n\n"
                                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(H)am" + "\n"
                                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(R)oast Beef" + "\n"
                                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(S)alami"
                                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(T)una" + "\n"
                                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(D)one"
                                + "\n\n"
                                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter Choice: ");

            // Gets user input and converts it to uppcare
            String choice = selection.next();
            choice = choice.toUpperCase();

            //Gets the first character of the user input
            option = choice.charAt(0);


        }while(option != 'D'|| option != 'T');

    }

}
