/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Logan Kilburn
 */

package Solution10;

import java.util.Scanner;

public class Solution10 {
    /*
    Problem: Create a simple self-checkout system.
    Prompt for the prices and quantities of three items.
    Calculate the subtotal of the items.
    Calculate the tax using a tax rate of 5.5%
    Print out the line items with the quantity and total
    Print out the subtotal, tax amount, and total.

    Pseudocode: Prompt user for the amount of items of item 1
    Take in input and store it in amountItemOne
    Prompt user for the price of item 1
    Take in input and store it in priceItemOne
    Calculate the price of item 1 by using the product of amountItemOne and priceItemOne
    Store the product in subtotalItemOne

    Prompt user for the amount of items of item 2
    Take in input and store it in amountItemTwo
    Prompt user for the price of item 2
    Take in input and store it in priceItemTwo
    Calculate the price of item 1 by using the product of amountItemTwo and priceItemTwo
    Store the product in subtotalItemTwo

    Prompt user for the amount of items of item 3
    Take in input and store it in amountItemThree
    Prompt user for the price of item 3
    Take in input and store it in priceItemThree
    Calculate the price of item 1 by using the product of amountItemThree and priceItemThree
    Store the product in subtotalItemThree

    Calculate the subTotal by taking the sum of subtotalItemOne, subtotalItemTwo, subtotalItemThree
    and storing the subTotal in the variable subTotal
    Multiply the subTotal variable by the tax rate, or .055 and store the product in taxAmount
    Add subTotal and taxAmount together, and store the sum in totalAmount
    Print the totalAmount to the user
    Print the subTotal to the user
    Print the taxAmount to the user
     */
    private int price;
    private int amount;
    private int subTotal;


    private static int askUser(String input){
        System.out.println(input);
        Scanner readIn = new Scanner(System.in);

        return readIn.nextInt();
    }

    public static void main(String[] args){
        Solution10 itemOne = new Solution10();
        Solution10 itemTwo = new Solution10();
        Solution10 itemThree = new Solution10();

        double taxRate = .055;

        itemOne.amount = askUser("What is the amount of item one?");
        itemOne.price = askUser("What is the price of item one");
        itemOne.subTotal = itemOne.amount * itemOne.price;


        itemTwo.amount = askUser("What is the amount of item two?");
        itemTwo.price = askUser("What is the price of item two");
        itemTwo.subTotal = itemTwo.amount * itemTwo.price;


        itemThree.amount = askUser("What is the amount of item three?");
        itemThree.price = askUser("What is the price of item three");
        itemThree.subTotal = itemThree.amount * itemThree.price;

        double subTotal = Math.round((itemOne.subTotal + itemTwo.subTotal + itemThree.subTotal) * 100.0) / 100.0;
        double tax = Math.round((subTotal * taxRate) * 100.0) / 100.0;
        double totalAmount = Math.round((subTotal + tax) * 100.0) / 100.0;

        System.out.println("Subtotal: $" + subTotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + totalAmount);


    }
}


