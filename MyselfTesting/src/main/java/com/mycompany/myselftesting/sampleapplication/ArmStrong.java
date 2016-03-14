/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.sampleapplication;

import java.util.Scanner;

/**
 * This is  ArmStrong problem
 * @author Sreeja
 */
public class ArmStrong {
    public static void main(String args[]){
        System.out.println("Please enter number");
        int number = new Scanner(System.in).nextInt();
        
        System.out.println(isArmStrong(number));
        
        
    }
    
    private static boolean isArmStrong(int number) {
        int result = 0;
        int org = number;
        while(number !=0){
            int remainder = number%10;
            result = result +remainder * remainder *remainder;
            number = number/10;
        }
        return (org == result);
    }
}
