/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.lamda;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author scher20
 */
public class Lamda {
    public static void main(String[] args) {
      System.out.println("testing Lamda's");
      System.out.println("=== RunnableTest ===");
     // Anonymous Runnable
     Runnable r1 = () -> {
         System.out.println("Hello world one!");
        };
     // Lambda Runnable
     Runnable r2 = () -> System.out.println("Hello world two!");
     // Run em!
     r1.run();
     r2.run();
    }
    
}
