/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Number;

import java.util.Scanner;

/**
 *
 * @author Sreeja
 */
public class FibnacciCalc {
    public static void main(String args[]){
        System.out.println("Enter number ");
        int input = new Scanner(System.in).nextInt();
        
        for (int i=1; i<= input;i++){
            System.out.println("---->"+ fib2(i));
            //System.out.println("---->"+ fibonacci(i));
        }
    }
    public static int fibonacci(int number){
        if (number == 1 || number == 2)
            return 1;
        return fibonacci(number-1) + fibonacci(number-2);
    }
    public static int fib2(int number) {
        if(number == 1 || number == 2)
            return 1;
        
        int f1 = 1, f2 = 1, f3 = 1;
        for(int i = 3; i <= number ; i++){
            f3 = f1+f2;
            
            f1=f2;
            f2=f3;
        }
        return f3;
    }
}
