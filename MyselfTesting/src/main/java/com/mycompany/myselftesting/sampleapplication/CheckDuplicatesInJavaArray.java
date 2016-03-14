/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.sampleapplication;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Sreeja
 */
public class CheckDuplicatesInJavaArray {
    
    public static void main(String args[]){
        String[] withDuplicates = new String[] {"One", "Two", "Three", "One", "four", "Five", "Six", "Seven"};
        String[] withOutDuplicates = new String[] {"One", "Two", "Three"};
        
        long beforebruteforce = System.currentTimeMillis();
        bruteforce(withDuplicates);
        long afterbruteforce = System.currentTimeMillis();
        System.out.println("Latency for bruteforce--->"+ bruteforce(withDuplicates)+"----"+(new Date(beforebruteforce).getTime() - new Date(afterbruteforce).getTime()));
        
        long beforeSet = System.currentTimeMillis();
        checkDuplicateUsingSet(withDuplicates);
        long afterSet = System.currentTimeMillis();
        System.out.println("Latency for Set--->"+  checkDuplicateUsingSet(withDuplicates)+"----"+(new Date(afterSet).getTime() - new Date(beforeSet).getTime()));
        
        long before = System.currentTimeMillis();
        checkDuplicateUsingAdd(withDuplicates);
        long after = System.currentTimeMillis();
        System.out.println("Latency for --->"+  checkDuplicateUsingAdd(withDuplicates)+"----"+(new Date(after).getTime() - new Date(before).getTime()));
        
        
    }
    public static boolean bruteforce(String[] input) {
        for(int i=0;i<input.length; i++){
            for(int j=0; j< input.length; j++) {
                if (input[i].equals(input[j]) && i != j)
                    return true;
                
            }
        }
        return true;
    }
    
    public static boolean checkDuplicateUsingSet(String[] input) {
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        return inputList.size() > inputSet.size();
    }
    
    public static boolean checkDuplicateUsingAdd(String[] input) {
        Set tempSet = new HashSet();
        for (String str : input){
            if(!tempSet.add(str))
                return true;
        }
        return false;
    } 
}
