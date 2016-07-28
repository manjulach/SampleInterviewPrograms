/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Number;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SCHER20
 */
public class TwoMisingNumbers {
    
    public static void main(String args[]) {
        List list = new ArrayList();
        for (int i=1; i<=100; i++) {
            list.add(i);
        }
        
        list.remove(0);
        list.remove(10);
        Integer[] missing = getMissing(list);
        System.out.println(missing[0]+","+missing[1]);
        
    }
    private static Integer[] getMissing(List<Integer> li ){
        int n=li.size()+2;
        int expectedSum=n*(n+1)/2;
        int expectedSquaredSum=n*(n+1)*(2*n+1)/6;
        int sum=0;
        int squaredSum=0;
        for(Integer num:li)
        {
         sum+=num;
         squaredSum+=num*num;
        }
        int xplusy=expectedSum-sum;
        int xsquareplusysquare =expectedSquaredSum-squaredSum;
        int twoxy=xplusy*xplusy-xsquareplusysquare;
        int xminusy=(int)Math.sqrt(xsquareplusysquare-twoxy);
        int x=(xplusy+xminusy)/2;
        int y=(xplusy-xminusy)/2;
        return new Integer[]{x,y};
    }
    
}
