/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Java5.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Lower bounded wildcards
 *If you want a generic expression to accept all types which are “super” type of a particular type OR parent class of a particular class then you will use lower bound wildcard for this purpose, using ‘super’ keyword.

 *In below given example, I have created three classes i.e. SuperClass, ChildClass and GrandChildClass. There relationship is shown in code below. Now, we have to create a method which somehow get a GrandChildClass information (e.g. from DB) and create an instance of it. And we want to store this new GrandChildClass in an already existing list of GrandChildClasses.

 *Here problem is that GrandChildClass is subtype of ChildClass and SuperClass as well. So any generic list of SuperClasses and ChildClasses is capable of holding GrandChildClasses as well. Here we must take help of lower bound wildcard using ‘super‘ keyword.
 * @author SCHER20
 */
public class GenericsExample<T> {
     public static void main(String[] args)
   {
      //List of grand children
      List<GrandChildClass> grandChildren = new ArrayList<>();
      grandChildren.add(new GrandChildClass());
      addGrandChildren(grandChildren);
       
      //List of grand childs
      List<ChildClass> childs = new ArrayList<>();
      childs.add(new GrandChildClass());
      addGrandChildren(childs);
       
      //List of grand supers
      List<SuperClass> supers = new ArrayList<>();
      supers.add(new GrandChildClass());
      addGrandChildren(supers);
   }
    
   public static void addGrandChildren(List<? super GrandChildClass> grandChildren) 
   {
      grandChildren.add(new GrandChildClass());
      System.out.println(grandChildren);
   }
}
class SuperClass{
    
}
class ChildClass extends SuperClass{
    
}
class GrandChildClass extends ChildClass{
    
}