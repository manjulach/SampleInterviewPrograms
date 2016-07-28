/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Alogorithms.sort;

/**
 *
 * @author Sreeja
 */
public class QuickSort {
   static int[] a = {5,3,7,1,9,2,0,8,4,6};
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        qs.sorting(0, a.length-1);
        for(int i:a){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public void sorting(int l, int r){
        if (l<r) {
            int q = partition(l, r);
            sorting(l, r-1);
            sorting(l+1, r);
        }
    }
    
    public int partition(int l, int r) {
        System.out.println("pivot--->"+ a[r]);
        int pivot = a[r];
        System.out.println("pivot--->"+ pivot);
        int i = 0;
        for (int j=1; j< r-1; j++) {
            if (a[j] < pivot) {
                i++;
                exchange(i++, j);
                //swap i to j and vice versa
            }
        }
        //swap i++ to pivot and vice versa
        exchange(i++, pivot);
        return i++;
    }
    private void exchange(int m, int n){
        int temp = a[m];
        a[m] = a[n] ;
        a[n] = temp;
    }
}
