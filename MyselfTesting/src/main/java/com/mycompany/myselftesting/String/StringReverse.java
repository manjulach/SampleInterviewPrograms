/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.String;

/**
 *
 * @author Sreeja
 */
public class StringReverse {
    
    public static void main(String args[]) {
        String str= "Sony is going to introduce Internet TV soon";
        
        long before1 = System.currentTimeMillis();
        String reverseStr = new StringBuffer(str).reverse().toString();
        long after1  = System.currentTimeMillis();
        System.out.println(after1-before1);
        System.out.println("StringBuffer string -->" + reverseStr);
        
        long before2 = System.currentTimeMillis();
        reverseStr = reverseRecursively(str);
        long after2  = System.currentTimeMillis();
        System.out.println(after2-before2);
        System.out.println("StringBuffer reverseRecursively string -->" + reverseStr);
        
        long before3 = System.currentTimeMillis();
        reverseStr = reverse(str);
        long after3  = System.currentTimeMillis();
        System.out.println(after3-before3);
        System.out.println("StringBuffer reverse string -->" + reverseStr);
        
        long before4 = System.currentTimeMillis();
        reverseStr = getReversedString(str);
        long after4  = System.currentTimeMillis();
        System.out.println(after4-before4);
        System.out.println("StringBuffer getReversedString string -->" + reverseStr);
        
        
        
        
    }
    
    public static String reverseRecursively(String str){
        if (str.length() < 2){
            return str;
        }
        return reverseRecursively(str.substring(1))+ str.charAt(0);
    }
    
    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();
        for (int i = strChars.length-1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }
        return strBuilder.toString();
    }
    
    public static String getReversedString(String str) {
        char[] chars = str.toCharArray();
        for (int i=0; i< chars.length/2;i++) {
            char temp1 = chars[i];
            
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = temp1;
        }
        return new String(chars);
    }
}
