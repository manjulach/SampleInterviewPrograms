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
public class ReverseNumber {
    public static void main(String args[]) {
        System.out.println("Enter number ");
        int number = new Scanner(System.in).nextInt();
        
        System.out.println(reverse(number));
    }
    
    private static int reverse(int n) {
        int reverse = 0;
        int remainder = 0;
        do {
            remainder = n % 10;
            reverse = reverse * 10 +remainder;
            n = n/10;
        } while (n> 0);
        return reverse;
    }
}
