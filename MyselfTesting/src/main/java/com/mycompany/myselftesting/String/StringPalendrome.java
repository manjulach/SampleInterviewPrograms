/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.String;

import java.util.Scanner;

/**
 *
 * @author SCHER20
 */
public class StringPalendrome {
    
    public static void main(String args[])
  {
    String inputString;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input a string");
    inputString = in.nextLine();
 
    int length  = inputString.length();
    int i, begin = 0, end = length - 1, middle = (begin + end)/2;
 
    for (i = begin; i <= middle; i++) {
      if (inputString.charAt(begin) == inputString.charAt(end)) {
        begin++;
        end--;
      } else {
        break;
      }
    }
    if (i == middle + 1) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    } 	
  }
    
    // Broute force
//    public static void main(String[] args) {
//        String original, reverse= "";
//        
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter string to check for palendrome.");
//        
//        original = in.nextLine();
//        
//        int length = original.length();
//        
//        for (int i= length-1; i >=0;i--) {
//            reverse = reverse + original.charAt(i);
//        }
//        
//        if (original.equals(reverse)) System.out.println("It is palindrome!");
//        else System.out.println("It is not ");
//        
//    }
    
    
    
}
