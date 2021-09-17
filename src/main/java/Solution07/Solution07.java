/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Logan Kilburn
 */
package Solution07;

import java.util.Scanner;

public class Solution07 {
    /*
    Problem: Create a Program that calculates the area of a room.
    Prompt the user for the length and width of the room in feet.
    Then display the area in both square feet and square meters

    Pseudocode: Print to the user what the length of the room is
    Take input from the user and store it in the double variable roomLength
    Print to the user what the width of the room is
    Take input from the user and store it in the double variable roomWidth
    Multiply the roomWidth and roomLength to calculate the area of the room, and store the product in the double variable roomArea
    Convert feet squared to meter squared by finding the product of roomArea and .09290304
    Print to the user the size of the room in square feet
    Print to the user the size of the room in square meters
     */

    public static void main(String[] args){
        System.out.println("What is the length of the room in feet?");
        Scanner input;
        input = new Scanner(System.in);
        int roomLength = input.nextInt();

        System.out.println("What is the width of the room in feet?");
        Scanner input2;
        input2 = new Scanner(System.in);
        int roomWidth = input2.nextInt();

        double feetToMetersConstant = 0.09290304;

        int roomAreaInFeet = roomLength * roomWidth;
        double roomAreaInMeters = roomAreaInFeet * feetToMetersConstant;

        System.out.println("You entered dimensions of " + roomLength + " feet by " + roomWidth + " feet.");
        System.out.println("The area is: \n" + roomAreaInFeet + " square feet\n" + roomAreaInMeters + " square meters");


    }
}
