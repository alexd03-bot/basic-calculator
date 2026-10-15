package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        //Exercise 4

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first number: \n");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: \n");
        int num2 = scanner.nextInt();

        //Possible calculations:
        //(A)dd(S)ubtract(M)ultiply(D)ivide

        System.out.println("Please select an option: \n");

        System.out.println(num1 * num2);






    }

}
