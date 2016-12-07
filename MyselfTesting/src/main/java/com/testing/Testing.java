/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.testing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author scher20
 */
public class Testing {
    
//    Q) Print the words (as comma separated) that are having letter ‘i’ or ‘a’ but not duplicates of ‘i’ or ‘a’. Also don’t print words that contain both ‘i’ and ‘a’.
//	INPUT: Writing is an act of faith but not a trick of grammar
//	OUTPUT: is, an, act, a, trick
    
    public static void main(String[] args) {
        String input = "Writing is an act of faith but not a trick of grammar";
        
        String[] array = input.split(" ");
        List<String> vowels = new ArrayList();
        
        
        
        
        for (String string : array) {
            if (string.contains("i") && !string.contains("a")) {
                vowels.add(string);
            } else if (!string.contains("i") && string.contains("a")) {
                vowels.add(string);
            }
        }
        List<String> re = new ArrayList();
        for (String vowel : vowels) {
            String[] si = vowel.split("i");
            if (si.length > 2)
                re.add(vowel);
            String[] sa = vowel.split("a");
            if (sa.length > 2)
                re.add(vowel);
            
        }
        vowels.removeAll(re);
        
        vowels.forEach(s -> System.out.println(s));
        
        
    }
}

