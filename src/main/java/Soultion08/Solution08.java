/*
* UCF COP3330 Fall 2021 Assignment 2 Solution
* Copyright 2021 Logan Kilburn
 */

package Soultion08;

import java.util.*;

public class Solution08 {
    /*Problem: Write a program to evenly divide pizzas.
    Prompt for the number of people, the number of pizzas,
    and the number of slices per pizza. Ensure that the number of pieces comes out even.
    Display the number of pieces of pizza each person should get.
    If there are leftovers, show the number of leftover pizzas.

    Pseudocode: Ask how many people to the user
    Take input from user and store in a variable numOfPeople
    Ask how many pizzas there are
    Take input from the user and store it in a variable numOfPizzas
    Ask for number of slices in each pizza
    Take input from the user and store it in a variable numOfSlices
    If numOfSlices is not even, then break the program
    Multiply numOfPizzas and numOfSlices together, and store the product in the variable totalSlices
    Divide totalSlices and numOfPeople together, and store the quotient in the variable totalSlicePerPerson
    Mod totalSlices and numOfPeople together, and store the answer in the variable numLeftovers
    Print out to the user, showing totalSlices, totalSlicePerPerson, and numLeftovers
     */
    public static void main(String[] args){
        System.out.println("How many people?");
        Scanner input;
        {
            input = new Scanner(System.in);
        }
        int numOfPeople = input.nextInt();

        System.out.println("How many pizzas do you have?");
        Scanner input2;
        {
            input2 = new Scanner(System.in);
        }
        int numOfPizzas = input2.nextInt();

        System.out.println("How many slices per pizza?");
        Scanner input3;
        {
            input3 = new Scanner(System.in);
        }
        int numOfSlices = input3.nextInt();

        int totalSlices = numOfSlices * numOfPizzas;
        int totalSlicesPerPerson = totalSlices / numOfPeople;
        int totalLeftovers = totalSlices % numOfPeople;

        System.out.println(numOfPeople + " people with " + numOfPizzas + " pizzas " + "(" + totalSlices + " slices)");
        System.out.println("Each person gets " + totalSlicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + totalLeftovers + " leftover pieces.");

    }





}
