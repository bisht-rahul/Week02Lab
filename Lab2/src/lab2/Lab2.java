/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Rahul Bisht
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        double num1 = 0;
        double num2 = 0;
        double sum = 0;

        System.out.println("Enter a number: ");
        num1 =  scan.nextDouble();
        
        System.out.println("Enter second number: ");
        num2 = scan.nextDouble();
        
        sum = num1 + num2;
        
        System.out.println("The sum of both the numbers are: " + sum);
        
        
    }
    
}
