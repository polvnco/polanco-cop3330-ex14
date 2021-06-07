/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assigment1.example;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex14
{
    public static void main( String[] args )
    {
        Locale usa = new Locale("en", "US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        float tax = (float) 1.055;

        System.out.print( "What is the order amount? " );
        Scanner orderAmount = new Scanner(System.in);
        float amount = orderAmount.nextFloat();

        System.out.print( "What is the state? " );
        Scanner state = new Scanner(System.in);
        String stateUSA = state.nextLine();

        float totalAmounts;
        float actualTax;

        if (stateUSA.equals("WI")){
            totalAmounts = amount * tax;
            actualTax = totalAmounts - amount;
            System.out.println("The subtotal is " + dollarFormat.format(amount) + ".");
            System.out.println("The tax is " + dollarFormat.format(actualTax) + ".");
            System.out.println("The total is " + dollarFormat.format(totalAmounts) + ".");
            return;
        }
        System.out.println("The total is " + dollarFormat.format(amount) + ".");

    }
}
