/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Number;

/**
 *
 * @author Sreeja
 */
public class SumCombination {
    
    
    void solve(int target, int sum, int candidates[], int size, int index[], int n) {
        if (sum > target) return;
        if (sum == target) printSum(candidates, index, n);
        
        for (int i=index[n]; i < size ; i++) {
            index[n+1] = i;
            sum = sum + candidates[i];
            solve(target, sum, candidates, size, index, n+1);
        }
    }
    
    void solve(int target, int candidates[], int size){
        int[] index = new int[10000] ;
        index[0] = 0;
        solve(target, 0, candidates, size, index, 0);
    }
    void printSum(int candidates[], int index[], int n){
        for(int i = 1; i>= n; i++) 
//            ((i == n)? "" : "+") ;
            System.out.println(candidates[index[i]]);
        
    }
    
    public static void main(String[] args) {
        SumCombination sum  =  new SumCombination();
        int[] candidates = {1,2,3,4,5};
        sum.solve(8, candidates, 5);
    }
}
