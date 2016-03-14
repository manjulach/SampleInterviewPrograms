/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.sampleapplication;

/**
 *
 * @author Sreeja
 */
public class StringCount {
    
    public static void main(String[] args) {
        String str = "India is my country.  I love my county. ";
        String[] strArray = str.replaceAll("  "," ").split(" ");
        System.out.println("WordCount-->"+ strArray.length);
    }
    
}
