/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Alogorithms.LinkedList;

/**
 *
 * @author Sreeja
 */
public class LinkedListMinMax {
    static Node head = null;
    void getMinMaxAvg() {
        Node currNode = head;
        if (currNode == null) return;
        int min = head.data;
        int max = head.data;
        int sum = head.data;
        int count = 1;
        while (currNode.next != null) {
            if (currNode.data < min) min = currNode.data;
            if (currNode.data > max) max = currNode.data;
            currNode = currNode.next;
            sum += currNode.data;
            count += 1;
        }
        System.out.println("Min->" + min);
        System.out.println("Max->" + max);
        System.out.println("Avg->" + sum/count);
    }
    
    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(6);
        head.next.next = new Node(15);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(20);
        LinkedListMinMax max = new LinkedListMinMax();
        max.getMinMaxAvg();
    }
  
}
