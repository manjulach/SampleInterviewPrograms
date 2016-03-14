/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Alogorithms;

import java.util.Stack;

/**
 * I am an Indian
 * am an indian I
 * an Indian am I
 * Indian an am I
 * 
 * @author Sreeja
 */

public class StringReverse {
    public static void main(String args[]) {
        String a = "I am an Indian";
        
        Stack<String> stack = new Stack<>();
        String[] temp;
        String delimiter = " ";
        temp = a.split(delimiter);
        for (int i = 0; i < temp.length; i ++) {
            int k = i;
            for (int l = 0; l<= k; l++) {
                stack.push(temp[l]);
            }
            
            for (int j = i+1; j < temp.length; j++) {
                System.out.println(temp[j] + " ");
            } 
            while(! stack.isEmpty()) {
                System.out.println(stack.pop() + " ");
            }
            System.out.println();
        }
        
        
        
    }
    
}
