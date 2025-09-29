package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SandwichApp {
    public static void main(String[] args) {
        //declared all my variables
        String base;
        double total = 0;
        Scanner myScanner = new Scanner(System.in);
        int age;
        boolean loaded;


        System.out.println("Welcome to our Sandwich Shop! What would size base would you like?");
        System.out.println("Enter r for regular size and l for large size");
        base = myScanner.next();

        if (base.equalsIgnoreCase("r")){
            System.out.println("You selected Regular size!");
            total = 5.45;
        }else if (base.equalsIgnoreCase("l")){
            System.out.println("You selected Large size!");
            total = 8.95;
        }else{ //basic error handling. It ends the program if it receives invalid input.
            System.out.println("Invalid option. You lost your opportunity to place an order");
            System.exit(1);
        }


        //applying age based discounts
        System.out.println("How old are you?");
        age = myScanner.nextInt();
        if (age <= 17){
            System.out.println("Adding a 10% discount since you are under 18");
            total *= 0.9;
        }//I could have used if else here but it reads and logically flows better with two if conditions vs if else
        if (age >= 65){
            System.out.println("Adding a 20% discount since you are a senior");
            total *= 0.8;
        }
        System.out.println("Your total is: $" + total);

        }
    }