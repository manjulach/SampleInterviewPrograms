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
public class PalindromeNumber {
    public static void main(String args[]) {
        System.out.println("Enter number");
        int palin = new Scanner(System.in).nextInt();
        
        System.out.println(isPalnidrome(palin));
    }
    
    private static boolean isPalnidrome(int n) {
        int palind = n;
        int reverse = 0;
        while(palind != 0) {
            int remainder = palind % 10;
            reverse = reverse * 10 + remainder;
            palind = palind / 10;
        }
        if (reverse == n)
            return true;
        return false;
    }
}
