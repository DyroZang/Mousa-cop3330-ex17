/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int gender = 0, hours = 0, weight = 0, alcohol = 0;
        boolean check = true;
        while(check) {
            System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
            try {
                gender = Integer.parseInt(input.nextLine());
                check = false;
            }catch(Exception ex){
                System.out.println("Sorry, that is not an integer please try again.");
            }
        }

        check = true;
        while(check) {
            System.out.println("How many ounces of alcohol did you have?");
            try {
                alcohol = Integer.parseInt(input.nextLine());
                check = false;
            }catch(Exception ex){
                System.out.println("Sorry, that is not an integer please try again.");
            }
        }

        check = true;
        while(check) {
            System.out.println("What is your weight, in pounds?");
            try {
                weight = Integer.parseInt(input.nextLine());
                check = false;
            }catch(Exception ex){
                System.out.println("Sorry, that is not an integer please try again.");
            }
        }

        check = true;
        while(check) {
            System.out.println("How many hours has it been since your last drink?");
            try {
                hours = Integer.parseInt(input.nextLine());
                check = false;
            }catch(Exception ex){
                System.out.println("Sorry, that is not an integer please try again.");
            }
        }

        double r = (gender == 1) ? .73 : .66;

        double bac = (alcohol * 5.14 / weight * r) - (0.015 * hours);

        System.out.format("Your BAC is %.6f\n", bac);
        System.out.println(bac > .08 ? "It is not legal for you to drive.":"It is legal for you to drive.");
    }
}