/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.sampleapplication;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Sreeja
 */
public class VowelCounter {
    public static void main(String args[]){
        System.out.println("Please enter text");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        vowel(input);
//        char[] letters = input.toCharArray();
//        int count = 0;
//        for (char letter : letters) {
//            switch (letter) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u': count++;
//            break;
//            default: 
//            
//            }   
//        }
//        System.out.println("Vowels are "+ count);
//        int diff = letters.length - count;
//        System.out.println("Consonents are "+ diff);
    }
    
    private static void vowel(String input){
        int vowels = 0,consents = 0;
        char[] array = input.toCharArray();
        for (char c : array) {
            int unicode = (int)c;
            System.out.println("char -->" + c);
            System.out.println("char unicode -->" + unicode);
            if ((unicode >= 65 && unicode <=90) || (unicode >= 97 && unicode <= 122)) {
                if (Pattern.matches("[AEIOUaeiou]" , Character.toString(c)))
                    vowels++;
                else 
                    consents ++;
            }
                
        }
        System.out.println("Vowels--->"+ vowels);
        System.out.println("consents--->"+ consents);
        
    }
    
}
