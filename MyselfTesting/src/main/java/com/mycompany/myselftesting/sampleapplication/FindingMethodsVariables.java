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
public class FindingMethodsVariables {
//    public int i = 10;
//    public int j = 10;
//    public int k = 10;
//    public int l = 10;
//    public int m = 10;
    
    public void a(){
        System.out.println("aaaaa");
    }
    public void b(){
        System.out.println("bbbb");
    }
    public void c(){
        System.out.println("ccccc");
    }
    public void d(){
        System.out.println("ddddd");
    }
    public void e(){
        System.out.println("eeeee");
    }
    public static void main(String args[]) {
        
        System.out.println(FindingMethodsVariables.class.getMethods().length);
        System.out.println(FindingMethodsVariables.class.getFields().length);
        
    }
    
}
