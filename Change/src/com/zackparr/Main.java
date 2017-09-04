package com.zackparr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        double cost;
        double paid;
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;

        try {
            do {
                System.out.println("Please enter the total cost: ");
                cost = scan.nextDouble();
                System.out.println("Please enter the amount paid: ");
                paid = scan.nextDouble();
            } while (cost > paid);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            main(args);
            return;
        }

        int change = (int) Math.round((paid-cost) * 100);

        while(change>=100){
            dollars++;
            change -= 100;
        }

        while(change>=25){
            quarters++;
            change -= 25;
        }

        while(change>=10){
            dimes++;
            change -= 10;
        }

        while(change>=5){
            nickles++;
            change -= 5;
        }

        while(change>=1){
            pennies++;
            change -= 1;
        }

        System.out.println("\nPlease hand the customer: ");
        System.out.println(dollars + " Dollars");
        System.out.println(quarters + " Quarters");
        System.out.println(dimes + " Dimes");
        System.out.println(nickles + " Nickles");
        System.out.println(pennies + " Pennies");
    }

}
