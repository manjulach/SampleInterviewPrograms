/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author SCHER20
 */
public class ListToSet {
    public static void main(String[] args){
        List<String> alphaList = new ArrayList<>();
        alphaList.add("A");
        alphaList.add("B");
        alphaList.add("C");
        alphaList.add("A");
        alphaList.add("B");
        System.out.println("List values .....");
        alphaList.stream().forEach((alpha) -> {
            System.out.println(alpha);
        });
        Set<String> alphaSet = new HashSet<>(alphaList);
        System.out.println("\nSet values .....");
        alphaSet.stream().forEach((alpha) -> {
            System.out.println(alpha);
        });
    }
}
