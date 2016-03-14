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
public class LinkedListSplit {
    public static Node head;
    public static Node headA;
    public static Node headB;
    
    public void AlterSplit(){
        Node currNode = head;
        if (currNode == null || currNode.next == null) {
            return ;
        }
        headA = currNode;
        headB = currNode.next;
        
        while(currNode != null && currNode.next != null) {
            Node temp = currNode.next;
            currNode.next = temp.next;
            if (currNode.next != null && currNode.next.next  != null) {
                temp.next = currNode.next.next;
            } else {
                temp.next = null;
                return;
            }
            currNode = currNode.next;
        }
    }

    public static void main(String args[]) throws Exception{
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        
        LinkedListSplit ll = new LinkedListSplit();
        System.out.println("Before Head");
        ll.print(head);
        ll.AlterSplit();
        System.out.println("After Head");
        ll.print(head);
        System.out.println("headA");
        ll.print(headA);
        System.out.println("headB");
        ll.print(headB);
    }
    public void print(Node x){
        while(x != null) {
            System.out.println("--->" + x.data);
            x = x.next;
        }
        
    }
}
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    

