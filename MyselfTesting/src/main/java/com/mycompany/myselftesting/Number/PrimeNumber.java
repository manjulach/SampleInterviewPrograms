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
public class PrimeNumber {
    public static void main(String args[]) {
        System.out.println("Enter number");
        int limit = new Scanner(System.in).nextInt();
        System.out.println("Prime numbers from 1 to " + limit);
        for(int number =2; number <= limit; number++) {
            if(isPrime(number))
                System.out.println(number);
        }
    }
    private static boolean isPrime(int number) {
        for (int i = 2; i< number; i++) {
            if (number % 2 == 0) 
                return false;
        }
        return true;
    }
}
