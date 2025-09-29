package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SandwichApp {
    public static void main(String[] args) {
        String base;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to our Sandwich Shop! What would size base would you like?");
        System.out.println("Enter r for regular size and l for large size");
        base = myScanner.next();

        if (base.equalsIgnoreCase("r")){
            System.out.println("You selected Regular size!");
        }else if (base.equalsIgnoreCase("l")){
            System.out.println("You selected Large size!");
        }else{
            System.out.println("Invalid option. Shop will not serve you.");
            System.exit(1);
        }





        }
    }