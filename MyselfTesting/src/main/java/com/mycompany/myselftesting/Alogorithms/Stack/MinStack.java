/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Alogorithms.Stack;

/**
 *
 * @author SCHER20
 */
public class MinStack {
    
}

class Elem{
    public int value;
    public int min;
    public Elem next;
 
    public Elem(int value, int min){
        this.value = value;
        this.min = min;
    }
}
