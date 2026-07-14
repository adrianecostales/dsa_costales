/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.costales_program;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class Costales_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Hello World!");
        System.out.println("Costales, Francis Adriane T.");
        
        
        System.out.println("Enter a number:");
        int x = input.nextInt();
        
        System.out.println("Enter a number:");
        int y = input.nextInt();
        
        int sum = x + y;
        int diff = x - y;
        int prod = x * y;
        double quo = x / y;
        double mod = x % y;
        
        System.out.println("Sum is: " + sum); 
        System.out.println("Difference is: " + diff);
        System.out.println("Product is: " + prod);
        System.out.println("Quotient is: " + quo);
        System.out.println("Modulus is: " + mod);
    }
}
