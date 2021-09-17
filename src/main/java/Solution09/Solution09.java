/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Logan Kilburn
 */
package Solution09;

import java.util.Scanner;

public class Solution09 {
    /*
    Problem: Calculate Gallons of Paint needed to paint the ceiling of a room.
    Prompt for the length and width, and assume one gallon covers
    350 square feet. Display the number of gallons needed to paint the ceiling as a whole number

    Pseudocode: Prompt the user for the length of the room
    Take in input from the user and store it in the variable roomLength
    Prompt the user for the width of the room
    Take in input from the user and store it in the variable roomWidth
    Calculate the square feet of paint needed by multiplying roomLength and roomWidth, and store the product in roomArea
    Run a loop that subtracts 350 from roomArea until you roomArea is less than 350
    Add 1 to numOfGallons every time the loop repeats
    If there is leftover square feet that is less than 350, add 1 to numOfGallons
    Print the numOfGallons to the user
     */

    public static void main(String[] args){
        System.out.println("What is the length of the room?");
        Scanner input;
        input = new Scanner(System.in);
        int roomLength = input.nextInt();

        System.out.println("What is the width of the room?");
        Scanner input2;
        input2 = new Scanner(System.in);
        int roomWidth = input2.nextInt();

        int roomArea = roomLength * roomWidth;
        int numOfGallons = 0;
        int i = 0;

        for(i = roomArea; i >= 350; i -= 350){
            numOfGallons++;
        }
        if(i <= 350){
            numOfGallons++;
        }

        System.out.println("You will need to purchase " + numOfGallons + " of paint to cover " + roomArea + " square feet. ");
    }
}
